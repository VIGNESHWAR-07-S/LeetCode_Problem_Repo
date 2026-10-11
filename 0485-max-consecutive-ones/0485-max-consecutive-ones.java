class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int m = nums.length;
        int[] v = new int[m];
        int x =0;
        for(int i=0;i<m;i++){
            if(nums[i]==1){
                v[x]++;
            }
            else{
                x++;
            }
        }
        int h =0;
        for(int i=0;i<m;i++){
            if(v[i]>h){
                h = v[i];
            }
        }
        return h;
    }
}