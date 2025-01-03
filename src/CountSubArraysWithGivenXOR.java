
// ps: https://www.geeksforgeeks.org/problems/count-subarray-with-given-xor/1
// time complexity O(n)
// space complexity O(n)
public class CountSubArraysWithGivenXOR {
    public long subarrayXor(int arr[], int k) {
        // code here
        int n = arr.length;
        long xor = 0;
        long count = 0;
        HashMap<Long, Long> map = new HashMap<>();

        for (int num : arr) {
            xor ^= num;
            if (xor == k) {
                count++;
            }
            long xorK = xor ^ k;
            if (map.containsKey(xorK)) {
                count += map.get(xorK);
            }
            map.put(xor, map.getOrDefault(xor, 0L) + 1);
        }

        return count;
    }
}
