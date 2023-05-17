import java.util.ArrayList;
import java.util.List;

class Solution {
    public int removeElement(int[] nums, int val) {
        List<Integer> numsList = new ArrayList<>();
        for (int i = 0; i < nums.length; i++)
            numsList.add(nums[i]);
        List<Integer> valueList = new ArrayList<>();
        valueList.add(val);
        numsList.removeAll(valueList);
        // update values in nums array
        for (int i = 0; i < numsList.size(); i++)
            nums[i] = numsList.get(i);
        return numsList.size();
    }
}