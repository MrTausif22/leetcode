// class Solution {
//     public boolean isSameAfterReversals(int num) {
//         int original = num;
//         int reverseOnes = 0;
//         int reverseTwice = 0;

//         while (num != 0){
//             int digit = num % 10;
//             reverseOnes = reverseOnes * 10 + digit;
//             num = num /10;
//         }

//         if (original == isSameAfterReversals(reverseOnes));
//             return true;
//         }
//         else {
//             return false;
//         }
//     }
// }
class Solution {
    public boolean isSameAfterReversals(int num) {
        if(num == 0){
            return true;
        }
        if (num % 10 == 0){
            return false;
        }
        return true;
    }
}