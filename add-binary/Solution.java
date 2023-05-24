class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder("");
        int aIterator = a.length()-1;
        int bIterator = b.length()-1;
        boolean carry = false;
        while(aIterator >= 0 && bIterator >= 0) {
            if(a.charAt(aIterator) == '1') {
                if(b.charAt(bIterator) == '1') {
                    if(carry) {sb.append('1');} else {sb.append('0');}
                    carry = true;
                } else {
                    if(carry) {sb.append('0');} else {sb.append('1');}
                }
            } else {
                if(b.charAt(bIterator) == '1') {
                    if(carry) {sb.append('0');} else {sb.append('1');}
                } else {
                    if(carry) {sb.append('1');} else {sb.append('0');}
                    carry = false;
                }
            }
            aIterator--;
            bIterator--;
        }
        if(aIterator == -1 && bIterator == -1) {
            if(carry) {
                sb.append('1');
                return sb.reverse().toString();
            }
        } else if (aIterator == -1) {
            while(bIterator >= 0) {
                if(b.charAt(bIterator) == '1') {
                    if(carry) {sb.append('0');} else {sb.append('1');}
                } else {
                    if(carry) {sb.append('1');} else {sb.append('0');}
                    carry = false;
                }
                bIterator--;
            }
        } else {
            while(aIterator >= 0) {
                if(a.charAt(aIterator) == '1') {
                    if(carry) {sb.append('0');} else {sb.append('1');}
                } else {
                    if(carry) {sb.append('1');} else {sb.append('0');}
                    carry = false;
                }
                aIterator--;
            }
        }
        if(carry) sb.append('1');
        return sb.reverse().toString();
    }
}