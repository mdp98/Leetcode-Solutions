class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        int[] count = new int[26];
        Arrays.fill(count, 0);
        for(char c : s.toCharArray()) {
            count[c - 'a']++;
        }
        for(char c : t.toCharArray()) {
            count[c - 'a']--;
            if(count[c - 'a'] < 0) {
                return false;
            }
        }
        for(int charCount : count) {
            if(charCount != 0) {
                return false;
            }
        }
        return true;
    }
}