import java.util.Deque;
import java.util.LinkedList;
class Deques
    {
        static class Stack
        {
            Deque<Integer>deque= new LinkedList<>();
            public  void add(int data)
                {
                 deque.addLast(data);
                }
            public   int pop()
              {
               return deque.removeLast();
              }
           public  int peek()
             {
               return deque.getLast();
             }
           
        }
    static class  Queue
        {
             Deque<Integer>deque= new LinkedList<>();
            public void add(int data)
            {
                deque.addLast(data);
            }
            public  int remove()
            {
                return deque.removeFirst();
            }
            public int peek()
            {
                return deque.getFirst();
            }
            
        }
        public static void main(String args[])
        {
            // Stack s= new Stack();
            // s.add(1);
            // s.add(2);
            // s.add(3);
            // s.add(4);
            // System.out.println(" Last element:"+s.peek());
            // s.pop();
            //   System.out.println(" Last element:"+s.peek());
            // s.pop();
            // System.out.println(" Last element:"+s.peek());
            // s.pop();
            // System.out.println(" Last element:"+s.peek());
            // s.pop();
            Queue q = new Queue();
            q.add(1);
            q.add(2);
            q.add(3);
            q.add(4);
          
            System.out.println(q.peek());
            q.remove();
            System.out.println(q.peek());
            q.remove();
            System.out.println(q.peek());
            q.remove();
            System.out.println(q.peek());
            q.remove();
            
            
            
        }
    }