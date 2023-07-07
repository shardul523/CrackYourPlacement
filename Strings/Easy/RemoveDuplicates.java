class RemoveDuplicates {
    String removeDuplicates(String str) {
        int[] charCount = new int[256];
        StringBuilder uniqueStr = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            charCount[ch]++;
            if (charCount[ch] > 1) 
                continue;
            uniqueStr.append(ch);
        }

        return uniqueStr.toString();
    }
}
