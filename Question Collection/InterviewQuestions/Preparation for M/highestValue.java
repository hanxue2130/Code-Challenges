package Questions.Collection.Mthree;

import java.util.Arrays;

public class highestValue {
    public static void main(String[] args) {
        int [] arr = {1,3,4,5,6,7,7,8,9,0,10};
        Arrays.sort(arr);
        for (int i = arr.length-1; i > arr.length-3; i--) {
            System.out.println(arr[i]);
        }
    }
}
