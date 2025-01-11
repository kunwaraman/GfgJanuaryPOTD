import java.util.*;
//ps:https://practice.geeksforgeeks.org/problems/longest-substring-without-repeating-characters/1

// time complexity O(n)
// space complexity O(n)

public class LongestSubstringWithDistinctCharacters {
    public int longestUniqueSubstr(String s) {
        // code here
        int n = s.length();
        int i=0;
        int j=0;
        HashMap<Character,Integer> map = new HashMap<>();
        int longest=Integer.MIN_VALUE;
        while(j<n){
            map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)+1);
            if(j-i+1>map.size()){
                while(j-i+1>map.size()){
                    map.put(s.charAt(i),map.get(s.charAt(i))-1);
                    if(map.get(s.charAt(i))==0){
                        map.remove(s.charAt(i));
                    }
                    i++;
                }
            }
            if(j-i+1==map.size()){
                longest=Math.max(longest,j-i+1);
            }
            j++;
        }
        return longest;
    }
}
