import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

class Solution {
    public int searchInsert(int[] nums, int target) {
        Integer[] numbers = IntStream.of(nums).boxed().toArray(Integer[]::new);
        Set<Integer> set = new HashSet<>(Arrays.asList(numbers));
        set.add(target);
        numbers = set.toArray(numbers);
        Arrays.sort(numbers);
        return Arrays.binarySearch(numbers, target);
    }
}