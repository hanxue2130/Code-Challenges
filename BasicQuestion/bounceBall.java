package AllwithDescription.test;

//A ball falls freely from a height of 100 meters,
//and bounces back to half of its original height after each landing;
//if it falls again, how many meters does it travel when it hits the ground for the 10th time?
// How high is the 10th rally?
public class bounceBall {
    public static void main(String[] args) {

    }
    public static void bounceBall(){
        double height = 100;
        double pass =  height;
        for (int i = 0; i < 10; i++) {
            height /= 2;
            pass += height * 2;
        }
        System.out.println(pass);
    }
}
