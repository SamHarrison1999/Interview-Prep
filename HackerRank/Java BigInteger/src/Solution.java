import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Solution {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner myObj = new Scanner(System.in);
        BigInteger a = myObj.nextBigInteger();
        BigInteger b = myObj.nextBigInteger();
        System.out.println(a.add(b));
        System.out.println(a.multiply(b));
    }
}