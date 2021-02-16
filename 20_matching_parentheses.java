class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                char bracket;
                try {
                    bracket = stack.pop();
                } catch (Exception e) {
                    return false;
                }

                if (bracket == c - 1 || bracket == c - 2) {
                    continue;
                } else {
                    return false;
                }
            }
        }

        return stack.empty();
    }
}
