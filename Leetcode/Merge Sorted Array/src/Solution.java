import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        List linkedList = new LinkedList();
        // Add first m elements from first list into a linked list
        for (int j = 0; j < m; j++) {
            linkedList.add(nums1[j]);
        }
        // Add first n elements from second list into a linked list
        for (int k = 0; k < n; k++) {
            linkedList.add(nums2[k]);
        }
        // Sort merged list
        Collections.sort(linkedList);
        // Update first list
        for (int i = 0; i < nums1.length; i++) {
            if (nums1[i] != (int) linkedList.get(i)) {
                nums1[i] = (int) linkedList.get(i);
            }
        }
    }
}