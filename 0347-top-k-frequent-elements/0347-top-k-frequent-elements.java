class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       HashMap<Integer, Integer> map = new HashMap<>();
       
       for(int i=0;i<nums.length;i++){
        if(!map.containsKey(nums[i])){
            map.put(nums[i],0);
        }
        else{
            map.put(nums[i],map.get(nums[i])+1);
        }
       }

        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.<Integer, Integer>comparingByValue().reversed());


       int[] ans = new int[k];
       for(int i = 0; i < k; i++){
            ans[i] = list.get(i).getKey();
        }
        return ans;
    }
}