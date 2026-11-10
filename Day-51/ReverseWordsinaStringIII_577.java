
import java.util.Stack;
import java.util.*;

class ReverseWordsinaStringIII_577
{
      public static String reverseWords(String s) {
           Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        int size = s.length();

        for(int i = 0; i < size; i++)
        {
            char ch = s.charAt(i);

            if(ch == ' ')
            {
                while(!stack.isEmpty())
                {
                    sb.append(stack.pop());
                }

                if(i != 0 && i != size - 1)
                {
                    sb.append(' ');
                }
            }
            else
            {
                stack.push(ch);
            }
        }

        // Last word reverse karna
        while(!stack.isEmpty())
        {
            sb.append(stack.pop());
        }

        
     return sb.toString(); 
    }
   
 public static void main(String[] args) {
     String str="Let's take LeetCode contest";
    System.out.println(reverseWords(str));
     
 }
}