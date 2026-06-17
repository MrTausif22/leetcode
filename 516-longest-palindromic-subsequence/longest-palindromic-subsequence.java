class Solution {

    public int solve(String s1 , String s2){
        int m = s1.length();
        int n = s2.length();
        int [] curr = new int[m+1];
        int [] next = new int[n+1];

        for(int i = m-1; i>=0 ; i--){
            for (int j = n-1; j>= 0; j--){
                int ans = 0;
                if(s1.charAt(i) == s2.charAt(j)){
                    ans = 1 + next[j+1];
                }
                else{
                    ans = Math.max(curr[j+1] , next[j]);
                }
                curr[j] = ans;
            }
            System.arraycopy(curr,0,next,0, curr.length);
        }
        return next[0];

    }
    public int longestPalindromeSubseq(String s) {
        String revStr = new StringBuilder(s)
                            .reverse()
                            .toString();

        return solve(s, revStr);
    }
}

// class Solution {

//     public int solve(String s1, String s2) {
//         int m = s1.length();
//         int n = s2.length();

//         int[] curr = new int[n + 1];
//         int[] next = new int[n + 1];

//         for (int i = m - 1; i >= 0; i--) {

//             for (int j = n - 1; j >= 0; j--) {

//                 if (s1.charAt(i) == s2.charAt(j)) {
//                     curr[j] = 1 + next[j + 1];
//                 } else {
//                     curr[j] = Math.max(curr[j + 1], next[j]);
//                 }
//             }

//             System.arraycopy(curr, 0, next, 0, n + 1);
//         }

//         return next[0];
//     }

//     public int longestPalindromeSubseq(String s) {

//         String revStr = new StringBuilder(s)
//                             .reverse()
//                             .toString();

//         return solve(s, revStr);
//     }
// }