class Solution {
    public String maxSumOfSquares(int num, int sum) {
        if (sum > num * 9) {
            return "";
        }
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < num; i++) {
            int digit = Math.min(9, sum);
            ans.append(digit);
            sum -= digit;
        }
        return ans.toString();
    }
}