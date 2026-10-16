class Solution {
    public int[][] transpose(int[][] matrix) {
        int[][] v = new int[matrix[0].length][matrix.length];
        int m = 0,n=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                v[m][n]=matrix[i][j];
                m++;
            }
            m=0;
            n++;
        }
        return v;
    }
}