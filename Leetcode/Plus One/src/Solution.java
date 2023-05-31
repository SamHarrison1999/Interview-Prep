class Solution {
    public static int[] plusOne(int[] digits) {
        // Loop through array backwards
        for(int i =  digits.length - 1; i >= 0; i--) {
            // if the last digit is less than 9
            if(digits[i] < 9) {
                digits[i] += 1;
                return digits;
            }
            // Otherwise, change the digit at the current index to zero
            digits[i] = 0;
        }
        // If all the numbers are 9 or greater, create a new array with all the digits plus space for one more digit
        int[] newDigits = new int [digits.length + 1];
        // Make the digit at the first index 1
        newDigits[0] = 1;
        // return the new array
        return newDigits;
    }
}