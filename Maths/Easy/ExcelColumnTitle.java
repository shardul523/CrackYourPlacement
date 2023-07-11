package Maths.Easy;

public class ExcelColumnTitle {
    public String convertToTitle(int columnNumber) {
        
        String alphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder title = new StringBuilder();
        final int MOD = 26;

        while (columnNumber > 0) {
            int d = (--columnNumber) % MOD;
            title.append(alphabets.charAt(d));
            columnNumber /= 26;
        }

        title.reverse();

        return title.toString();
    }
}
