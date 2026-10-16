class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if(mat.length * mat[0].length != r * c) {
            return mat;
        }
        int[][] v = new int[r][c];
        r=0;
        c=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                v[r][c]=mat[i][j];
                c++;
            
            if(c==v[0].length){
                r++;
                c=0;
            }
            }
        }
        return v;
    }
}