class Solution {
    public boolean isAnagram(String s, String t) {
        // if either strings are null return false
        if(s == null || t == null) return false;
        // if length of both strings aren't equal return false
        if(s.length() != t.length()) return false;
        int[] frequencyOfEachLetter = new int[26];
        // loop through the strings and count frequency of each letter
        for(int index = 0; index < s.length(); index++){
            frequencyOfEachLetter[s.charAt(index)-'a']++;
            frequencyOfEachLetter[t.charAt(index)-'a']--;
        }
        // if frequency for every letter == 0 return true else return false
        for(int frequencyOfIndividualLetter : frequencyOfEachLetter){
            if(frequencyOfIndividualLetter != 0)
                return false;
        }
        return true;
    }
}