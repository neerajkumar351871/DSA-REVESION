import  java.util.LinkedList;
class predefinedlinkedlist
{
    public static void main(String args[])
    {
    LinkedList<Integer> ll= new LinkedList();
    // ADD FIRST/ LAST.
    ll.addLast(1);
    ll.addLast(2); 
     ll.addFirst(0);
     // 0->1->-2->.
     System.out.println(ll);
     // REMOVE FIRST/ LAST.
     ll.removeFirst();
     ll.removeLast();
    System.out.println(ll);


    }
}