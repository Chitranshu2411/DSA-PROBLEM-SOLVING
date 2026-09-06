class Solution {
    public String interpret(String command) {

        StringBuilder ans = new StringBuilder();

        int i = 0;

        while (i < command.length()) {

            if (command.charAt(i) == 'G') {
                ans.append("G");
                i++;
            }
            else if (command.startsWith("()", i)) {
                ans.append("o");
                i += 2;
            }
            else if (command.startsWith("(al)", i)) {
                ans.append("al");
                i += 4;
            }
        }

        return ans.toString();
    }
}