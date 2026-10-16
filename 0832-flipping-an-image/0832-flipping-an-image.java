class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int[][] v = new int[image.length][image[0].length];
        for(int i=0;i<image.length;i++){
            for(int j=0;j<image[0].length;j++){
              if(image[i][j]==0){
                v[i][image[i].length - 1 - j]=1;
              }
              else if (image[i][j]==1){
                v[i][image[i].length - 1 - j]=0;
              }  
            }
           
        }
        return v;
    }
}