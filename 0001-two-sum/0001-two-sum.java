class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] a = new int[2];
        HashMap<Integer,Integer> v = new HashMap<>();
        for (int i=0;i<nums.length;i++){
            int need = target - nums[i];
            if (v.containsKey(need)) {
                a[0] = v.get(need);
                a[1] = i;
                return a;
            }
            v.put(nums[i], i);
        }
        return a;
    }
}