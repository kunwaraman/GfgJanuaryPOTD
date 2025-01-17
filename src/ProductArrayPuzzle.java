import java.util.*;
// ps:https://leetcode.com/problems/product-of-array-except-self/
// this is product of array itself
// time complexity O(n)
// space complexity O(n)
public class ProductArrayPuzzle {
    public static int[] productExceptSelf(int arr[]) {

        int n = arr.length;
        int ans[] = new int[n];
        Arrays.fill(ans,1);
        int leftprod=1;
        int rightprod=1;
        for(int i=0;i<n;i++){
            ans[i]=leftprod;
            leftprod=leftprod*arr[i];
        }
        for(int i=n-1;i>=0;i--){
            ans[i]=ans[i]*rightprod;
            rightprod=rightprod*arr[i];
        }
        return ans;

    }
    // another way
    public static int[] productExceptSelfanotherway(int arr[]) {
        // code here
        int n = arr.length;
        int prefix[] = new int[n];
        int sufix[] = new int[n];
        prefix[0]=1;
        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]*arr[i-1];
        }
        sufix[sufix.length-1] = 1;
        for(int i=arr.length-2;i>=0;i--){
            sufix[i]=sufix[i+1]*arr[i+1];
        }
        int[] ans = new int[n];
        for(int i=0;i<ans.length;i++){
            ans[i]=prefix[i]*sufix[i];
        }
        return ans;
    }
}
