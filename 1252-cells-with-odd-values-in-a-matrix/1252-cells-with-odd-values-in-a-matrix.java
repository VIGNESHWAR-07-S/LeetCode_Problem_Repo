class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] v = new int[m][n];
        int[] a = new int[indices.length];
        int[] b = new int[indices.length];
        
        for(int i=0;i<indices.length;i++) {
            a[i] = indices[i][0];
        }
        for(int i=0;i<indices.length;i++) {
            b[i] = indices[i][1];
        }
        for(int i=0;i<a.length;i++) {
            for(int j = 0; j < n; j++) {
                v[a[i]][j]++;
            }
        }
        for(int i = 0; i < b.length; i++) {
            for(int j = 0; j < m; j++) {
                v[j][b[i]]++;
            }
        }

        int w = 0;
        for(int i=0;i<v.length;i++) {
            for(int j=0;j<v[0].length;j++) {
                if(v[i][j] % 2 != 0) {
                    w++;
                }
            }
        }

        return w;
    }
}