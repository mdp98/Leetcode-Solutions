class Solution {
    public boolean isPalindrome(String s) {
        char[] strToCharArray = s.trim().toLowerCase().toCharArray();
        int left = 0;
        int right = strToCharArray.length-1;
        while(left < right) {
            if(!isAlphaNumericCharacter(strToCharArray[left])) {
                left++;
                continue;
            }
            if(!isAlphaNumericCharacter(strToCharArray[right])) {
                right--;
                continue;
            }
            if(strToCharArray[left] != strToCharArray[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public boolean isAlphaNumericCharacter(char c) {
        if((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9')) return true;
        return false;
    }
}