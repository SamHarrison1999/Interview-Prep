import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int findKthLargest(int[] nums, int k) {
        Integer[] reversedSortedArray = Arrays.stream(nums).boxed().toArray(Integer[]::new);
        Arrays.sort(reversedSortedArray, Collections.reverseOrder());
        return reversedSortedArray[k-1];
    }
}