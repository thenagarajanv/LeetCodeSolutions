// 2124. Check if All A's Appears Before All B's
// Given a string s consisting of only the characters 'a' and 'b', return true if every 'a' appears before every 'b' in the string. Otherwise, return false.

class Solution {
    public boolean checkString(String s) {
        for(int i = 0; i < s.length()-1; i++){
           if(s.charAt(i) == 'b' && s.charAt(i+1) == 'a'){
               return false;
           }
        } 
        return true;
    }
}
