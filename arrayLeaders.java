

import java.util.ArrayList;
import java.util.Collections;

public class arrayLeaders {
    static ArrayList<Integer> leaders(int arr[]) {
        ArrayList<Integer> ans = new ArrayList<>();
        int maxRight = Integer.MIN_VALUE;
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]>=maxRight){
                ans.add(arr[i]);
                maxRight = arr[i];
            }
        }
        Collections.reverse(ans);
        return ans;
    }
}
