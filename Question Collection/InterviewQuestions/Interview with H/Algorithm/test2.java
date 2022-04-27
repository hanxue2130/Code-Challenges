package Questions.Collection.HoneyWell;

import java.util.Arrays;

public class test2 {
    public static void main(String[] args) {
        int [] a = new int [] {6,7,3,4,1,2};
        minimumSwaps(a);
    }
    static void minimumSwaps(int[] arr) {
        int n = arr.length;
        int minSwaps = 0;
        int[] temp = Arrays.copyOfRange(arr, 0, n);
        Arrays.sort(temp);
//        Collections.reverse(Arrays.asList(temp));
        for (int i = 0; i < n; i++) {
            if (arr[i]!=temp[i]) {
                minSwaps++;
                swap(arr,i,indexOf(arr,temp[i]));
            }
        }
        System.out.println(minSwaps);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    public static int indexOf(int[] arr, int ele) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ele) {
                return i;
            }
        }
        return -1;
    }
}
