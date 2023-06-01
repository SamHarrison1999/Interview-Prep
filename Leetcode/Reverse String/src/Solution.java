class Solution {
    public void reverseString(char[] s) {
        StringBuilder sb = new StringBuilder();
        for (char c: s) {
            sb.append(c);
        }
        sb.reverse();
        for (int i = 0; i < sb.toString().length(); i++) {
            s[i] = sb.toString().charAt(i);
        }
    }
}