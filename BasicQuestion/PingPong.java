package AllwithDescription.test;

import Questions.Collection.basicQ.Test;

import java.util.HashSet;

//Two table tennis teams compete, each with three players. Team A consists of three people a, b, and c,
//        and team B consists of three people, x, y, and z. The roster has been drawn to determine the competition.
//        Someone asked the players about the roster for the game.
//        a says he doesn't compare with x, c says he doesn't compare with x, z,
//        please program to find out the list of three teams.
public class PingPong {
    public static void main(String[] args) {

    }
    public static void pingPong1(){
        String[] str = {"X","Y","Z"};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    Test t = new Test(str[i], str[j], str[k]);
                    if(!t.A.equals(t.B) && !t.A.equals(t.C)&&!t.B.equals(t.C)
                            && !t.A.equals("X") && !t.C.equals("X")&& !t.C.equals("Z")){
                        System.out.println("A-->" + t.A);
                        System.out.println("B-->" + t.B);
                        System.out.println("C-->" + t.C);
                    }
                }
            }
        }
    }
    public static void pingPong(){
        String [] aTeam = {"a","b","c"};
        String [] bTeam = {"x","y","z"};
        HashSet<StringBuilder> hs = new HashSet<>();
        for(String aE:aTeam){
            StringBuilder sb = new StringBuilder();
            for (String bE:bTeam){
                if((aE == "a" && bE!="x") || (aE == "b") || (aE=="c"&& bE!="z" && bE!="x")){
                    sb.append(aE);
                    sb.append(bE);
                    sb.append(" ");
                    hs.add(sb);
                }
            }
        }
        System.out.println(hs);
    }
}
