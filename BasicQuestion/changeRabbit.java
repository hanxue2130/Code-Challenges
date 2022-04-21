package test;

public class ChangeRabbit {
//    There is a pair of rabbits. From the third month after birth, a pair of rabbits are born every month.
//    After the little rabbit grows to the third month, another pair of rabbits is born every month.
//    If the rabbits are not dead, ask the rabbits of each month. What is the total?
    public static void main(String[] args) {

    }
    public static void ChangeRabbit(){
        int n = 20;
        int [] record = new int[n+1];
        record[0] = 1;
        record[1] = 1;
        for (int i = 2; i < n; i++) {
            record[i] = record[i-1] + record[i-2];
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(record[i]);
        }
    }
    //Keep only two records
    public static void ChangeRabbit1(){
        int result,tem1=1,tem2=1;
        System.out.println(tem1);
        System.out.println(tem2);
        for (int i = 2; i < 20; i++) {
            result = tem1+tem2;
            tem1 = tem2;
            tem2 = result;
            System.out.println(result);
        }
    }

}
