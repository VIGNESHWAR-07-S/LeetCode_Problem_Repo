class Solution {
    public int maxAscendingSum(int[] nums) {
        int maxSum = nums[0];
        int c = nums[0];
        
        for (int i=1;i<nums.length;i++) {
            if (nums[i] > nums[i-1]) {
                c = c+ nums[i];
            } 
            else {
                maxSum = Math.max(maxSum, c);
                c = nums[i];
            }
        }
        return Math.max(maxSum, c);
    }
}