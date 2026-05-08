import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class combinationSum {
     public List<List<Integer>> combinationSum(int[] arr, int v) {
        List<List<Integer>> out = new ArrayList<>();
        Arrays.sort(arr);
        backtrack(out, new ArrayList<>(), arr, v, 0);
        return out;
    }
    
    private void backtrack(List<List<Integer>> out, List<Integer> tmp, int[] arr, int rem, int s) {
        if (rem < 0) return;
        else if (rem == 0) out.add(new ArrayList<>(tmp));
        else {
            for (int k = s; k < arr.length; k++) {
                tmp.add(arr[k]);
                backtrack(out, tmp, arr, rem - arr[k], k);
                tmp.remove(tmp.size() - 1);
            }
        }
    }
}
