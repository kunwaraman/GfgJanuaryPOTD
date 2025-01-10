import java.util.*;
// ps: https://www.geeksforgeeks.org/problems/subarray-with-given-sum-1587115621/1
// time complexity o(n)
// space complexity 0(1) not consider res as a space

public class indexofSubArraySum {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        // code here
        int n = arr.length;
        ArrayList<Integer> list = new ArrayList<>();
        int i=0;
        int j=0;
        int sum=0;
        while(j<n){
            sum+=arr[j];
            if(sum>target){
                while(sum>target && i<=j){
                    sum-=arr[i];
                    i++;
                }
            }
            if(sum==target){
                list.add(i+1);
                list.add(j+1);
                return list;
            }
            j++;
        }
        list.add(-1);
        return list;
    }
}
