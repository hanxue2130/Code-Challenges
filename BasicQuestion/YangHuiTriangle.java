package AllwithDescription.test;

import java.util.Arrays;
//[Program 33] Print out Yang Hui's triangle (10 lines are required to be printed as shown below)
public class YangHuiTriangle {
    public static void testTrangle() {
        int in = 6;
        int[][] yh = new int[in][in];
        for (int i = 0; i < in; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    yh[i][j] = 1;
                } else {
                    yh[i][j] = yh[i - 1][j - 1] + yh[i - 1][j];
                }
            }
        }
        for (int i = 0; i < in; i++) {
            for (int j = in - i; j > 0; j--) {
                System.out.print(" "); //print 5 space
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(yh[i][j] + " "); //sout yh[0][0]
            }
            System.out.println(); //change lane
        }
    }

    public static void yhTrangle() {
        int row = 6;
        int[][] yanghui = new int[row][row];
        for (int i = 0; i < row; i++) {   //row
            for (int j = 0; j <= i; j++) {//column
                if (j == 0 || j == i) {
                    yanghui[i][j] = 1;
                } else {
                    yanghui[i][j] = yanghui[i - 1][j - 1] + yanghui[i - 1][j];
                }
            }
        }
        for (int[] a : yanghui) {
            System.out.println(Arrays.toString(a));
        }
        for (int i = 0; i < row; i++) {
            int num = row - i;
            for (int j = 0; j <= num; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print(yanghui[i][k] + " ");
            }
            System.out.println();
        }
    }
}
