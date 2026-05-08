public class climbingStairs {
    public int climbStairs(int k) {
        if (k == 1) return 1;
        int x = 1;
        int y = 2;
        for (int j = 3; j <= k; j++) {
            int z = x + y;
            x = y;
            y = z;
        }
        return y;
    }
}
