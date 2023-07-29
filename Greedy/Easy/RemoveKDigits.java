package Greedy.Easy;

import java.util.ArrayDeque;
import java.util.Deque;

public class RemoveKDigits {
    public String removeKdigits(String num, int k) {
        StringBuilder removed = new StringBuilder();
        Deque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < num.length(); i++) {
            char curr = num.charAt(i);
            if (k == 0) {
                if (!(stack.isEmpty() && curr == '0'))
                    stack.addLast(curr);
                continue;
            }
            // System.out.println(stack.peekLast() + " " + k + " " + curr);
            while (!stack.isEmpty() && stack.peekLast().charValue() > curr && k-- > 0)
                stack.pollLast();

            if (stack.isEmpty() && curr == '0')
                continue;

            stack.addLast(curr);
        }

        while (k-- > 0)
            stack.pollLast();

        while (!stack.isEmpty())
            removed.append(stack.pollLast());

        removed.reverse();

        if (removed.length() == 0)
            removed.append('0');

        return removed.toString();
    }
}
