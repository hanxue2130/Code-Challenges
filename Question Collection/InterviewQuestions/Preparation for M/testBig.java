package Questions.Collection.Mthree;

import java.math.BigInteger;

public class testBig {



    public static void main(String[] args) {
        long s = 10000000;
        BigInteger end = new BigInteger(String.valueOf(s));
        for (BigInteger i = BigInteger.ZERO; i.compareTo(end) < 0;
             i = i.add(BigInteger.ONE))
        {
            System.out.println(i);
        }
    }
}
