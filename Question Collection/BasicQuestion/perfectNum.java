package AllwithDescription.test;

//An integer, it is a perfect square number after adding 100,
//and adding 168 is a perfect square number, what is the number?

public class perfectNum {
    public static void main(String[] args) {

    }
    public static void perfectNum(){
        int x,y;
        for (int i = 1; i < 100000; i++) {
            x = (int) Math.sqrt(i+100);
            y = (int) Math.sqrt(i+100+168);
            if(x*x == i + 100 && y*y == i+268){
                System.out.println(i);
            }

        }
    }
}
