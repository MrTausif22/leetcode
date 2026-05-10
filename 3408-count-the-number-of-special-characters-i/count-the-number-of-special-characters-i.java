// class Solution {
//     public int numberOfSpecialChars(String word) {
//         int count = 0;
//         char [] w = word.toCharArray();
//         for(int i=0; i< word.length(); i++){
//             for(int j = i+1; j <word.length(); j++){
//                 if(w[i] == (char)(w[j]+32)){
//                     count++;
//                 }
//             }
//         }
//         return count;
//     }
// }

class Solution {
    public int numberOfSpecialChars(String word) {

        boolean[] lower = new boolean[26];
        boolean[] upper = new boolean[26];

        // Mark lowercase and uppercase
        // for (char ch : word.toCharArray()) {
            char[] arr = word.toCharArray();
            for(int i=0; i<arr.length; i++){
                char ch = arr[i];
            if (Character.isLowerCase(ch)) {
                lower[ch - 'a'] = true;
            } else {
                upper[ch - 'A'] = true;
            }
        }
        int count = 0;
        for (int i = 0; i < 26; i++) {
            if (lower[i] && upper[i]) {
                count++;
            }
        }
        return count;
    }
}