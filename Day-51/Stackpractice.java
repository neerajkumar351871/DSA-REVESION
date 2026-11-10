import java.util.Stack;
public class Stackpractice {

    public static void stackOperation(Stack<Integer> s) {
        // check stack is empty or not
        System.out.println("STACK IS EMPTY OR NOT--->>"+s.isEmpty());
        // Check size.
        System.out.println("CHECK SIZE  STACK->"+s.size());
        // Search element return element.
        System.out.println("RETURN INDEX->"+s.search(1));
        // Contains element or not return true or false.
        System.out.println("RETURN TRUE OR FALSE:->"+s.contains(3));
        // Get  element take index and give value.
        System.out.println("GET ELEMENT"+s.get(4));
        // Set value take index and value.
        // s.set(index, element)  last sa  index count hoga .
          s.set(2, 1222);
          // Remove index.
        //    s.remove(9);
        // Clear all element.
        //    s.clear();
        // System.out.println(s.toArray());  covert into array.
       // Take first element.
       System.out.println("TAKE FIRST ELEMENT->"+s.firstElement());
       // Take last Element.
       System.out.println("TAKE A LAST ELEMENT->"+s.lastElement());
    }
    public static void printStack(Stack<Integer>s)
    {
        while(!s.isEmpty())
        {
           System.out.print(s.peek()+" ");
           s.pop();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);
        s.push(7);
        s.push(8);
        s.push(9);
      
        stackOperation(s);
        printStack(s);
        // System.out.println(Arrays.toString(s));
      

    }
}
