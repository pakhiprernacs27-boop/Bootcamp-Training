class Solution {
    public String decodeAtIndex(String s, int k) {
        long len = 0;

        // Find decoded length
        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                len *= ch - '0';
            } else {
                len++;
            }
        }

        // Work backwards
        for (int i = s.length() - 1; i >= 0; i--) {
            k %= len;

            if (k == 0 && Character.isLetter(s.charAt(i))) {
                return String.valueOf(s.charAt(i));
            }

            if (Character.isDigit(s.charAt(i))) {
                len /= s.charAt(i) - '0';
            } else {
                len--;
            }
        }

        return "";
    }
}