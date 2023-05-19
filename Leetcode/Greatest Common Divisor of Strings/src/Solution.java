class Solution {
    public String gcdOfStrings(String str1, String str2) {
        int lengthOfFirstString = str1.length(), lengthOfSecondString = str2.length(), shortestWord = Math.min(str1.length(), str2.length()), gcd=1;
        if (!(str1 + str2).equals(str2 + str1))  return "";
        for(int i = 2;i <= shortestWord; i++){
            if(lengthOfFirstString % i == 0 && lengthOfSecondString % i == 0){
                gcd = i;
            }
        }
        return str1.substring(0, gcd);
    }
}