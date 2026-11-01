class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> q = new ArrayList<>();
        int we = nums2.length;
       
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    q.add(nums1[i]); 
                    
                }
            }
        }
        int z = q.size();
        int[] aaa = new int[z];
        for(int i=0;i<z;i++){
            aaa[i] = q.get(i); 
        }
        
        int fu = 0;
        for(int i=0;i<z;i++){
            boolean dup = false;
            for(int j=0;j<fu;j++){
                if(aaa[i]==aaa[j]){
                    dup = true;
                    break;
                }
            }
            if(!dup){
                aaa[fu]=aaa[i];
                fu++;
            }
        }
        return Arrays.copyOf(aaa, fu);
    }
}