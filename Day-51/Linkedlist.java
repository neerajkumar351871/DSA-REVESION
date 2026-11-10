import java.util.LinkedList;
class Linkedlist
{   

    public static  void  main(String args[])
    {
        LinkedList<Integer>ll = new LinkedList<>();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        ll.add(6);
        ll.add(7);
        ll.add(8);
        ll.add(9);
        // ll.addFirst(12);
        // ll.addLast(122);
        // Remove Method take a parameter and remoce specific value .
        System.out.println("REMOVE Specific element->"+ll.remove(4));
         // Remove First element.
         System.out.println("REMOVE FIRST ELEMENT->"+ll.removeFirst());
         // Remove  last element.
         System.out.println("REMOVE LAST ELEMENT->"+ll.removeLast());
        // Clear 
        //  ll.clear();
        // Take a  index and then return value.
        // System.out.println(ll.get(3));
        // Get First Element in the Linked list.
        System.out.println("Get First Element"+ll.getFirst());

        // Get Last element.
        System.out.println("Get Last Element"+ll.getLast());
        //  peekmethod() remove the element but this is work with queue.
       System.out.println("Return the elements:->"+ll.peekFirst());
       //PeekLast()Remove the last element but this is wrok withe queue.
        System.out.println("Return the elements:->"+ll.peekLast());

        for(int data:ll)
        {
           System.out.print(data+"->");
        }
        System.out.println("Null");
    
    }
}