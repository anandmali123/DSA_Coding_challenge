class Solution {

    // Top Down

    // static int dp[][];

    // static int helper(String s, String t, int idxS, int idxT){
    // if(idxT==t.length()) return 1;
    // if(idxS==s.length()) return 0;

    // if(dp[idxS][idxT]!=-1) return dp[idxS][idxT];

    // if(s.charAt(idxS)==t.charAt(idxT)){
    // int a = helper(s,t,idxS+1,idxT+1);
    // int b = helper(s,t,idxS+1,idxT);
    // return dp[idxS][idxT] = a+b;
    // }else{
    // return dp[idxS][idxT] = helper(s,t,idxS+1,idxT);
    // }
    // }

    // Bottom Up

    static int helper2(String s, String t) {
        int dp[][] = new int[1005][1005];

        for (var a : dp)
            Arrays.fill(a, 0);

        for (int i = 0; i <= s.length(); i++) {
            dp[i][t.length()] = 1;
        }

        for (int idxS = s.length() - 1; idxS >= 0; idxS--) {
            for (int idxT = t.length() - 1; idxT >= 0; idxT--) {
                if (s.charAt(idxS) == t.charAt(idxT)) {
                    dp[idxS][idxT] = dp[idxS + 1][idxT + 1] + dp[idxS + 1][idxT];
                } else {
                    dp[idxS][idxT] = dp[idxS + 1][idxT];
                }
            }
        }

        return dp[0][0];
    }

    public int numDistinct(String s, String t) {

        // dp = new int[1005][1005];
        // for(var a : dp) Arrays.fill(a,-1);
        if (s.length() < t.length())
            return 0;
        return helper2(s, t);
    }
}