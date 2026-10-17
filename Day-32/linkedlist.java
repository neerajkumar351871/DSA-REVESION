public class  linkedlist
 {   // Create a  Single Node.
    public static class Node
    {
        int data;
        Node next;
        Node(int data)
       {
         this.data= data;
         this.next= null;
       }
    }
   public static Node head;
   public static Node tail;
        //   0(1)constant
      public void addFirst(int data)
      {
      //  Step 1:-Create a  Node
       Node  newNode = new Node(data);
       if(head==null)
       {
           head=tail= newNode;
           return;
       }
    // Step 2:-NewNode.next=head;
         newNode.next=head;
    // Step 3:-head= newNode;
        head= newNode; // link.
      }

     // Add Last.Time complexity 0(1)constant;
     public void AddLast(int data)
     { // Step 1:- Creat a node.
         Node  newNode = new Node(data);
         if(head==null)
         {
             head=tail=newNode;
             return;
         }
         
         // Step 2:-tail.next=newNode;
          tail.next=newNode;
         
         // Step 3:- Tail= newNode.
         tail=newNode;
          
     }
     //Print data; ->Time complexity 0(n);
       public void printlinkedList()
     {
         Node temp= head;
         if(temp==null)
         {
             System.out.println("Linked list is Empty");
         }
         while(temp!=null)
             {
                 System.out.print(temp.data+"->");
                 temp= temp.next;
             }
         System.out.print("null.");
         System.out.println();
         
     }
     // Calculate size of linkedlist.
     public  int calSize()
     {
         Node temp= head;
         int counter=0;
         if(temp==null)
         {
             return 0;
         }
         while(temp!=null)
             {
              counter++;
                 temp= temp.next;
             }
        return counter;
        }
     // Add the value in middle in linkedlist.
      public  void addMiddle(int data, int idx)
     {    
        // Step 1:- Create a Node.
         Node newNode= new Node(data);
        // Step 2: Find the idx. 
         Node prev= head;
         int i=0;
         while(i!=idx-1)
             {
                 prev=prev.next;
                 i++;
             }
       //  Step 3:-newNode.next=prev.next.
                   newNode.next=prev.next;
      //   Step 4:-prev.next = newNode;
                   prev.next= newNode;
         return;
       }
      // Remove first.
      public int removeFirst()
     {    // Corner case if linked list have  only single node.
         int size=calSize();
         if(size==1)
         {
             int data= head.data;
              head=tail=null;
         }
         else if(size==0)
         {
             System.out.println("LINKED LIST IS EMPTY.");
                 return Integer.MIN_VALUE;
         }
         // Step 1:- Store the value.
         int  val= head.data;
         // Step 2:- Break the link.
         head=head.next;
         return val;
     }
     // Remove last.
     public  int  removeLast()
     {  int size=calSize();
         // Step 1:-Check Corner case.
             if(size==1)
             {
                 int data= head.data;
                 head=tail=null;
                 return data;
             }
        else if(size ==0)
        {
            System.out.println("LINK LIST IS EMPTY !");
            return Integer.MIN_VALUE;
        }
         // Step 2:- Find  prev index..
         int i=0;
         Node prev= head;
         while(i<size-2)
             {
                 prev= prev.next;
                 i++;
             } 
         //  Step 3:- Take data in Tail node.
         int data=prev.data;
        // Step 4:-Remove the linking. 
         prev.next=null;
         tail=prev;
         return data;
         
     }
     //17-oct-2026.
     // Search in linked list and return ture/ false.
     public   boolean secrchinlinkedlist(int key)
     {
         Node temp= head;

         while(temp!=null)
             {
                 if(temp.data==key)
                 {
                     
                  return true;
                 }
                 temp=temp.next;
             }
         return false;
     }
     public  int searchll(int key)
     {
         Node temp=head;
         int i=0;
         while(temp!=null)
             {
                 if(temp.data==key)
                 {  
                     return i;
                 }
                 temp=temp.next;
                 i++;
             }
         return -1;
     }
     public  int helperfunction(Node head, int key)
     {
         if(head==null)
         {
             return -1;
         }
         if(head.data== key)
         {
             return 0;
         }
         int idx=helperfunction(head.next, key);
         
         if(idx==-1)
         {
             return -1;
         }
         return idx+1;
         
     }
     public int linkedlistSearch(int key)
         {
         return helperfunction(head, key);
         }
     // Reverse linked list.
     public  void reverselinkedlist()
     {
         Node prev= null;
         Node curr=head;
         Node next;
         while(curr!=null)
             {
                 next=curr.next;
                 curr.next=prev;
                 prev=curr;
                 curr=next;
             }
         head=prev;
     }
       public int deleteNthfromend(int idx) {
    int size = calSize();

    if (idx <= 0 || idx > size) {
        System.out.println("INDEX DOES NOT EXIST!");
        return Integer.MIN_VALUE;
    }

    if (idx == size) {
        int data = head.data;
        head = head.next;
        return data;
    }

    Node prev = head;
    int i = 0;

    while (i < size - idx - 1) {
        prev = prev.next;
        i++;
    }

    int data = prev.next.data;
    prev.next = prev.next.next;

    return data;
}

//------------------ Palindrome linked list-------------------.
  //SLOW FAST TECHNIQUE.
   public Node midvalue(Node head) {
    Node slow = head;
    Node fast = head;

    while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
    }

    return slow;
}

public boolean isCheckPalindrome() {
    if (head == null || head.next == null) {
        return true;
    }

    // Step 1: Find middle
    Node midNode = midvalue(head);

    // Step 2: Reverse second half
    Node prev = null;
    Node curr = midNode;
    Node next;

    while (curr != null) {
        next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
    }

    // Step 3: Compare both half.
    Node left = head;
    Node right = prev;

    while (right != null) {
        if (left.data != right.data) {
            return false;
        }

        left = left.next;
        right = right.next;
    }

    return true;
}
       public static void main(String args[])
        {
            LinkedList  ll = new LinkedList();
                ll.addFirst(1); 
                ll.addFirst(2);
                ll.addFirst(2);
                ll.addFirst(1);
                 
     
           // ll.AddLast(5);
           // ll.AddLast(6);
           ll.printlinkedList();
           // ll.addMiddle(10,5);
           // ll.printlinkedList();
           System.out.println("SIZE OF LINKEDLIST:"+ll.calSize());
           // System.out.println("REMOVE FIRST VALUE : "+ll.removeFirst());
           // ll.printlinkedList();
           // System.out.println("REMOVE  LAST VALUE : "+ll.removeLast());
           // ll.printlinkedList();
           // System.out.println("SIZE OF LINKEDLIST:"+ll.calSize());
           // System.out.println(ll.secrchinlinkedlist(2));
           // System.out.println(ll.searchll(5));
           // System.out.println(ll.linkedlistSearch(5));
           // System.out.println(ll.linkedlistSearch(19));
            // System.out.println("BEFORE REVERSE------------------------");
            // ll.printlinkedList();
            // ll.reverselinkedlist();
            // System.out.println("------------------------AFTER REVERSE");
            // ll.printlinkedList();
           System.out.println("DELEATED VALUE :"+ll.deleteNthfromend(5));
            ll.printlinkedList();
            System.out.println("SIZE OF LINKEDLIST:"+ll.calSize());
         System.out.println(ll.isCheckPalindrome());
             
                
            
        }
 }
   

      
    