public class FizzBuzz {

    public static void main(String[] args) {
        for (int number = 1; number <= 100; number++) {
            //  Numbers which are multiples of both three and five print “FizzBuzz”.
            if (number % 3 == 0 && number % 5 == 0) System.out.println("FizzBuzz");
            // Numbers which are multiples of three print “Fizz”
            else if (number % 3 == 0) System.out.println("Fizz");
            // Numbers which are multiples of five print “Buzz”
            else if (number % 5 == 0) System.out.println("Buzz");
            // Numbers which aren't multiples of 3 or 5 print the number
            else System.out.println(number);
        }
    }

}
