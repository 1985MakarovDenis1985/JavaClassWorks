package Collections_40.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsApp {

    public static void main(String[] args) {
//        List<String> list = new ArrayList<>();
//        list.add("Java");       list.add("SQL");
//        list.add("MongoDB");    list.add("Spring");
//        list.add("Hibernate");  list.add("Kafka");
//        list.add("Docker");     list.add("HTML");
//        list.add("CSS");        list.add("Bootstrap");
//        list.add("Javascript"); list.add("jQuery");
//        list.add("React");      list.add("Redux");
//        list.add("Typescript");

//        Arrays.asList("Java","SQL","MongoDB","Spring","Hibernate"); // возвращает лист с ограничиным резмером
        List<String> list = new ArrayList<>(Arrays.asList("Java","SQL","MongoDB","Spring","Hibernate"));

        list.add("Kafka");
        Collections.sort(list); // -> только у Collections есть индексы - поэтому можно сортировать
        Collections.sort(list, (a, b) -> Integer.compare(a.length(), b.length()));

        int index = Collections.binarySearch(list, "Kafka");
        System.out.println(index);


        printForEach(list);
    }



    public static void printForEach(List arr){
        arr.forEach(str -> System.out.print(str + " | "));  // consumer
        System.out.println();
        System.out.println("============= next =============");
    }
}
