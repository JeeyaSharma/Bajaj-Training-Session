public class MaxCircularSubArray {
    public static int kadaneMax(int[] arr) {

        int current = arr[0];
        int max = arr[0];

        for(int i = 1; i < arr.length; i++) {

            current = Math.max(arr[i], current + arr[i]);

            max = Math.max(max, current);
        }

        return max;
    }
    public static int kadaneMin(int[] arr) {

        int current = arr[0];
        int min = arr[0];

        for(int i = 1; i < arr.length; i++) {

            current = Math.min(arr[i], current + arr[i]);

            min = Math.min(min, current);
        }

        return min;
    }
    public static int maxCircularSum(int[]arr){
        int normalMax=kadaneMax(arr);
        int total=0;
        for(int x:arr){
            total+=x;
        }
        int minSubarray=kadaneMin(arr);
        int circularMax=total-minSubarray;
        if(normalMax<0)
        return normalMax;
        return Math.max(normalMax,circularMax);
    }
    public static void main(String[] args) {
       int[]arr={5,-3,5};
       System.out.println(maxCircularSum(arr));
       
    }
}
