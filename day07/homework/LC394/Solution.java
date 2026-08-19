class Solution {
    public String decodeString(String s) {
        Stack<Integer> nums = new Stack<>();
        Stack<String> strings = new Stack<>();

        String str = "";
        int num = 0;

        for (char ch : s.toCharArray()) {

            if (Character.isDigit(ch)) {
                num = num * 10 + (ch - '0');
            }

            else if (ch == '[') {
                nums.push(num);
                strings.push(str);
                num = 0;
                str = "";
            }

            else if (ch == ']') {
                int n = nums.pop();
                String old = strings.pop();

                for (int i = 0; i < n; i++) {
                    old += str;
                }

                str = old;
            }

            else {
                str += ch;
            }
        }

        return str;
    }
}