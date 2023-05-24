import java.util.InputMismatchException;
import java.util.Scanner;

public class SwapIntegersByReference {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter first number:");
            int a = sc.nextInt();
            System.out.println("Enter second number:");
            int b = sc.nextInt();
            System.out.println("Before Swapping numbers A was " + a + " and B was " + b);
            int[] swapped = swapIntegers(a, b);
            System.out.println("After Swapping numbers A was " + swapped[0] + " and B was " + swapped[1]);
        } catch (InputMismatchException e) {
            System.err.println("Wrong input! Input only integer numbers");
            e.printStackTrace();
            System.exit(0);
        }

    }

    /**
     *
     * @param a - First number
     * @param b - Second number
     * @return an integer array with the numbers swapped
     */
    private static int[] swapIntegers(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        return new int[] {a, b};
    }
}
