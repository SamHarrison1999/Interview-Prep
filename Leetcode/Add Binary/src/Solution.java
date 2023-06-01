import java.math.BigInteger;

class Solution {
    public String addBinary(String a, String b) {
        BigInteger num_1 = new BigInteger(a,2);     //Store as Binary
        BigInteger num_2 = new BigInteger(b,2);       //Store as Binary
        BigInteger result = num_1.add(num_2);
        return result.toString(2);
    }
}