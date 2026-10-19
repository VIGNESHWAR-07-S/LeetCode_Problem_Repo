class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        ArrayList<Integer> v = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]<=target){
                if(nums[i]==target){
                    v.add(i);
                }
            }
        }
        return v;
    }
}