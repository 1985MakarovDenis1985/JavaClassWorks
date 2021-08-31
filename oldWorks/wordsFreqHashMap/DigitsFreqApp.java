package wordsFreqHashMap;

import java.util.*;

public class DigitsFreqApp {
    private static Random random = new Random();
    private final static int N_NUMBERS = 1_000_000;

    public static void main(String[] args) {
        Map<Integer, Integer> res = new HashMap<>();
        for (int j = 0; j < N_NUMBERS; j++) {
            int number = random.nextInt(Integer.MAX_VALUE);
            int [] nn = new int[10];
            while (number > 0) {
                nn[number%10]++;
                number /= 10;
            }
            for (int i = 0; i < nn.length; i++) {
                if (nn[i] != 0){
                    int newValue = nn[i];
                    res.merge(i, newValue, (oldValue, value)-> oldValue + value);

                }
            }
        }

        Set<Map.Entry<Integer, Integer>> entries = res.entrySet();
        List<Map.Entry<Integer, Integer>> list = new ArrayList(entries);

        list.sort((a, b) -> {
           return b.getValue().compareTo(a.getValue());
        });

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
