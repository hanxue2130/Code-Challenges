package Questions.Collection.Mthree;

public class halve {
    public static void main(String[] args) {
        int [] test = {1,2,3,4,5,6,7,8};
        int mid = test.length/2;
//        StringBuilder sb = new StringBuilder();
        int [] sb = new int[test.length];
        int index = 0;
        for (int i = mid; i < test.length; i++) {
//            sb.append(test[i]);
                sb[index] = test[i];
                index ++;
        }
        for (int i = 0; i < mid; i++) {
//            sb.append(test[i]);
            sb[index] = test[i];
            index++;
        }
//        System.out.println(sb);
        for (int i = 0; i < test.length; i++) {
            if(i < test.length-1) System.out.print(sb[i] + ",");
            else System.out.println(sb[i]);
        }
    }
}
