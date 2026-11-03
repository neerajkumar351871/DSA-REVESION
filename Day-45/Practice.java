class Practice
    {  
// //-----------------------------------------Queue--------------------------------------------
//         static class Queue
//             {
//              static int arr[];
//             static int size;
//             static int rear;
//                 Queue(int n)
//                 {
//                     arr= new int[n];
//                     size= n;
//                      rear=-1;
//                 }
// //----------------------------------Queue Empty h ya nahi---------------------------------
//                  // Time Complexity->0(1)
//                 public static boolean isEmpty()
//                 {
//                 return rear==-1;
//                 }
// //----------------------------------------Add function--------------------------------------
//                // Time Complexity->0(1)
//                 public static  void add(int data)
//                 {
//                     if(rear==size-1)
//                     {
//                         System.out.println("QUEUE IS FULL");
//                         return;
//                     }
//                     rear= rear+1;
//                     arr[rear]=data;
//                     return;
//                 }
// //------------------------------------- Remove Function-------------------------------------
//                //Time Complexity->0(n)
//                 public static  int remove()
//                 {
//                     if(isEmpty())
//                     {
//                         System.out.println("QUEUE IS EMPTY");
//                         return -1;
//                     }
//                     int front=arr[0];
//                     for(int i=0;i<rear;i++)
//                         {
//                             arr[i]=arr[i+1];
//                         }
//                       rear= rear-1;
//                     return front;
//                 }
// //---------------------------------------PEEK-----------------------------------------------
//                 // Time Complexity->0(1)
//                 public static int peek()
//                 {
//                     if(isEmpty())
//                     {
//                         System.out.println("QUEUE IS EMPTY");
//                         return -1;
//                     }
//                     return arr[0];
//                 }
//             }

//-------------------------------------Circular_Queue-------------------------------------------
        static class Queue
            {
             static int arr[];
            static int size;
            static int rear;
            Static int front;
                Queue(int n)
                {
                    arr= new int[n];
                    size= n;
                    rear=-1;
                    front=-1;
                }
//----------------------------------Queue Empty h ya nahi---------------------------------
                 // Time Complexity->0(1)
                public static boolean isEmpty()
                {
                return rear==-1 && front==-1;
                }
//---------------------------------------FUllQueue----------------------------------------
                public static boolean isFull()
                {
                    return (rear+1)%size==front;
                }
//----------------------------------------Add function--------------------------------------
               // Time Complexity->0(1)
                public static  void add(int data)
                {
                    if(isFull())
                    {
                        System.out.println("QUEUE IS FULL");
                        return;
                    } 
                   // Add first time.
                    if(front==-1)
                    {
                     front=0;
                    }
                     // Update index.
                    rear= (rear+1)%size;
                    arr[rear]=data;
                    return;
                }
//------------------------------------- Remove Function-------------------------------------
               //Time Complexity->0(n)
                public static  int remove()
                {
                    if(isEmpty())
                    {
                        System.out.println("QUEUE IS EMPTY");
                        return -1;
                    }
                    
                    int result= arr[front];
                    // last el delete.
                     if(rear==front)
                     {
                         rear=front =-1;
                     }
                    else
                     {
                       front=(front+1)%size;   
                     }
                    return result;
                }
//---------------------------------------PEEK-----------------------------------------------
                // Time Complexity->0(1)
                public static int peek()
                {
                    if(isEmpty())
                    {
                        System.out.println("QUEUE IS EMPTY");
                        return -1;
                    }
                        return arr[front];
                }
            }

        public static void main(String args[])
        {
           Queue  q= new Queue(5);
            q.add(1);
            q.add(2);
            q.add(3);
  
            while(!q.isEmpty())
                {
                   System.out.println(q.peek());
                    q.remove();
                }
        }
    }