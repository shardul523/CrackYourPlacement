package Maths.Easy;

public class AddBinary {
    public String addBinary(String a, String b) {
        StringBuilder num1 = new StringBuilder(a); 
        StringBuilder num2 = new StringBuilder(b);
        StringBuilder binSum = new StringBuilder();
        
        num1.reverse();
        num2.reverse();

        int n = a.length();
        int m = b.length();
        int carry = 0;
        int sum = 0;

        for (int i = 0; i < Math.max(n, m); i++) {
            sum = carry;
            if (i < n) sum += num1.charAt(i) - '0';
            if (i < m) sum += num2.charAt(i) - '0';
            carry = sum / 2;
            sum %= 2;
            sum += '0';
            binSum.append((char)sum);
        }

        if (carry > 0) binSum.append('1');

        binSum.reverse();

        return binSum.toString();
    }
}
