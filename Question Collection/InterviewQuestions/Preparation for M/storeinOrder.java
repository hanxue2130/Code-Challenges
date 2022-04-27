package Questions.Collection.Mthree;

public class storeinOrder {
    public static void main(String[] args) {
        int [] a = {1,23,4,43,543,56,345,34,0,0,0,123,4,0};
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            if(a[i]!= 0){
                sb.append(a[i]+",");
            }
        }
        System.out.println(sb.substring(0,sb.length()-1));
    }
}
