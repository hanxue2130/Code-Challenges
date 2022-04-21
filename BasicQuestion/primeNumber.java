package AllwithDescription.test;

public class primeNumber {
//    How many prime numbers there are between 101-200, and output all prime numbers.
    public static void main(String[] args) {
        for (int i = 101; i <= 200; i++) {
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }

    public static boolean isPrime(int num){
        if(num == 1 || num == 0)return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if(num % i ==0)return false;
        }
        return true;
    }
}
