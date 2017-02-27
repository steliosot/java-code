public class Solution {
    public String reverseString(String s) {
        int l=s.length();
        char[] set = new char[s.length()];
        for(int i=0;i<s.length();i++){
            set[l-i-1]=s.charAt(i);
        }
        return String.valueOf(set);
    }
}