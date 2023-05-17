import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> fizzBuzzList = new ArrayList();
        int i = 1;
        while (i <= n) {
            if (i % 3 == 0 && i % 5 == 0) {
                fizzBuzzList.add("FizzBuzz");
            }
            else if (i % 3 == 0) {
                fizzBuzzList.add("Fizz");
            }
            else if (i % 5 == 0) {
                fizzBuzzList.add("Buzz");
            }
            else {
                fizzBuzzList.add(String.valueOf(i));
            }
            i++;
        }
        return fizzBuzzList;
    }
}