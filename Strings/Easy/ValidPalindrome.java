public class ValidPalindrome {

    boolean isPalindrome(String s, int l, int r) {

        while (l < r) {
            if (s.charAt(l) != s.charAt(r))
                return false;
            l++;
            r--;
        }

        return true;
    }

    public boolean validPalindrome(String s) {
        
        int misMatch = -1;
        int length = s.length() - 1;

        for (int i = 0; i <= length; i++) {
            if (s.charAt(i) != s.charAt(length - i)) {
                misMatch = i;
                break;
            }
        }

        if (misMatch == -1)
            return true;

        return isPalindrome(s, misMatch + 1, length - misMatch) || isPalindrome(s, misMatch, length - misMatch - 1);
    }
    
}
