package Maths.Easy;

class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        if (x < 9) return true;

        String strx = Integer.toString(x);
        int length = strx.length();

        int i = 0;
        int j = length - 1;

        while (i < j) {
            if (strx.charAt(i++) != strx.charAt(j--))
                return false;
        }

        return true;
    }
}