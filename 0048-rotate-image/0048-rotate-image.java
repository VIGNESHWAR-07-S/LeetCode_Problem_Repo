class Solution {
    public void rotate(int[][] matrix) {
      int[][] v = new int[matrix[0].length][matrix.length];
       int l = matrix[0].length-1;
      for(int i=0;i<matrix.length;i++){
        int ll = 0;
        for(int j=0;j<matrix[0].length;j++){
            v[ll][l]=matrix[i][j];
            ll++;
        }
        l--;
      } 
      for(int i=0;i<matrix.length;i++){
        for(int j=0;j<matrix[0].length;j++){
            matrix[i][j]=v[i][j];
        }
      }
      
    }
}