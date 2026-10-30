class Solution {
    public void moveZeroes(int[] nums) {
        int[] v = new int[nums.length];
        int n=0,m=nums.length-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                v[n]=nums[i];
                n++;
            }
            else{
                v[m]=nums[i];
                m--;
            }
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=v[i];
        }
    }
}