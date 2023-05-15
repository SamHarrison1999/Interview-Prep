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
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
        // Write your code here
        if(s.contains("PM")) {
            String hours = Integer.parseInt(String.valueOf(s.charAt(0))) + 1 + String.valueOf(Integer.parseInt(String.valueOf(s.charAt(1))) + 2);
            if (hours.equals("24")) {
                hours = "12";
            }
            s = hours + s.substring(2, s.length()-2);
            System.out.println(s);
        }
        else if (s.contains("AM")) {
            String hours = Integer.parseInt(String.valueOf(s.charAt(0))) + String.valueOf(Integer.parseInt(String.valueOf(s.charAt(1))));
            if (hours.equals("12")) {
                hours = "00";
            }
            s = hours + s.substring(2, s.length()-2);
            System.out.println(s);
        }
        return s;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
