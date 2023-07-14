import java.util.ArrayDeque;
import java.util.Deque;

public class NextGreaterElement1 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        int[] nextGreater = new int[10001];
        int[] res = new int[nums1.length];
        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = nums2.length; i > 0; i--) {
            nextGreater[nums2[i - 1]] = i - 1;
            while (!stack.isEmpty() && stack.getLast() < nums2[i - 1])
                stack.removeLast();
            if (stack.isEmpty())
                nextGreater[nums2[i - 1]] = -1;
            else
                nextGreater[nums2[i - 1]] = stack.getLast();
            stack.addLast(nums2[i - 1]);
        }

        for (int i = 0; i < nums1.length; i++) {
            res[i] = nextGreater[nums1[i]];
        }

        return res;
    }
}
