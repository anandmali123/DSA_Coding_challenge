import java.util.StringTokenizer;

class Solution {
    public String reverseWords(String s) {
        StringBuilder t = new StringBuilder(s).reverse();
        String sg = t.toString();
        StringTokenizer tr = new StringTokenizer(sg, " ");
        String ans = "";
        while (tr.hasMoreTokens()) {
            StringBuilder st = new StringBuilder(tr.nextToken()).reverse();
            ans += st;
            ans += " ";

        }
        ans.trim();
        return ans.trim();
    }
}