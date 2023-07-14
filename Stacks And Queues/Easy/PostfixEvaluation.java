import java.util.ArrayDeque;
import java.util.Deque;

public class PostfixEvaluation {
    static int evaluate(Deque<Integer> dq, char op) {
        int b = dq.pollLast();
        int a = dq.pollLast();
        
        switch(op) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                return a / b;
        }
        
        return -1;
    }
    
    
    public static int evaluatePostFix(String S)
    {
        Deque<Integer> operandStack = new ArrayDeque<>();
        int length = S.length();
        
        for (int i = 0; i < length; i++) {
            char ch = S.charAt(i);
            if (ch >= '0' && ch <= '9')
                operandStack.addLast(ch - '0');
            else {
                int exp = evaluate(operandStack, ch);
                //System.out.println("Adding "+exp);
                operandStack.addLast(exp);
            }
        }
        
        return operandStack.pollLast();
    }
}
