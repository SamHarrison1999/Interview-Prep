import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        int line = 0;
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String newLine = scanner.nextLine();
            line ++;
            System.out.println(line + " " + newLine);
        }

    }
}
