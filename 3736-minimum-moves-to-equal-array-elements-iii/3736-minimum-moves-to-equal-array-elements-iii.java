class Solution {
    public int minMoves(int[] nums) {
     int max = 0;
     for(int v : nums){
        if(max<v){
            max=v;
        }
     }
     int vv = 0;
      for(int i : nums){
        vv = vv + (max-i); 
      }
      return vv;  
    }
}