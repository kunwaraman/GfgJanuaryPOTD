// time complexity O(n)
// space complexity O(1)
// ps:https://leetcode.com/problems/container-with-most-water/
// leetcode gfg same there
// famous interview problem it is

public class ContainerWithMostWater {
    public int maxWater(int arr[]) {
        int n = arr.length;
        int i=0;
        int j=n-1;
        int most=0;
        while(i<j){
            int height=Math.min(arr[i],arr[j]);
            int width=j-i;
            int area=width*height;
            most=Math.max(most,area);
            if(arr[i]<arr[j]){
                i++;
            }else{
                j--;
            }
        }
        return most;
    }
}
