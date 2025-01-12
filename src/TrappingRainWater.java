// ps: https://www.geeksforgeeks.org/trapping-rain-water/
// time complexity O(n)
// space complexity O(n)
// stack to do is a work pending do it later famous interview problem

public class TrappingRainWater {
    public int maxWater(int arr[]) {
        int n = arr.length;
        int leftmax[] = new int[n];
        int rightmax[] = new int[n];
        int total=0;
        leftmax[0]=arr[0];
        for(int i=1;i<n;i++){
            leftmax[i]=Math.max(leftmax[i-1],arr[i]);
        }
        rightmax[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            rightmax[i]=Math.max(rightmax[i+1],arr[i]);
        }
        for(int i=0;i<n-1;i++){
            total+=(Math.min(leftmax[i],rightmax[i])-arr[i]);
        }
        return total;
    }
}
