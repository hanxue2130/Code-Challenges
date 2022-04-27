package AllwithDescription.test;

//The problem of monkey eating peaches: The monkey plucked several peaches on the first day, ate half of the peaches
//immediately, and was not addicted to it, and ate another one.
//The next morning, he ate half of the remaining peaches and ate another one.
//After that, I ate half and one of the leftovers from the previous day every morning. On the 10th morning,
//when I wanted to eat again,
//I saw that there was only one peach left.
//Find out how many you picked on the first day.

public class peach {

 public static void main(String[] args) {
  peach();
 }
 public static void peach(){
  int fin = 1;
  for (int i = 0; i <9; i++) {
   fin = (fin+1) * 2 ;
  }
  System.out.println(fin);
 }
}
