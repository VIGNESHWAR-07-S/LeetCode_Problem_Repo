class Solution {
    public int[] getConcatenation(int[] nums) {
      int n = nums.length*2;
      int[] v = new int[n];
      for(int i=0;i<nums.length;i++){
        v[i]=nums[i];
      }
      int k=0;
      for(int i=nums.length;i<nums.length*2;i++){
        v[i]=nums[k];
        k++;
      }
      return v;
    }
}