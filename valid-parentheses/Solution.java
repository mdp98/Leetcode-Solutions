class Solution {
    public boolean isValid(String s) {
        Stack<Character> openParenthesesStack = new Stack<Character>();
        HashMap<Character, Character> bracketMapping = new HashMap();
        bracketMapping.put(')', '(');
        bracketMapping.put('}', '{');
        bracketMapping.put(']', '[');
        for(int iterator = 0; iterator < s.length(); iterator++) {
            char bracket = s.charAt(iterator);
            if (
                bracket == '(' ||
                bracket == '{' ||
                bracket == '['
            ) {
                openParenthesesStack.push(bracket);
                continue;
            } else if (!openParenthesesStack.isEmpty() && openParenthesesStack.peek() == bracketMapping.get(bracket)){
                openParenthesesStack.pop();
            } else {
                return false;
            }
        }
        if(openParenthesesStack.isEmpty()) return true;
        return false;
    }
}