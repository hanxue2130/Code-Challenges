package Questions.Collection.Mthree;

import java.util.Iterator;
import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.add("this");
        stack.add("is");
        stack.add("test");
        Iterator value = stack.iterator();
        while(value.hasNext()){
            if(value.next()=="is"){
                stack.pop();
            }

//            System.out.println(value.next());
        }
        System.out.println(stack);
    }
}
