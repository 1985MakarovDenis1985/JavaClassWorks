package telran.ReadWriteBlock.dao;

import telran.ReadWriteBlock.model.Person;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.stream.Collectors;

public class PersonMap implements IPerson{
    Map<Integer, Person> persons = new HashMap<>();
    ReadWriteLock rwLock = new ReentrantReadWriteLock();
    Lock read = rwLock.readLock();
    Lock write = rwLock.writeLock();

    @Override
    public boolean addPerson(Person person) {
//        write.lock();
//        try {
//            return persons.putIfAbsent(person.getId(), person) == null;
//        }finally {
//            write.unlock();
//        }

        read.lock();
        try {
            if (!persons.containsKey(person.getId())){
                write.lock();
                try{
                    persons.put(person.getId(), person);
                    return true;
                } finally {
                    write.unlock();
                }
            }
            else {
                return false;
            }
        }finally {
            read.unlock();
        }
    }

    @Override
    public Person getPerson(int id) {
        read.lock();
        try{
            return persons.get(id);
        }finally {
            read.unlock();
        }
    }

    @Override
    public List<Person> getAllPersons() {
        read.lock();
        try{
            return persons.values().stream().collect(Collectors.toList());
        } finally {
            read.unlock();
        }
    }
}
