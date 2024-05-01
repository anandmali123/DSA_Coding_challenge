class Solution{
    static int countMin(String str)
    {
        String s=new StringBuilder(str).reverse().toString();
        int dp[][]=new int[str.length()+1][str.length()+1];
        for(int i=1;i<=str.length();i++){
            for(int j=1;j<=s.length();j++){
                if(str.charAt(i-1)==s.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }
                else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return str.length()-dp[str.length()][str.length()];
    }
}