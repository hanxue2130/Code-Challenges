package AllwithDescription.test;

// Enter a line of characters, and count the number of
// English letters, spaces, numbers and other characters in it.
public class digitcheck {
    public static void main(String[] args) {
        String a = "adfjkldasfj<>?<>? 12321321";
        int digitCount = 0, spaceCount=0, elseCount=0;
        for (int i = 0; i < a.length(); i++) {
            if(Character.isLetter(a.charAt(i))){
                digitCount++;
            }
            else if(a.charAt(i)==' '){
                spaceCount++;
            }
            else{
                elseCount++;
            }
        }
        System.out.println(" digitCount: "+digitCount + " spaceCount: " + spaceCount+ " elseCount: " + elseCount );
    }
}
