
import java.util.Stack;
public class collection {

    public static void printStack(Stack<Integer>s) 
    {
      while(!s.isEmpty())
      {
        System.out.print(s.peek()+" ");
        s.pop();
      }
    }

    public static void main(String args[]) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        printStack(s);


    }
}
