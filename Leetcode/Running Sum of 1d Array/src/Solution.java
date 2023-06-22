class Solution {
    public int[] runningSum(int[] nums) {
        int[] temp = nums.clone();
        for (int i = 0; i < nums.length; i++) {
            int index = 0;
            while (index < i) {
                nums[i] += temp[index];
                index ++;
            }
        }
        return nums;
    }
}