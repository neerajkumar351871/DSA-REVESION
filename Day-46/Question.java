import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
class Question
    { 
//         static class Queue
//             {
//                 static Stack<Integer>s1= new Stack<>();
//                 static Stack<Integer>s2= new Stack<>();
// //--------------------------------------CheckEmptyFunction--------------------------------------
//                 public static  boolean isEmpty()
//                 {
//                     return s1.isEmpty();
//                 }
// //---------------------------------------Add queue---------------------------------------------------
//                 public  static void add(int data)
//                 {
//                     while(!s1.isEmpty())
//                         {
//                             s2.push(s1.pop());
//                         }
//                     s1.push(data);
//                     while(!s2.isEmpty())
//                         {
//                             s1.push(s2.pop());
//                         }
//                 }
// //-----------------------------------Remove data---------------------------------------------------
//                 public static  int remove()
//                 {
//                     if(isEmpty())
//                     { 
//                         System.out.println("QUEUE IS EMPTY");
//                       return -1;  
//                     }
//                     return s1.pop();
//                 }
// //------------------------------------Peek function------------------------------------------------
//                 public static int peek()
//                 {
//                     if(isEmpty())
//                     {
//                         System.out.println("QUEUE IS EMPTY");
//                         return -1;
//                     }
//                     return s1.peek();
//                 }
// //--------------------------------------Print function--------------------------------------------
//                 // public static void printQueue()
//                 // {   while(!s1.isEmpty())
//                 //     {
//                 //     System.out.print(s1.peek());
//                 //     s1.remove();
//                 //     }
//                 // }
//             }
//         public static void main(String args[])
//         {
//           Queue q= new Queue();
//             q.add(1);
//             q.add(2);
//             q.add(3);
//             q.add(4);
//             while(!q.isEmpty())
//                 {
//                     System.out.println(q.peek());
//                     q.remove();
//                 }
//         }

// Question 4:-first non repeating letter in a stram of character.
 public static void nonRepeating(String str)
                    {
                     int map[]= new int[25];
                    Queue<Character>q= new LinkedList<>();
                    for(int i=0;i<str.length();i++)
                   {
                         char ch= str.charAt(i);
                         q.add(ch);
                         map[ch-'a']++;
                   while(!q.isEmpty()&&map[q.peek()-'a']>1)
                    {
                    q.remove();                               
                    }
                   if(q.isEmpty())
                   {
                                   System.out.print("-1"+" ");
                   }
                  else
                   {
                                   System.out.print(q.peek()+" ");
                   }
                                 
                  }
                                    System.out.println();
 }
 // Question 5:-
        public static void intervales(Queue<Integer>q)
           {
              Queue<Integer>firsthalf= new LinkedList<>();
                int size= q.size();
                for(int i=0;i<size/2;i++)
                {
                   firsthalf.add(q.remove());                             
                }
                while(!firsthalf.isEmpty())
                {
                    q.add(firsthalf.remove());
                    q.add(q.remove());
                }
                           
           }
// Question 6:- Reverese Queue.
 public static void reverseQueue(Queue<Integer> q)
             {
               Stack<Integer>s = new Stack<>();
                             while(!q.isEmpty())
                                {
                                 s.push(q.remove());                             
                                }
                             while(!s.isEmpty())
                                {
                                q.add(s.pop());                           
                                }
             }
public static void main(String args[])
 {
                 // String str="aabccxb";
                 // nonRepeating(str);
                 Queue<Integer> q= new LinkedList<>();
                 for(int i=1;i<=10;i++)
                {
                     q.add(i);                            
                }
                // intervales(q);
                 reverseQueue(q);
                 while(!q.isEmpty())
                       {
                       System.out.print(q.peek()+" ");
                                q.remove();
                       }
 }





































                    
    }