import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int combinedLength = A.length() + B.length();
        A = String.valueOf(A.charAt(0)).toUpperCase() + A.substring(1);
        B = String.valueOf(B.charAt(0)).toUpperCase() + B.substring(1);
        System.out.println(combinedLength);
        System.out.println(A.compareTo(B) > 0 ? "Yes" : "No");
        System.out.println(A + " " + B);


    }
}



