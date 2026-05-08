public class editDistance {
    public int minDistance(String a, String b) {
        int p = a.length(), q = b.length();
        int[][] res = new int[p + 1][q + 1];
        
        for(int x = 0; x <= p; x++) res[x][0] = x;
        for(int y = 0; y <= q; y++) res[0][y] = y;
        
        for(int x = 1; x <= p; x++) {
            for(int y = 1; y <= q; y++) {
                if(a.charAt(x - 1) == b.charAt(y - 1)) {
                    res[x][y] = res[x - 1][y - 1];
                } else {
                    res[x][y] = 1 + Math.min(res[x - 1][y - 1], Math.min(res[x - 1][y], res[x][y - 1]));
                }
            }
        }
        return res[p][q];
    }
}
