class Solution {
    public int diagonalSum(int[][] mat) {
    int j=0,v=0;
    for(int i=0;i<mat.length;i++){
        v = v + mat[i][j];
        j++;
    }
    j=mat.length-1;
    for(int i=0;i<mat.length;i++){
        v = v+ mat[i][j];
        j--;
    }
    if(mat.length%2!=0){
        v = v - mat[mat.length/2][mat[0].length/2];
    }
    return v;
    }
}