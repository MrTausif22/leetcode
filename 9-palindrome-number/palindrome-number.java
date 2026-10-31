class Solution {
    public boolean isPalindrome(int x) {
        int original = x;
        int palindrome = 0;

        if (x < 0){
            return false;
        }

        while(x != 0){
            int digit = x % 10;
            palindrome = palindrome * 10 + digit;
            x = x / 10;
        }

        return original == palindrome;
    }
}