class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
     int l=0;
     for(int i=0;i<arr1.length;i++){
        boolean v = false;
        for(int j=0;j<arr2.length;j++){
            if(Math.abs(arr1[i]-arr2[j])<=d){
                v = true;
            }
        }
        if(v==false){
            l++;
        }
     }
     return l;   
    }
}