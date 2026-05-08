import java.util.ArrayList;
import java.util.List;

public class letterCombinationsOfPhoneNo {
    private static final String[] M = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
    
    public List<String> letterCombinations(String d) {
        List<String> out = new ArrayList<>();
        if (d.isEmpty()) return out;
        combination("", d, 0, out);
        return out;
    }
    
    private void combination(String p, String d, int o, List<String> out) {
        if (o == d.length()) {
            out.add(p);
            return;
        }
        String l = M[d.charAt(o) - '0'];
        for (int k = 0; k < l.length(); k++) {
            combination(p + l.charAt(k), d, o + 1, out);
        }
    }
}
