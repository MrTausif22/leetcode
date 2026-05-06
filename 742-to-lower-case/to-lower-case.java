class Solution {
    public String toLowerCase(String s) {
    // char[] c = s.toCharArray();
    // for(int i = 0; i< c.length; i++){
    //     if(c[i] >= 65 && c[i] <= 90){
    //         c[i] = (char) (c[i] +32);
    //     }
    // }
    // return String.valueOf(c);
    // }
    // //     return s.toLowerCase(); 

    String result = "";
    for(int i = 0; i< s.length(); i++){
        if('A' <= s.charAt(i) && 'Z' >= s.charAt(i)){
            result += (char) (s.charAt(i)+ 32);
        }else{
            result += s.charAt(i);
        }
    }
    return result;

    }
}