class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
      if (matrix == null || matrix.length == 0 || matrix[0].length == 0) return false;
    int left = 0;
    int right = matrix.length * matrix[0].length - 1;
    while (left<=right) {
        int mid = left + (right - left) / 2;
        int r = mid / matrix[0].length;
        int c = mid % matrix[0].length;
        int value = matrix[r][c];
        if (value == target) {
            return true;
        } else if (value < target) {
            left = mid + 1;
        } else {
            right = mid - 1;
        }
    }
    return false;  
    }
}