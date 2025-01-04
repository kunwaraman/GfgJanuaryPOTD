public class Countalltripletswithgivensuminsortedarray {
    public int countTriplets(int[] arr, int target) {
        // Code Here
        int n = arr.length;
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(arr[i]+arr[j]+arr[k]==target){
                        count++;
                    }
                }
            }
        }
        return count;
    }
    // brute force get tle
}
