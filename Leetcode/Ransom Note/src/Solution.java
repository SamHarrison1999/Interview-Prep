class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int counter = 0;
        for (int i = 0; i < ransomNote.length(); i++) {
            if (magazine.contains(String.valueOf(ransomNote.charAt(i)))) {
                magazine = magazine.replaceFirst(String.valueOf(ransomNote.charAt(i)),"");
                counter ++;
            }
        }
        return (counter == ransomNote.length()) ? true : false;
    }
}