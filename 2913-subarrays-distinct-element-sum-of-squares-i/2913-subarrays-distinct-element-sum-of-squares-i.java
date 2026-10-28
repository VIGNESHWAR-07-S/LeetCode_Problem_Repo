class Solution {
    public int sumCounts(List<Integer> nums) {
      int v = 0;
      for(int i=0;i<nums.size();i++){
        HashSet<Integer> l = new HashSet<>();
        for(int j=i;j<nums.size();j++){
               l.add(nums.get(j));
               v += l.size()*l.size();
            
        }
        
      }  
      return v;
    }
}