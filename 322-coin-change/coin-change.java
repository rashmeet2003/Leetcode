class Solution{
    int dp[][];
    public int coinChange(int[] coins, int amt){
        int n = coins.length;
        dp = new int[n][amt+1];
        for(int[] row : dp){
            Arrays.fill(row,-1);
        }
        int ans = solve(0,coins,amt,dp);
        return ans>=Integer.MAX_VALUE ? -1 : ans;
    }
    public int solve(int i, int[] coins, int amt, int[][] dp){
        if(amt==0) return 0;
        if(i>=coins.length) return Integer.MAX_VALUE;
        if(dp[i][amt] != -1) return dp[i][amt];

        int nottake = solve(i+1,coins,amt,dp);
        int take = Integer.MAX_VALUE;
        if(amt>=coins[i]){
            int res = solve(i,coins,amt-coins[i],dp);
            if(res != Integer.MAX_VALUE){
                take = 1 + res;
            }
        }
        return dp[i][amt] = Math.min(take,nottake);
        }
}