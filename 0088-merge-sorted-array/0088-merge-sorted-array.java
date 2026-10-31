class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int q = m+n;
        int[] v = new int[q];
        for(int i=0;i<m;i++){
            v[i]=nums1[i];
        }
        int o=0;
        for(int i=m;i<q;i++){
            v[i]=nums2[o];
            o++;
        }
        Arrays.sort(v);
        for(int i=0;i<q;i++){
            nums1[i]=v[i];
        }
    }
}