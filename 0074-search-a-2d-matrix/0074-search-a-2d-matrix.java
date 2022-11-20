class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
          for (int i = 0; i < matrix.length; i++) {
            int high = matrix[i].length - 1, low = 0;
            while (low <= high) {
                int mid = (high + low) / 2;
                if (matrix[i][mid] == target) {
                   return true;
                } else if (matrix[i][mid] > target) {
                    high = mid-1;
                } else
                    low = mid+1;
            }
        }
        return false;
    }
}