import java.util.*;
// time complexity O(n^2)
// space complexity O(1)
// ps:https://practice.geeksforgeeks.org/problems/count-the-triangles/1
public class CountTheNumberOfPossibleTriangles {
    static int countTriangles(int arr[]) {
        // code here
        int n = arr.length;
        Arrays.sort(arr);
        int count=0;
        for(int i=n-1;i>=0;i--){
            int start=0;
            int end= i-1;
            while(start<end){
                if(arr[start]+arr[end]>arr[i]){
                    count+=(end-start);
                    end--;
                }else{
                    start++;
                }
            }
        }
        return count;

    }
}
