class Solution {
    public List<Integer> findDuplicates(int[] nums) {
    ArrayList<Integer> vv = new ArrayList<>();
     HashSet<Integer> v = new HashSet<>();
     Arrays.sort(nums);
     for(int i=1;i<nums.length;i++){
        if(nums[i-1]==nums[i]){
            if(!v.contains(nums[i])){
                vv.add(nums[i]);
            }
        }
     }
     return vv;

    }
}