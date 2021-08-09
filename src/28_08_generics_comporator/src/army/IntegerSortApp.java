package army;

import java.util.Arrays;

public class IntegerSortApp {
    public static void main(String[] args) {
        Integer[] nums = {
                Integer.MAX_VALUE,
                -2,
                Integer.MIN_VALUE,
                -1
        };
        Arrays.sort(nums, (a,b) -> Integer.compare(a,b)); // compare 1, 0, -1
        ArrayTools.printArray(nums);
    }
}
