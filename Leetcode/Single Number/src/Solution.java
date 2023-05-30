import java.util.Arrays;

class Solution {
    public int singleNumber(int[] nums) {
        // Sort array
        Arrays.sort(nums);
        // If only one element
        if (nums.length == 1) return nums[0];
        // Check first element
        if (nums[0] != nums[1]) return nums[0];
        // Check element is different from its adjacent elements
        for (int i = 1; i < nums.length - 1; i++) if (nums[i] != nums[i-1] && nums[i] != nums[i+1]) return nums[i];
        // Check last element
        if (nums[nums.length-1] != nums[nums.length-2]) return nums[nums.length-1];
        return -1;
    }
}