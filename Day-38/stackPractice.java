import java.util.*;
public class stackPractice
{  
// Question 1:- Push at the bottm of the stack.
 public static void  pushBottom(Stack<Integer> s, int data)
    {  
       if(s.isEmpty())
       {
           s.push(data);
           return;
       }
        int top= s.pop();
        pushBottom(s,data);
        s.push(top);
        return;
        
    }
// Question 2:-Print stack.
    public static void printStack(Stack<Integer> s)
    {
        while(!s.isEmpty())
            {
                System.out.println(s.peek()+" ");
                s.pop();         
            }
    }

// Question 2:-REVERSE STRING.
    public static String reverseString(String str)
    {
        Stack<Character> s= new Stack<>();
        int idx=0;
        while(idx<str.length())
            {
                s.push(str.charAt(idx));
                idx++;
            }
        StringBuilder result= new StringBuilder("");
        while(!s.isEmpty())
            {
                char  value=  s.pop();
                 result.append(value);
            }
        return result.toString();
    }
// QUESTION 3:- Reverse stack.
    // Time Complexity 0(n) and  Space 0(n);
    // public static   void reverseStack(Stack<Integer>s)
    // {  
    //     Stack<Integer> re= new Stack<>();
    //     while(!s.isEmpty())
    //         {
    //             int top= s.pop();
    //             re.push(top);
    //         }
    //     System.out.println("AFTER REVERSE");
    //     printStack(re);
      
    // }
    public static void reverseStack(Stack<Integer>s)
    {  if(s.empty())
        {
        return;
        }
        int top= s.pop();
        reverseStack(s);
        pushBottom(s,top);
       return;
    }
    public static void main(String args[])
    {
     Stack<Integer> s= new Stack<>();
    s.push(1);
    s.push(2);
    s.push(3);
    // pushBottom(s, 4);
    // printStack(s);
    // String str="Neeraj";
    // System.out.print(reverseString(str)+" ");
    reverseStack(s);
    printStack(s);
        
    }
    
}