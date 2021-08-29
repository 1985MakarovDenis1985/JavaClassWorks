package cotroller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class JavaListApp {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("Java"); list.add("SQL");
        list.add("MongoDB");list.add("Spring");
        list.add("Hibernate");list.add("Kafka");
        list.add("Docker");list.add("HTML");
        list.add("CSS");list.add("Bootstrap");
        list.add("Javascript");list.add("jQuery");
        list.add("React");list.add("Redux");
        list.add("Typescript");
        printForEach((LinkedList) list);
        /* Wrong way*/
//        for (String str: list) {
//            if (str.startsWith("Java")){
//                list.remove(str);
//            };
//        }
        /* Normal */
//        Iterator<String> iterator = list.iterator();
//        while (iterator.hasNext()){
//            String str = iterator.next();
//            if (str.startsWith("Java")){
//                iterator.remove();
//            }
//        }
        /* True way*/
        list.removeIf(s -> s.startsWith("Java"));

        printForEach((LinkedList) list);


    }



    public static void printForEach(LinkedList arr){
        arr.forEach(str -> System.out.print(str + " | "));  // consumer
        System.out.println();
        System.out.println("============= next =============");
    }
}
