package arrays;

public class secondLargest {
    public int getSecondLargest(int[] arr) {
        int largest = -1;
        int slargest = -1;
        for(int num: arr){
            if(num>largest){
                slargest = largest;
                largest = num;
            }else if(num>slargest && num!=largest){
                slargest = num;
            }
        }
        return slargest;
    }
}
