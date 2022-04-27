package Questions.Collection.Mthree;

public class twinprime {
    public static void main(String[] args) {
        for (int i = 10; i < 100; i++) {
            if(findPrime(i)){
                System.out.println(i);
            }
        }
    }
    public static boolean findPrime(int n){
        if(n == 1 || n == 2){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}
