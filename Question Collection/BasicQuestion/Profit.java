package AllwithDescription.test;


//Bonuses issued by enterprises are based on profit.
//When the profit (I) is less than or equal to 100,000 yuan,
//the bonus can be raised by 10%; when the profit is higher than 100,000 yuan
//and less than 200,000 yuan, the part less than 100,000 yuan will be commissioned by 10%,
//and if it is higher than 100,000 yuan 7.5% of the cocoa commission; between 200,000 to 400,000 yuan,
//the part higher than 200,000 yuan can get a 5% commission;
//between 400,000 to 600,000 yuan and more than 400,000 yuan,
//3% can be commissioned ; When between 600,000 and 1,000,000 yuan,
//the part higher than 600,000 yuan can be commissioned by 1.5%,
//and when it is higher than 1,000,000 yuan, the part exceeding 1,000,000 yuan will be commissioned at 1%,
//and the current month's profit I will be input from the keyboard. The total number of bonuses issued?


import java.util.Scanner;

public class Profit {
    public static void main(String[] args) {

    }
    public static void profit(){
        Scanner sc=new Scanner(System.in);
        System.out.println("please input");
        double profit=sc.nextDouble();
        double bonus=0.0;
        if(profit<=10)
            bonus=profit*0.1;
        else if(profit<20)
            bonus=10*0.1+(profit-10)*0.075;
        else if(profit<40)
            bonus=(profit-20)*0.05;
        else if(profit<60)
            bonus=(profit-40)*0.03;
        else if(profit<100)
            bonus=(profit-60)*0.015;
        else
            bonus=(profit-100)*0.01;
        System.out.println("the profit should be："+bonus+"");

    }

}
