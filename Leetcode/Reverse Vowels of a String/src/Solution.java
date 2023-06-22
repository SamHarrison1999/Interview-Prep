class Solution {

    boolean isVowel(char letter) {
        if(letter == 'a' || letter == 'e' || letter =='i' || letter == 'o' || letter == 'u' || letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U') {
            return true;
        }
        return false;
    }

    public String reverseVowels(String s) {
        int leftPointer = 0, rightPointer = s.length() - 1;
        char[] letters = s.toCharArray();
        while (leftPointer < rightPointer) {
            while (leftPointer < rightPointer && !isVowel(letters[leftPointer])) leftPointer++;
            while (rightPointer > leftPointer && !isVowel(letters[rightPointer])) rightPointer--;
            char tmp = letters[leftPointer];
            letters[leftPointer] = letters[rightPointer];
            letters[rightPointer] = tmp;
            leftPointer++;
            rightPointer--;
        }
        String reversedVowelsString = new String(letters);
        return reversedVowelsString;
    }
}