class Solution {
    public int arrayPairSum(int[] nums) {
    int v = 0;
     Arrays.sort(nums);
     for(int i=0;i<nums.length;i=i+2){
        v=v+nums[i];
     }
     return v;   
    }
}