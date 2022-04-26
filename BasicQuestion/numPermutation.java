package AllwithDescription.test;
//With 1, 2, 3, and 4 numbers, how many different three-digit numbers can be formed without repeating numbers?
//        How much are they?
public class numPermutation {
    public static void main(String[] args) {
        numPermutation();
    }
    public static void numPermutation(){
        int count = 0;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                for (int k = 1; k <= 4; k++) {
                    System.out.print(i+j*10+k*100+" ");
                    count++;
                }
            }
        }
        System.out.println("the total number of the desired thing is: "+count);
    }
    public static void numPermutation1(){
        for (int i = 100; i < 999; i++) {
            int unit=i  % 10;
            int ten= i /10 % 10;
            int hundred = i /10 /10 % 10;
            if(unit<=4 && ten <= 4 && hundred<=4 && unit >0 && ten >0 && hundred>0){
                System.out.print(unit + ten*10 + hundred*100 + " ");
            }
        }
    }
}
