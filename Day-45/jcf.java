import java.util.ArrayDeque;
import java.util.Queue;
class jcf
{  
     public static void main(String[] args) {
    //  Queue<Integer> q= new LinkedList<>(); // Linklist h
     Queue<Integer>q= new ArrayDeque<>();
     q.add(1);
     q.add(2);
     q.add(3);
     q.add(4);
     printQueue(q);
}
     public static void printQueue( Queue<Integer> q)
{
   while(!q.isEmpty())
   {
    System.out.print(q.peek()+"->");
    q.remove();
   }
}
}