public class countVowelsAndConsonants {
     public int[] countVowelsAndConsonants(String str) {
        int a1 = 0;
        int a2 = 0;
        str = str.toLowerCase();
        
        for (char x : str.toCharArray()) {
            if (x >= 'a' && x <= 'z') {
                if (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u') {
                    a1++;
                } else {
                    a2++;
                }
            }
        }
        
        return new int[]{a1, a2};
    }
}
