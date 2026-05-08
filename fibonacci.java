public class fibonacci {
    public int fib(int v) {
        if (v <= 1) return v;
        int x = 0, y = 1;
        for (int k = 2; k <= v; k++) {
            int t = x + y;
            x = y;
            y = t;
        }
        return y;
    }
}
