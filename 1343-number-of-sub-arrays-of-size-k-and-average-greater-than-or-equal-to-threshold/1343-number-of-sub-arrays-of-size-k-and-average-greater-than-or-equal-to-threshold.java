class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
      int l=0,r=k-1,avg=0,c=0,d=0,m=0;

      for(int i=0;i<k;i++){
        c=c+arr[i];
      }

      avg=c/k;
      if(avg>=threshold){
            m++;
        }

      while(r<arr.length-1){
        c=c-arr[l];
        l++;
        r++;
        c=c+arr[r];
        d=c/k;

        if(d>=threshold){
            m++;
        }
        
      }
      return m;
    }
}

