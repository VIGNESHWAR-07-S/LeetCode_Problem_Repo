class Solution {
    public double findMaxAverage(int[] nums, int k) {
       
      int l=0,r=k-1;
      double maxavg=0,c=0,d=0;
      for(int i=0;i<k;i++){
        c=nums[i]+c;
      }
      maxavg = c/k;
      while(r<nums.length-1){
        c=c-nums[l];
        l++;
        r++;
        c=c+nums[r];
        d=c/k;
        maxavg = Math.max(maxavg,d);
      }
      return maxavg;
    }
}