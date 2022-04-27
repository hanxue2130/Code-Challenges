package AllwithDescription.test;

public class threeNumComparing {
    public static void main(String[] args) {

    }
    public static void threeNum() {
        int a = 31;
        int b = 11;
        int c = 7;
        //the most straightforward way
        if (a > b) {
            if (a > c) {
                System.out.println(a);
            } else {
                if (c > b) {
                    System.out.println(c);
                } else {
                    System.out.println(b);
                }
            }
        } else {
            if (b > c) {
                System.out.println(b);
            } else {
                if (c > a) {
                    System.out.println(c);
                } else {
                    System.out.println(b);
                }
            }
        }
    }
    public static void threeNum1() {
        int a = 1;
        int b = 9;
        int c = 6;
        if (a < b) {
            int t = a;
            a = b;
            b = t;
        }
        if (b < c) {
            int t = b;
            b = c;
            c = t;
        }
        if (a < c) {
            int t = a;
            a = c;
            c = t;
        }
        System.out.println(a + " " + b + " " + c);
    }

}
