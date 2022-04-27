package AllwithDescription.test;

//Decompose a positive integer into prime factors.
// For example: input 90, print out 90=2*3*3*5.
public class Decomposition {
    public static void main(String[] args) {
        method(100);
    }
    public static void method(int n){
        int tem = n;
        System.out.print(n+ "=");
        for (int i = 2; i < Math.sqrt(tem); i++) {
            if(n % i == 0){
                if(n/i==1){
                    System.out.print(i);
                    break;
                }
                System.out.print(i+"*");
                n/=i;
                i--;
            }
        }
    }
}
