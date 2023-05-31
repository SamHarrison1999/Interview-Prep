import java.util.ArrayList;
import java.util.List;

class Solution {

    public List<Integer> getRow(int rowIndex) {
        List<Integer> pascalsTriangleAtRowIndex = new ArrayList();
        // 1st element of every row is 1
        pascalsTriangleAtRowIndex.add(1);
        // Check if the row that has to be returned is the first row
        if (rowIndex == 0) {
            return pascalsTriangleAtRowIndex;
        }
        // Generate the previous row
        List<Integer> prev = getRow(rowIndex - 1);
        for (int i = 1; i < prev.size(); i++) {
            // Generate the elements of the current row 
            int curr = prev.get(i - 1) + prev.get(i);
            pascalsTriangleAtRowIndex.add(curr);
        }
        pascalsTriangleAtRowIndex.add(1);
        // Return the row
        return pascalsTriangleAtRowIndex;
    }
}