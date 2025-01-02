import java.util.*;
// ps:https://www.geeksforgeeks.org/problems/subarrays-with-sum-k/1
// brute force time complexity O(n^2)
public class SubArraysSumEqualsK {
    public int countSubarrays(int arr[], int k) {
        // code here
        int ans=0;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
                sum+=arr[j];
                if(sum==k) ans++;
            }
        }
        return ans;
    }
}





// optiomal time complexity O(n)
// space complexity O(n)
public class SubArraysSumEqualsK {
    public int countSubarrays(int arr[], int k) {
        // code here
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int ans=0, cur=0;
        for(int i:arr){
            cur+=i;
            if(map.containsKey(cur-k))  ans+=map.get(cur-k);
            map.merge(cur,1,Integer::sum);
        }
        return ans;
    }
}
