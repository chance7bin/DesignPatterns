package test.bin.ttt;

/**
 * @Description
 * @Author bin
 * @Date 2021/08/30
 */
public class WaysToStep {

    public static void main(String[] args) {

        int res = waysToStep(11);
        System.out.println(res);
    }

    /**
     *
     * @param n n阶台阶
     * @return 走法
     */
    public static int waysToStep(int n) {

        //动态规划：n 阶可以往前退一步，可以时n-1阶所有情况之和+可以时n-2阶所有情况之和+可以时n-3阶所有情况之和
        if(n==1) return 1;
        if(n==2) return 2;
        if(n==3) return 4;
        long dp1 = 1;
        long dp2 = 2;
        long dp3 = 4;
        long A = 1000000007;

        for(int i=4; i<=n; i++){

            long tmp = dp1;
            dp1 = dp2;
            dp2 = dp3;
            dp3 = (tmp + dp1 + dp2)%A;

        }
        return (int)dp3;
    }

}
