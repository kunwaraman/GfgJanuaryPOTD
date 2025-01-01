
//ps:https://www.geeksforgeeks.org/problems/print-anagrams-together/1
import java.util.*;

public class Solution {
    public ArrayList<ArrayList<String>> anagrams(String[] arr) {
        HashMap<String,List<String>> map = new HashMap<>();
        for(String str:arr){
            char[] charArray =str.toCharArray();
            Arrays.sort(charArray);
            String sortedstr = new String(charArray);

            if(!map.containsKey(sortedstr)){
                map.put(sortedstr,new ArrayList<>());
            }
            map.get(sortedstr).add(str);
        }
        ArrayList<ArrayList<String>> result = new ArrayList<>();
        for (List<String> group : map.values()) {
            result.add(new ArrayList<>(group));
        }
        return result;
    }
}
