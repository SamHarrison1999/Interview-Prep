class Solution {
    public static boolean isValid(String s) {
        // If contains valid parenthese remove them
        while (s.contains("{}") || s.contains("()") || s.contains("[]")) {
            s = s.replace("{}", "");
            s = s.replace("()", "");
            s = s.replace("[]", "");
        }
        // If string is empty return true else return false
        return s.isBlank();
    }
}