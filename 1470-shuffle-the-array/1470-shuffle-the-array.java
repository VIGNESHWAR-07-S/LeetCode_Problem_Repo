class Solution {
    public int[] shuffle(int[] nums, int n){
        int q = nums.length;
        int m=0;
        int[] v = new int[q];
        for(int i=0;i<n;i++){
            v[m]=nums[i];
            m=m+2;
        }
        m=1;
        for(int i=n;i<q;i++){
            v[m]=nums[i];
            m=m+2;
        }
        return v;

    }
}