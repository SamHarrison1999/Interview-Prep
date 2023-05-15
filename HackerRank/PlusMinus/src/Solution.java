import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        int negativeNumbers = 0, positiveNumbers = 0, zeros = 0;

        for (Integer number: arr) {
            if (number > 0) {
                positiveNumbers ++;
            }
            else if (number < 0) {
                negativeNumbers ++;
            } else {
                zeros ++;
            }
        }

        double positive = (double) positiveNumbers / (double) arr.size();
        double negative = (double) negativeNumbers / (double) arr.size();
        double zero = (double) zeros / (double) arr.size();
        System.out.println(String.format("%.6g", positive));
        System.out.println(String.format("%.6g", negative));
        System.out.println(String.format("%.6g", zero));
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
