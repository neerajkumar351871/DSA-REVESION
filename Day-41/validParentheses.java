import  java.util.*;
public class validParentheses
    {  public static boolean vaildP(String s)
       {
           Stack<Character> sc= new Stack<>();
           for(int i=0;i<s.length();i++)
               {
                   char ch= s.charAt(i);
                   // OPENING.
                   if(ch=='[' || ch =='{'|| ch=='(')
                   {
                       sc.push(ch);
                   }
                   else
                   {
                       //closing part.
                       if(sc.isEmpty())
                       {
                           return false;
                       }
                   if((sc.peek()=='(' && ch==')')||(sc.peek()=='[' && ch==']')||(sc.peek()=='{' && ch=='}'))
                   {
                       sc.pop();
                   }
                else
                   {
                       return false;
                   }
                   }
                  
               }
           if(sc.isEmpty())
           {
               return true;
           }
           else
           {
               return false;
           }
       }
        public static void main(String args[])
        {
            String str= "({})[]";
            System.out.println("OUR  RESULT :->"+vaildP(str));
        }
    }