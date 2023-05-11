class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] charCount = new int[26];
        for(char character : magazine.toCharArray()) {
            charCount[character - 'a']++;
        }
        for(char character : ransomNote.toCharArray()) {
            if(charCount[character - 'a'] == 0) {
                return false;
            }
            charCount[character - 'a']--;
        }
        return true;
    }
}