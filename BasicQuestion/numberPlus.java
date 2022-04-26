package AllwithDescription.test;
//    Find the value of s=a+aa+aaa+aaaa+aa...a, where 'a' is a number. For example,
//    2+22+222+2222+22222 (there are 5 numbers added at this time),
//    and the addition of several numbers is controlled by the keyboard.
public class NumberPlus {
    public static void main(String[] args) {
        method1();
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
}
