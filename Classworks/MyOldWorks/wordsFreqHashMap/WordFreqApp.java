package wordsFreqHashMap;

import java.util.*;

public class WordFreqApp {
    public static void main(String[] args) {
        String[] words = {"adc", "ab", "limn", "limn", "ab", "limn", "a"};
        displayWordsFrequency(words);
    }

    private static void displayWordsFrequency(String[] words) {
//        Map<String, Integer> res = new HashMap<>();
//        for (int i = 0; i < words.length; i++) {
//            if (res.containsKey(words[i])){
//                res.put(words[i], res.get(words[i]) + 1);
//            } else {
//                res.put(words[i], 1);
//            }
//        }
//        Set<Map.Entry<String, Integer>> entries = res.entrySet();
//        for (Map.Entry<String, Integer> entry : entries) {
//            System.out.print(entry.getKey() + " : " + entry.getValue() + " | ");
//        }

//        System.out.println(" ============ ");

        // ------ //

        Map<String, Integer> res2 = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
//            if (res2.containsKey(words[i])) {
//                res2.put(words[i], res2.get(words[i]) + 1);
//            } else {
//                res2.put(words[i], 1);
//            }

//          // ---- putIfAbsent
//            if (res2.putIfAbsent(words[i], 1) != null){ // вариант нахождения
//                res2.put(words[i], res2.get(words[i])+1);
//            }

            // ---- computeIfPresent , computeIfAbsent
//            res2.computeIfPresent(words[i], (k, v) -> v + 1);
//            res2.computeIfAbsent(words[i], k -> 1 );

            // ---- marge
            res2.merge(words[i], 1, (oldValue, value)-> oldValue + value);
        }

        // ------ //
        Set<Map.Entry<String, Integer>> entries2 = res2.entrySet();
        List<Map.Entry<String, Integer>> list = new ArrayList(entries2);

        list.sort((a, b) -> {
            int res = b.getValue().compareTo(a.getValue());
            return res != 0 ? res : b.getKey().length() - a.getKey().length();
        });

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        // ------ //

        // put -> если есть - заменяет
        // putIfAbsent -> если есть ни делает ни чего и вернет елемент | если нет вставит и вернет null
        // computeIfAbsent -> если ключа нет - вторым арументом передаем функцию (ключ, что нужно вернуть) / добавит новый ключ + вернет новое значение
        // computeIfPresent -> если ключ есть - вторым передаем 2 аргумента (ключб значение -> возвр новое)
        // marge -> ключ,  value, функцию (старое значение, новое валью) // если ключа такого нет то просто положит переданое валью
    }
}
