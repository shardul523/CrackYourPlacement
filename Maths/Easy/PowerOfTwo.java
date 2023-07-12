package Maths.Easy;

import java.io.Console;

class PowerOfTwo {
    // A better appraoch would be n & (n - 1)
    public static boolean isPowerOfTwo(int n) {

        if (n < 0)
            return false;

        boolean bitSet = false;

        for (int i = 0; i < 32; i++) {
            if ((n & (1 << i)) != 0) {
                if (bitSet)
                    return false;
                bitSet = true;
            }
        }

        return bitSet;
    }

    public static void main(String[] args) {
        System.out.println("Enter number to check for power of two: ");
        Console con = System.console();
        int x = Integer.parseInt(con.readLine());

        System.out.print(x + " is ");
        if (isPowerOfTwo(x))
            System.out.println("a power of two.");
        else
            System.out.println("is not a power of two.");
    }
}