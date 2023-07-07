public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        int minLength = 200;

        for (int i = 0; i < strs.length; i++) 
            minLength = Math.min(strs[i].length(), minLength);
        
        for (int i = 0; i < minLength; i++) {
            for (int j = 0; j < strs.length - 1; j++) {
                if (strs[j].charAt(i) != strs[j+1].charAt(i))
                    return strs[0].substring(0, i);
            }
        }

        return strs[0].substring(0, minLength);
    }
}
