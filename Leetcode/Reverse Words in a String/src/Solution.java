import java.util.ArrayList;
import java.util.List;

class Solution {
    public String reverseWords(String s) {
        // Split string by word
        String[] words = s.split("\\W+");
        List<String> reversedWordsList = new ArrayList();
        // Add strings to array list in reverse order
        for (int i = words.length - 1; i >= 0; i--) {
            reversedWordsList.add(words[i]);
        }
        String reversedWords = "";
        for(String reversedWord: reversedWordsList) {
            reversedWords += reversedWord + " ";
        }
        // Remove trailing and leading spaces
        return reversedWords.trim();
    }
}