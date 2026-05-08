public class decodeWays {
    public int numDecodings(String t) {
        if (t == null || t.length() == 0 || t.charAt(0) == '0') {
            return 0;
        }
        
        int k = t.length();
        int[] arr = new int[k + 1];
        arr[0] = 1;
        arr[1] = 1;
        
        for (int p = 2; p <= k; p++) {
            int d1 = Integer.valueOf(t.substring(p - 1, p));
            int d2 = Integer.valueOf(t.substring(p - 2, p));
            
            if (d1 >= 1 && d1 <= 9) {
                arr[p] += arr[p - 1];
            }
            if (d2 >= 10 && d2 <= 26) {
                arr[p] += arr[p - 2];
            }
        }
        return arr[k];
    }
}
