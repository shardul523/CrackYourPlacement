class TwoStacksInArray {
    private int left;
    private int right;
    private int[] twoStacks;

    TwoStacksInArray() {
        left = 0;
        right = 200;
        twoStacks = new int[201];
    }

    // Function to push an integer into the stack1.
    void push1(int x) {
        twoStacks[left++] = x;
    }

    // Function to push an integer into the stack2.
    void push2(int x) {
        twoStacks[right--] = x;
    }

    // Function to remove an element from top of the stack1.
    int pop1() {
        if (left == 0)
            return -1;
        return twoStacks[--left];
    }

    // Function to remove an element from top of the stack2.
    int pop2() {
        if (right == 200)
            return -1;
        return twoStacks[++right];
    }
}