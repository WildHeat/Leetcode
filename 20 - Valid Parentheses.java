class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char bracket : s.toCharArray()) {
            if (bracket == '[' || bracket == '(' || bracket == '{') {
                stack.push(bracket);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char openingBracket = stack.pop();
                if ((openingBracket == '(' && bracket == ')')
                        || (openingBracket == '[' && bracket == ']')
                        || (openingBracket == '{' && bracket == '}')) {
                    continue;
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}