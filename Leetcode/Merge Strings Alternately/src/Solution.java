class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder mergedString = new StringBuilder();
        int shortestWordLength = Math.min(word1.length(), word2.length());
        int longestWordLength = Math.max(word1.length(), word2.length());
        for (int i = 0; i < shortestWordLength; i++) {
            mergedString.append(word1.charAt(i));
            mergedString.append(word2.charAt(i));
        }
        if (word1.length() > word2.length()) {
            for (int i = shortestWordLength; i < longestWordLength; i++) mergedString.append(word1.charAt(i));
        } else if (word2.length() > word1.length()) {
            for (int i = shortestWordLength; i < longestWordLength; i++) mergedString.append(word2.charAt(i));
        }
        return mergedString.toString();
    }
}