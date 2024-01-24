class Solution {
    public String longestCommonPrefix(String[] strs) {
        String ans = "";//initialize string 

        if (strs.length == 0)
            return "";//zero asel tar empty string 

        if (strs.length == 1)
            return strs[0];//direct 1st element 

        int k = 0;

        while (k < strs[0].length() && (strs.length == 1 || k < strs[1].length())) {
            if (strs[0].charAt(k) == strs[1].charAt(k)) {
                ans = ans + strs[0].charAt(k);
            } else {
                break;
            }
            k++;
        }

        if (strs.length == 2)
            return ans;

        int l = 0;
        String temp = "";

        for (int i = 2; i < strs.length; i++) {
            l = 0; // Reset l for each new string
            temp = "";

            while (l < ans.length() && l < strs[i].length()) {
                if (ans.charAt(l) == strs[i].charAt(l)) {
                    temp = temp + ans.charAt(l);
                    l++;
                } else {
                    break;
                }
            }

            ans = temp; // Update ans after comparing with each string
        }

        return ans;
    }
}
