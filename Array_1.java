import java.util.*;
class Array_1 {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> hs=new HashSet<Integer>();
        for(int i:nums){
            if(hs.contains(i)){
                return i;
            }
                hs.add(i);
        }
        return -1;
    }
}