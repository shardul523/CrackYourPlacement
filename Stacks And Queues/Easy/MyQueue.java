public class MyQueue {

    int[] insertionStack;
    int[] removalStack;
    int length1;
    int length2;

    public MyQueue() {
        insertionStack = new int[100];
        removalStack = new int[100];
        length1 = length2 = 0;
    }

    public void push(int x) {
        insertionStack[length1++] = x;
    }

    public int pop() {
        if (length2 == 0)
            while (length1 > 0)
                removalStack[length2++] = insertionStack[--length1];

        return removalStack[--length2];
    }

    public int peek() {
        if (length2 == 0)
            while (length1 > 0)
                removalStack[length2++] = insertionStack[--length1];

        return removalStack[length2 - 1];
    }

    public boolean empty() {
        return length1 == 0 && length2 == 0;
    }
}
