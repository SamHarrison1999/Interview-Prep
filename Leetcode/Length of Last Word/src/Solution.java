class Solution {
    public int lengthOfLastWord(String s) {
        String[] splitted = s.split("[\\W]");
        return splitted[splitted.length-1].length();
    }
}