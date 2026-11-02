public class QueueB_ArrayImplementation
    {
// -----------------------------Array Implementation----------------------------------------------
        // static class Queue
        //     {
        //          static int arr[];
        //          static int size;
        //          static int rear;
                
        //         Queue(int n)
        //         {
        //             arr= new  int [n];
        //             size=n;
        //             rear= -1;
        //         }
        //         // isEmpty
        //         public static boolean isEmpty()
        //         {
        //             return rear==-1;
        //         }
        //         // Push.
        //         public static void add(int data)
        //         {
        //             // Check Queue is full or not
        //             if(rear==size-1)
        //             {
        //                 System.out.println("QUEUE US FULL");
        //                 return;
        //             }
        //             rear= rear+1;
        //             arr[rear]=data;
        //         }
        //         // Remove.
        //         public static int remove()
        //         {
        //             // Check karo queue empty to nahi h.
        //             if(isEmpty())
        //             {
        //                 System.out.println("QUEUE IS EMPTY.");
        //                 return -1;
        //             }
        //             int front = arr[0];
        //             for(int i=0; i<rear;i++)
        //                 {
        //                     arr[i]=arr[i+1];
        //                 }
        //             rear= rear-1;
        //             return front;
        //         }
        //         // peek.
        //         public static  int peek()
        //         {   if(isEmpty())
        //             {
        //                 System.out.println("QUEUE IS EMPTY");
        //                 return -1;
        //             }
        //             int front= arr[0];
        //             return front;
        //         }
        //     }

//---------------------------------------Circular Queue---------------------------------------
    static class Queue
            {
                 static int arr[];
                 static int size;
                 static int rear;
                 static int front;
                
                Queue(int n)
                {
                    arr= new  int [n];
                    size=n;
                    rear= -1;
                    front=-1;
                }
                // isEmpty
                public static boolean isEmpty()
                {
                    return rear==-1 && front==-1;
                }
            // FUll
                 public static boolean isFull()
                {
                    return (rear+1)% size== front;
                }
                // Push.
                public static void add(int data)
                {
                    // Check Queue is full or not
                    if(isFull())
                    {
                        System.out.println("QUEUE US FULL");
                        return;
                    }
                   // add first elemnt.
                    if(front ==-1)
                    {
                        front =0;
                    }
                    rear=(rear+1)%size;
                    arr[rear]=data;
                }

                // Remove.
                public static int remove()
                {
                    // Check karo queue empty to nahi h.
                    if(isEmpty())
                    {
                        System.out.println("QUEUE IS EMPTY.");
                        return -1;
                    }
                    int result= arr[front];
                    // When deltete last element.
                    if(rear== front)
                        {
                            rear= front=-1;
                        }
                    else
                    {
                    front= (front+1)% size;
                    }
                    return  result;
                }
                // peek.
                public static  int peek()
                {   if(isEmpty())
                    {
                        System.out.println("QUEUE IS EMPTY");
                        return -1;
                    }
                    int  value= arr[front];
                    return value;
                }
            }
        public static void main(String args[])
        {
            Queue q= new Queue(3);
            q.add(1);
            q.add(2);
            q.add(3);
            System.out.println(q.remove());
            q.add(4);
            System.out.println(q.remove());
            q.add(5);
            while(!q.isEmpty())
                {
                    System.out.println(q.peek());
                    q.remove();
                }
        }
    }