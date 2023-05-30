import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascalsTriangle = new ArrayList<>();
        for (int line = 1; line <= numRows; line++) {
            int value = 1;
            List<Integer> innerList = new ArrayList<>();
            for (int i = 1; i <= line; i++) {
                innerList.add(value);
                value = value * (line - i) / i;
            }
            pascalsTriangle.add(innerList);
        }
        return pascalsTriangle;
    }
}