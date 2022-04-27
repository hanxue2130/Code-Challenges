package Questions.Collection.HoneyWell;

import java.util.ArrayList;
import java.util.List;

public class minimalSwap {
    public static void main(String[] args) {
        List<Integer> p = new ArrayList<>();
        p.add(3);
        p.add(4);
        p.add(1);
        p.add(2);
        System.out.println(method1(p));
        for (int i = 0; i < p.size(); i++) {
            System.out.println(p.get(i));
        }
    }
    public static int method1(List<Integer> p){
        int count = 0;
        for (int i = 0; i < p.size()-1; i++) {
                if(i<p.get(i)-1){
                    swap(i,Math.min(p.size()-1,p.get(i)-1),p);
                    count++;
                    i--;
                }
        }
        return count;
    }

    private static void swap(int i, int i1, List<Integer> p) {
        int s = p.get(i);
        p.set(i,p.get(i1));
        p.set(i1,s);
    }
}
