import java.util.*;
// this is the sliding window for the distinct type
// like map to size and somethinf answer type
// time complexity O(n)
// space complexity O(n)

public class CountDistinctElementInEveryWindow {
    ArrayList<Integer> countDistinct(int arr[], int k) {
        int n = arr.length;
        ArrayList<Integer>list = new ArrayList<>();
        int i=0;
        int j=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        while(j<n){
            map.put(arr[j],map.getOrDefault(arr[j],0)+1);
            if(j-i+1==k){
                list.add(map.size());
                map.put(arr[i],map.get(arr[i])-1);
                if(map.get(arr[i])==0){
                    map.remove(arr[i]);
                }
                i++;
            }
            j++;
        }
        return list;
    }
}
