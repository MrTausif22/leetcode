// class Solution{
//     public int maxProfit(int[] prices) {
//     int minPrice = Integer.MAX_VALUE;
//     int maxProfit = 0;

//     for (int price : prices) {
//         if (price < minPrice) {
//             minPrice = price;
//         }
//         else {
//             int profit = price - minPrice;
//             if (profit > maxProfit) {
//                 maxProfit = profit;
//             }
//         }
//     }
//     return maxProfit;
//     }
    
// }


// class Solution{

//     public int maxProfit(int [] prices ){
//         return solve(prices,0,1,1);
//     }
//     public int solve(int [] prices, int index, int buy , int transaction){
//         int n = prices.length;
//         if (index >= n || transaction <= 0){
//             return 0;
//         }
//         if (buy == 1){
//             return Math.max(-prices[index] + solve(prices,index+1, 0, 1), solve (prices, index+1, 1,1));
//         }
//         else{ 
//             return Math.max(prices[index] + solve(prices, index+1 , 1 , 0), solve(prices, index+1, 0, 1));   
//         }
//     }
    
// }

// class Solution{

//     public int maxProfit(int [] prices ){
//         int n = prices.length;
//         int [][][] dp = new int [n][2][2];
//         for(int i = 0; i<n; i++){
//             for(int j = 0; j<2; j++){
//                 for (int k = 0; k<2; k++){
//                     dp[i][j][k] = -1;
//                 }
//             }
//         }

//         return solve(prices,0,1,1,dp);
//     }
//     public int solve(int [] prices, int index, int buy , int transaction, int [][][] dp){
//         int n = prices.length;
//         if (index >= n || transaction <= 0){
//             return 0;
//         }
//         if (dp[index][buy][transaction] != -1) {
//             return dp[index][buy][transaction];
//         }
//         if (buy == 1){
//             return Math.max(-prices[index] + solve(prices,index+1, 0, 1, dp), solve (prices, index+1, 1,1,dp));
//         }
//         else{ 
//             return Math.max(prices[index] + solve(prices, index+1 , 1 , 0, dp), solve(prices, index+1, 0, 1,dp));   
//         }
//     }
    
// }


class Solution {

    int[][][] dp;

    public int maxProfit(int[] prices) {

        int n = prices.length;

        dp = new int[n][2][2];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    dp[i][j][k] = -1;
                }
            }
        }

        return solve(prices, 0, 1, 1);
    }

    public int solve(int[] prices, int index,
                     int buy, int transaction) {

        if (index == prices.length || transaction == 0) {
            return 0;
        }

        if (dp[index][buy][transaction] != -1) {
            return dp[index][buy][transaction];
        }

        int ans;

        if (buy == 1) {

            ans = Math.max(
                    -prices[index] +
                    solve(prices, index + 1, 0, transaction),

                    solve(prices, index + 1, 1, transaction)
            );

        } else {

            ans = Math.max(
                    prices[index] +
                    solve(prices, index + 1, 1, transaction - 1),

                    solve(prices, index + 1, 0, transaction)
            );
        }

        return dp[index][buy][transaction] = ans;
    }
}