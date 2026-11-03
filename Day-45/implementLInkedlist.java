   public class implementLInkedlist
        { 
          static class Node
              {
                  int data;
                  Node next;
                  Node(int data)
                  {
                      this.data= data;
                      this.next=null;
                  }
              }
          static class Queue
              {
                   static Node head = null;
                  static Node tail = null;
    // -----------------------------------Check empty function--------------------------------------------
                  public static  boolean  isEmpty()
                  {
                      return head==null &&  tail==null;
                  }
    //-------------------------------Add Function---------------------------------------------------------
                  public static void add(int data)
                  {
                    Node newNode = new Node(data);
                      if(head==null)
                      {
                          head=tail=newNode;
                          return;
                      }
                      tail.next= newNode;
                      tail= newNode;
                  }
    //--------------------------------------Remove Function-----------------------------------------------
                  public static int remove()
                  {
                      if(isEmpty())
                      {
                          return -1;
                      }
                      int result= head.data;
                      //Single element.
                      if(tail==head)
                      {
                         tail= head=null;
                      }
                      else
                          {
                              head= head.next;
                          }
                      return result;
                  }
//--------------------------------------Peek Element-----------------------------------------------
                  public static int peek()
                  {
                      if(isEmpty())
                      {
                          System.out.println("QUEUE IS EMPTY");
                          return-1;
                      }
                      return head.data;
                  }
    
//---------------------------------Print qeue------------------------------------------------------
                  public static void printQueue()
                  {
                      while(!isEmpty())
                          {
                              System.out.println(peek());
                              remove();
                          }
                    
                  }
              }
            
             public static void main(String args[])
            { 
              Queue q = new Queue();
              q.add(1);
              q.add(2);
              q.add(3);
              q.add(4);
              q.add(5);
              q.printQueue();
            
            
            
            }
        }