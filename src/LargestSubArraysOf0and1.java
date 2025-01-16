import java.util.*;
// ps:https://www.geeksforgeeks.org/largest-subarray-with-equal-number-of-0s-and-1s/
// time complexity O(n)
// space complexity O(n)
public class LargestSubArraysOf0and1 {
    public int maxLen(int[] arr) {
        int res=0;
        HashMap<Integer, Integer> map=new HashMap<>();
        map.put(0, -1);
        int p0=0, p1=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                p0++;
            }
            else p1++;
            if(map.containsKey(p0-p1)){
                res=Math.max(res, i-map.get(p0-p1));
            }
            else map.put(p0-p1, i);

        }
        return res;
    }
}
