// class Solution {
//     public int addDigits(int num) {
//         if (num == 0) return 0;
//         return 1 + (num - 1) % 9;
//     }
// }


class Solution {
    public int addDigits(int num) {
        while (num >= 10) {   // repeat until single digit
            int sum = 0;
            while (num > 0) {
                sum += num % 10;  // get last digit
                num /= 10;        // remove last digit
            }
            num = sum;
        }
        return num;
    }
}