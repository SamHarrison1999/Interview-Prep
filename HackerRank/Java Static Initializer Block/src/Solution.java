import java.io.*;
import java.util.*;

public class Solution {
    static int Breadth, Height;
    static boolean flag;

    static {
        Scanner sc = new Scanner(System.in);
        Breadth = sc.nextInt();
        Height = sc.nextInt();
        if (Breadth > 0 && Height > 0) {
            flag = true;
        } else {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
            flag = false;
        }
    }

    public static void main(String[] args) {
        if (flag) {
            int area = Breadth * Height;
            System.out.print(area);
        }

    }

}
