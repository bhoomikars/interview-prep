public class Day1 {

    // https://leetcode.com/problems/climbing-stairs/description/?envType=study-plan-v2&envId=top-interview-150
    public int climbStairs(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        return solveClimbStairs(dp, n);
    }

    private int solveClimbStairs(int[] dp, int idx) {

        // base condition
        if (idx == 0 || idx == 1) {
            return 1;
        }

        // caching
        if (dp[idx] != -1) {
            return dp[idx];
        }

        return dp[idx] = solveClimbStairs(dp, idx - 1) + solveClimbStairs(dp, idx - 2);
    }
    
}
