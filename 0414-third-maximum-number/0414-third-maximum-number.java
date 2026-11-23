class Solution {
    public int thirdMax(int[] nums) {
      Arrays.sort(nums);
      if(nums.length<3){
        return nums[nums.length-1];
      }
      int a = nums[nums.length-1];
      int c=0;
      for(int i=nums.length-2;i>=0;i--){
        if(a!=nums[i]){
            a=nums[i];
            c++;
            if(c==2){
                return a;
            }
        }
      }
      return nums[nums.length-1];
      

      

    }
}