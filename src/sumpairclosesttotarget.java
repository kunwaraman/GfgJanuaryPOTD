import java.util.*;
// ps:https://www.geeksforgeeks.org/problems/pair-in-array-whose-sum-is-closest-to-x1124/1
// timecomplexity O(nlogn)
// spacecomplexity O(1) // we not consider res to as a space
public class sumpairclosesttotarget {

        public List<Integer> sumClosest(int[] arr, int target) {
            // code here
            Arrays.sort(arr);
            int start = 0;
            int end = arr.length - 1;
            int closestSum = Integer.MAX_VALUE;
            List<Integer> result = new ArrayList<>();

            while (start < end) {
                int sum = arr[start] + arr[end];
                if (Math.abs(sum - target) < Math.abs(closestSum - target)) {
                    closestSum = sum;
                    result.clear();
                    result.add(arr[start]);
                    result.add(arr[end]);
                }
                if (sum < target) {
                    start++;
                } else {
                    end--;
                }
            }

            return result;



        }

}
