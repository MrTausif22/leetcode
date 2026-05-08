// class Solution {
//     public String capitalizeTitle(String title) {
//         String [] words = title.split(" ");
//         for(int i = 0; i< words.length; i++){
//             String w = words[i].toLowerCase();

//             if(w.length()> 2){
//                 w = Character.toUpperCase(w.charAt(0)) + w.substring(1);
//             }
//             words[i] = w;
//         }
//         return String.join(" ",words);
//     }
// }

class Solution {
    public String capitalizeTitle(String title) {

        String[] words = title.toLowerCase().split(" ");

        for (int i = 0; i < words.length; i++) {

            if (words[i].length() > 2) {
                words[i] = Character.toUpperCase(words[i].charAt(0))
                        + words[i].substring(1);
            }
        }

        return String.join(" ", words);
    }
}