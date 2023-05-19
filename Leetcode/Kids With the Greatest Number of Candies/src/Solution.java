import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        for (int candy : candies) {
            if (candy > max) max = candy;
        }
        List<Boolean> greatestNumberOfCandies = new ArrayList();
        for (int candy : candies) {
            if (candy + extraCandies >= max) {
                greatestNumberOfCandies.add(true);
            } else {
                greatestNumberOfCandies.add(false);
            }
        }
        return greatestNumberOfCandies;
    }
}