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
     * Complete the 'caesarCipher' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. INTEGER k
     */

    public static String caesarCipher(String s, int k) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char letter=s.charAt(i);
            // Lower case
            if(letter >= 97 && letter <= 122) {
                letter=(char)(letter + k);
                // if past z
                while(letter > 122){
                    letter=(char)(letter - 26);
                }
            }
            // Upper case
            else if(letter >= 65 && letter <= 90) {
                letter=(char)(letter + k);
                // if past Z
                while(letter > 90){
                    letter=(char)(letter - 26);
                }
            }
            str.append(letter);
        }
        return str.toString();
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String s = bufferedReader.readLine();

        int k = Integer.parseInt(bufferedReader.readLine().trim());

        String result = Result.caesarCipher(s, k);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
