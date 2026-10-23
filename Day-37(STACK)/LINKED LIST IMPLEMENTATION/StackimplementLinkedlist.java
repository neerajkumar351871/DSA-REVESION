public class StackimplementLinkedlist
    {  
//------------------------------CREATE A NODE-----------------------------------------//
        public static  class Node
            {
                int data;
                Node next;
                public Node(int data)
                {
                    this.data=data;
                    this.next=null;
                }
             }
//------------------------------MAKE A STACK-----------------------------------------//
        public  static  class Stack
{
             static Node head=null;
                 public static boolean isEmpty()
                {
                 //    if(head==null)
                 //    {
                 //        return true;
                 //    }
                    
                 // return false.
                    return head==null;
                }
// ----------------------------------PUSH FUN----------------------------------------
                public static void push(int data)
                {  
                    Node newNode= new Node(data);
                    if(isEmpty())
                    {
                        head= newNode;
                        return;
                    }
                    newNode.next= head;
                    head=newNode;
                    return;
                }
// ----------------------------------POP FUN----------------------------------------
                public  static int pop()
                {
                    if(isEmpty())
                    {
                        return -1;
                    }
                     int top= head.data;
                    head= head.next;
                    return top;
                }
    // -------------------------------PEEK FUN----------------------------------------
             public static int peek()
                {
                   if(isEmpty())
                   {
                       return -1;
                   }
                    return head.data;
                  }
//----------------------------------PRINT STACK--------------------------------------
            public static void printStack()
            {
                while(!isEmpty())
                {
                    System.out.print(peek()+"->");
                    pop();
                }
                System.out.println("NULL");
           }
//----------------------------------PRINT STACK--------------------------------------
          public static void size()
        {
         Node temp= head;
            int i=0;
            while(temp!=null)
                {
                    i++;
                    temp=temp.next;
                }
          System.out.println("STACK SIZE IS :"+i);
        }

}

        public static void main(String args[])
        {
            Stack s= new Stack();
            s.push(1);
            s.push(2);
            s.push(3);
            s.push(4);
            s.push(5);
            s.push(6);
            s.size();
            s.printStack();
            System.out.println(s.pop());
          
            
        }
    }