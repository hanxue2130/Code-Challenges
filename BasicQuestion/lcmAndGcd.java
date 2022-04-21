package AllwithDescription.test;
//Input two positive integers m and n,
// find their greatest common divisor and least common multiple.
public class lcmAndGcd {

    public static void main(String[] args) {
        get_lcm(10,20);
    }
    public static void get_lcm(int a, int b){
        int lcm = grades(a,b);
        System.out.println(lcm);
        System.out.println(a*b/lcm);
    }
    public static int grades(int a, int b){
        if (b>a){
            int tem;
            tem = a;
            a = b;
            tem = b;
        }
        int temp;
        while(b!=0){
            temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
    public static int grades2(int a,int b){
        if(b == 0){
            return a;
        }
        return grades2(b,a%b);
    }
}
