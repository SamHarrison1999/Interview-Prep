import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        HashSet<String> pairs = new HashSet<>();
        Scanner myObj = new Scanner(System.in);
        int size = myObj.nextInt();
        for (int i = 0; i < size; i ++) {
            String firstPerson = myObj.next();
            String secondPerson = myObj.next();
            pairs.add(firstPerson + " " + secondPerson);
            System.out.println(pairs.size());
        }
    }
}