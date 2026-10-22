class Solution {
    public boolean containsDuplicate(int[] nums) {
    HashSet<Integer> v = new HashSet<>();
    for(int i=0;i<nums.length;i++){
        if(!v.contains(nums[i])){
            v.add(nums[i]);
        }
        else{
            return true;
        }

    }
    return false;
    }
}