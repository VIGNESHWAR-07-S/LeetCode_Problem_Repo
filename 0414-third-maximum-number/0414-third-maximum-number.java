class Solution {
    public int thirdMax(int[] nums) {
      ArrayList<Integer> v = new ArrayList<>();
      for(int i=0;i<nums.length;i++){
        boolean n = false;
        for(int j=i+1;j<nums.length;j++){
            if(nums[i]==nums[j]){
                n= true;
            }
        }
        if(n==false){
            v.add(nums[i]);
        }
      }

      Collections.sort(v);
      if(v.size()==2) return v.get(v.size()-1);
      if(v.size()==3) return v.get(0);
      if(v.size()==1) return v.get(0);
      
      return v.get(v.size()-3);
    }
}