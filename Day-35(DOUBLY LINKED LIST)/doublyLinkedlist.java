public class doublyLinkedlist
    {
        public static class Node
            {
                int data;
                Node next;
                Node prev;
                public Node(int data)
                {
                    this.data= data;
                    this.next=null;
                    this.prev=null;
                }
            }
          public static Node head;
          public static Node tail;
        // ---------------------CALCULATE SIZE----------------------------------
        public int DLsize()
        {
         Node temp=head;
            //CHECK IF TEMP AGAR NULL HO TOO.
            if(temp== null)
            {
                System.out.println("DOUBLY LINKED LIST IS EMPTY");
                return -1;
            }int i=0;
            while(temp!=null)
                {
                   i++;
                    temp=temp.next;
                }
            return i;
        }
       //---------------------PRINT LINKED LIST----------------------------------
        public  void printDoublylinkedlist()
        {
            Node temp= head;
            if(temp==null)
            {
                System.out.println("DOUBLY LINKED LIST IS EMPTY");
                return;
            }
            while(temp!=null)
                {
                    System.out.print(temp.data+"<---->");
                    temp=temp.next;
                }
           System.out.println("null.");
            return;
        }
//------------------------------ADD FIRST------------------------------------
        public void addFirst(int data)
        {    
            //STEP 1:- CREATE NEWNODE.
             Node newNode= new Node(data);
           if(head==null)
           {
                       head=tail=newNode;
                       return;
           }
           //STEP 2:-NEWNODE.NEXT=HEAD.
             newNode.next=head;
          //STEP 3:-HEAD.PREV=NEWNODE.
            newNode.prev=newNode;
         //  STEP 4:- HEAD= NEWNODE.
            head=newNode;
            return;
            
        }
//------------------------------ADD LAST------------------------------------
            public void addLast(int data)
                {
                   // Step 1:- CREATE A   newNode.
                  Node newNode= new Node(data);
                   // Step 2:- CHECK HEAD =NULL.
                        if(head==null )
                        {
                        head=tail=newNode;
                        return;
                        }
               // Step 3:-tail.next=newNode;
                            tail.next=newNode;
             // Step 4:-NEWNODE.PREV=TAIL;  
                        newNode.prev=tail;
            
            // Step 5:-TAIL= NEWNODE; 
                        tail= newNode;
                            return;
                }
////------------------------------ADD IN THE MIDDLE------------------------------------
          public  void addMiddle(int data, int idx)
            {  
                     // Step 1:- CREATE A NEWNODE.
                     Node newNode= new Node(data);
                        if(head==null)
                        {
                         head=tail=newNode;
                         return;
                        }
                  // STEP 2:- FIND PREV NODE.
                         int i=0;
                         Node temp=head;
                        int  con=idx-2;
                        while(i!=con)
                        {
                        i++;
                        temp=temp.next;                       
                        }
               // STEP 3:- temp.next.prev=newNode.
                         temp.next.prev=newNode;
             // STEP 4:- newNode.prev=temp.
                         newNode.prev=temp;
            // STEP 5:- newNode= prev.next.next.
                         newNode=temp.next.next;
            // Step 6:-prev.next= newNode;
                         temp.next= newNode;
                        return;
                        
                        
            }

// ----------------------- REMOVE FIRST------------------------------.
  public int removeFirst()
                {            
                            if(head==null)
                            { 
                             System.out.println("LINKED LIST IS EMPTY [MESSAGE FROM REMOVE  FIST LINKEDLIST]");
                             return Integer.MIN_VALUE;
                            }
                            int size=DLsize();
                            if(size==1)
                            {
                                        int data=head.data;
                                        head=tail=null;
                                        return data;
                            }
                            //STEP  1:-TAKE DATA FROM HEAD.
                            int data=head.data; 
                            //STEP  2:-CHANGE THE HEAD.
                            head= head.next;
                            // STEP 3:-BREAK THE CONNECTION.
                            head.prev=null;
                            return data;
                }
// ----------------------- REMOVE FIRST------------------------------.



// ----------------------- REVERSE DOUBLY LINKED LIST------------------------------.
                public  void reverseDoublylinkedlist()
                {
                             Node  curr= head;
                            Node prev=null;
                            Node next;
                            while(curr!=null)
                                        {
                                        next=curr.next;
                                        curr.next=prev;
                                        curr.prev= next;
                                        prev=curr;
                                        curr=next;
                                        }
                            head=prev;
                }
   public static void main(String args[])
            {   doublyLinkedlist dll= new doublyLinkedlist();
                dll.addFirst(8);
                dll.addFirst(7);
                dll.addFirst(6);
                dll.addFirst(5);
                dll.addFirst(4);
                dll.addFirst(3);
                dll.addFirst(2);
                dll.addFirst(1);
             System.out.println("-------SIZE  OF LINKED LIST-------");
             System.out.println("DOUBLY LINKED LIST SIZE : "+ dll.DLsize());
             System.out.println("-------PRINT DOUBLY LINKED  LIST-------");
             dll.printDoublylinkedlist();
             System.out.println("-------REMOVE FIST ELEMENT-------");   
             System.out.println("REMOVE THE FIRST ELEMENT IN THE LINKEDLIST : "+dll.removeFirst());
             dll.printDoublylinkedlist();
            System.out.println("--------------------REVERSE LINKED LIST--------------------");
            dll.reverseDoublylinkedlist();
            dll.printDoublylinkedlist();
            System.out.println("--------------------ADD LAST--------------------");
            dll.addLast(9);
            dll.printDoublylinkedlist();
            System.out.println("-------------ADD VALUE IN ANY INDEX-------");
            dll.addMiddle(10,3);
            dll.printDoublylinkedlist();
                
   
        }
    }