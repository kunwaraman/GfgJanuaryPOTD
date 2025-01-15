import java.util.*;
// ps:https://www.geeksforgeeks.org/longest-subarray-with-sum-k/
// time complexity O(n)
// space complexity O(n)
// prefix sum


public class LongestSubArrayWithSumK {
    public int longestSubarray(int[] arr, int k) {
        int n = arr.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        int len=0;
        map.put(0,-1);
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(map.containsKey(sum-k)){
                len=Math.max(len,i-map.get(sum-k));
            }
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
        }
        return len;

    }


    // brute force
    public int longestSubarray1(int[] arr, int k) {
        int n = arr.length;
        int len=0;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=arr[j];
                if(sum==k){
                    len=Math.max(len,j-i+1);
                }
            }
        }
        return len;
    }
}

