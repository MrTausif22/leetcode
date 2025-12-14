public class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            minPrice = Math.min(minPrice, price);       // track minimum price
            maxProfit = Math.max(maxProfit, price - minPrice); // calculate max profit
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.maxProfit(new int[]{7,1,5,3,6,4})); // 5
        System.out.println(sol.maxProfit(new int[]{7,6,4,3,1}));   // 0
    }
}