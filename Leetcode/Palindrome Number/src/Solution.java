class Solution {
    public boolean isPalindrome(int x) {
        // Convert number to string
        String number = String.valueOf(x);
        // Reverse String
        String reversedNumber = new StringBuilder(number).reverse().toString();
        return number.equals(reversedNumber);
    }
}