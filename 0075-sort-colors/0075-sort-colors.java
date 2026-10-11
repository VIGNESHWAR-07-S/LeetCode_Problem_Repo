class Solution {
    public void sortColors(int[] nums) {
     for(int i=0;i<nums.length-1;i++) {
            boolean n = false;
            for (int j = 0; j < nums.length - i -  1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    n = true;
                }
            }
            if(!n){
                break;
            }
        }   
    }
}