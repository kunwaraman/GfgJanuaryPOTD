import java.util.*;

// time complexity O(nlogn)
// space complexity O(1)
public class countpairsWhoseSumIsLessThanTarget {
    int countPairs(int arr[], int target) {
        // Your code here
        int n = arr.length;
        Arrays.sort(arr);
        int start=0;
        int end = n-1;
        int count=0;
        while(start<end){
            if(arr[start]+arr[end]<target){
                count+=end-start;
                start++;
            }else{
                end--;
            }
        }
        return count;
    }
}

// brute force got tle
int countPairs(int arr[], int target) {
    int n = arr.length;
    int count=0;
    for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            if(arr[i]+arr[j]<target){
                count++;
            }
        }
    }
    return count;

}