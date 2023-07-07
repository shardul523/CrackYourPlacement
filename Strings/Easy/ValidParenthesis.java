import java.util.*;

class ValidParenthesis {
    public boolean isValid(String s) {
        Deque<Character> check = new ArrayDeque<>();
        HashMap<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') check.push(ch);
            else if (!check.isEmpty() && map.get(ch) == check.pop()) continue;
            else return false;
        }

        return check.isEmpty();
    }
}