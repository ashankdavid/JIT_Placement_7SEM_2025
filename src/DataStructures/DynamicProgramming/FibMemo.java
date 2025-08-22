package DataStructures.DynamicProgramming;

// Memoization
public class FibMemo {
    static int fib(int x, int[] dp){
        if(x==0 || x==1){
            return x;
        }

        // step 3
        if(dp[x]!=0){
            return dp[x];
        }

        // step 2
        dp[x] = fib(x-1, dp) + fib(x-2, dp);
        return dp[x];
    }

    public static void main(String[] args) {
        int n = 100;
        int[] dp = new int[n+1];  // step 1
        System.out.println(fib(n, dp));
    }
}
