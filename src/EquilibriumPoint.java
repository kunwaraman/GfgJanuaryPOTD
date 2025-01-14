// time complexity O(n)
// space complexity O(1)
//ps: https://www.geeksforgeeks.org/find-an-equilibrium-point-in-an-array/
// prefix sum

public class EquilibriumPoint {
    public static int findEquilibrium(int arr[]) {

        int n = arr.length;
        int leftsum=0;
        int totalsum=0;
        for(int i=0;i<n;i++){
            totalsum+=arr[i];
        }
        for(int i=0;i<n;i++){
            int rightsum=totalsum-leftsum-arr[i];
            if(leftsum==rightsum){
                return i;
            }
            leftsum+=arr[i];
        }
        return -1;
    }
}
