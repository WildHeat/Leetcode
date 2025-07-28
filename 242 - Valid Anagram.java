class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        int[] count = new int[26];
        for(int index = 0; index < s.length(); index++){
            count[s.charAt(index) - 'a']++;
            count[t.charAt(index) - 'a']--;
        }
        for(int numCount : count){
            if(numCount != 0) return false;
        }
        return true;
    }
}