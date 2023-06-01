import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer,Integer> hm = new HashMap();
        for(int num:nums){
            if(!hm.containsKey(num)){
                hm.put(num,1);
            }else{
                hm.put(num, hm.get(num)+1);
            }
        }
        Set<Integer> greppedKeys = hm.keySet().stream()
                .filter(key -> hm.get(key) >= 2)
                .collect(Collectors.toSet());
        return greppedKeys.size() > 0 ? true : false;
    }
}