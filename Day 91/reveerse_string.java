
class Solution {
    // Function to reverse words in a given string.
    String reverseWords(String S) {
        // code here
        String res = "";
        STring[] str = S.split("\\.");
        for (int i = str.length - 1; i >= 0; i--) {
            res = res + str[i] + ".";
        }
        return res.substring(0, res.length() - 1);
    }
}