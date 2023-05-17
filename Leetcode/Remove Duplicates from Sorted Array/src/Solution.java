import java.util.ArrayList;
import java.util.LinkedHashSet;

class Solution {
    public int removeDuplicates(int[] nums) {

        LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
        // adding elements to LinkedHashSet
        for (int i = 0; i < nums.length; i++)
            set.add(nums[i]);

        // Convert LinkedHashSet to ArrayList using constructor
        ArrayList<Integer> elements = new ArrayList<>(set);

        // update values in nums array
        for (int i = 0; i < set.size(); i++)
            nums[i] = elements.get(i);

        return elements.size();
    }
}