public class Main {
    public int countWays(int x, int y) {

        // write code here
        if(x==1||y==1){
            return 1;
        }
        return countWays(x-1,y)+countWays(x,y-1);
        /**
         * x代表向下，y代表向右
         * 机器每次要么向下走，要么向右走
         * 如果向下走，就是求（x-1,y）有多少种走法
         * 如果向右走，就是求（x,y-1）有多少种走法
         * 直到x=1，或者y=1，也就是只有一条线段的时候才有1种走法
         */
    }
}
