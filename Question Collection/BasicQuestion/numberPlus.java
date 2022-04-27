package AllwithDescription.test;
//    Find the value of s=a+aa+aaa+aaaa+aa...a, where 'a' is a number. For example,
//    2+22+222+2222+22222 (there are 5 numbers added at this time),
//    and the addition of several numbers is controlled by the keyboard.
public class NumberPlus {
    public static void main(String[] args) {
        method2();
    }
    public static void method1(){
        int a = 1, b = 5, c = a;
        for (int i = 1; i <= b; i++) {
            System.out.print(a+"+");
            a = a * 10 + c;
            if(i==b){
                System.out.print(a);
                break;
            }
        }
    }
    public static void method2(){
        int a = 2;
        int b = 5;
        System.out.print(a);
        for (int i = 1; i <= b; i++) {
            int count = i;
            int tem = 0;
            a = 2;
            while(count!=0){
                a = a * 10;
                tem += a;
                count--;
            }
            tem += 2;
            System.out.print("+" + tem);
        }
    }

}
