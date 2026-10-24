class Solution {
    public boolean check(int[] nums) {
       int j = 0;
       for(int i=1;i<nums.length;i++){
        if(nums[i-1]>nums[i]){
            j++;
        }
       }
       if(nums[nums.length-1]>nums[0]){
        j++;
        }
       return j<2; 
    }
}