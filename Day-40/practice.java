// class practice
//     {  
//         public static void pushBottom(Stack s , int data)
//        {
//            if(s.isEmpty())
//            {
//                s.push(data);
//                return;
//            }
//            int top= s.pop();
//            pushBottom(s,data);
//             s.push(top);
//        }
//         public static void main(String args[])
//         {
//           Stack sc= new  Stack();
//             sc.push(1);
//             sc.push(2);
//             sc.push(3);
//             // sc.push(4);
//             // sc.push(5);
//             pushBottom(sc,4);
//             sc.printStack();
            
//         }
    
//     } 
//  public class Stack
//     {
//      static ArrayList<Integer> list=  new ArrayList<>();
//         // OPERATION OF  STACK.
//         //  PUSH POP, PEEK,
// // -----------------------------------------IS EMPTY--------------------------------------------
//           public static boolean isEmpty()
//               {
//                   return  list.size()==0;
//               }
// // -----------------------------------------PUSH OPERATION--------------------------------------

//          public static void push(int data)
//              {
//              list.add(data);
//               return;
//              }
// // -----------------------------------------POP OPERATION------------------------------------
//       public static int  pop()
//           {
//             if(isEmpty())
//             {
//                 return -1;
//             }
//           int data= list.get(list.size()-1);
//                     list.remove(list.size()-1);
//                     return data;
//           }
// // -----------------------------------------PEEK OPERATION------------------------------------
//       public static int peek()
//           {
//            if(isEmpty())
//             {
//                 return -1;
//             }
//           return  list.get(list.size()-1);
//             }
// // -----------------------------------------PRINT OPERATION-----------------------------------

//       public static void  printStack()
//         {
//         while(!isEmpty())
//             {
//                 System.out.println(peek());
//                 pop();
//             }
//         }
//  }



// class stacks {

//     static class Node {
//         int data;
//         Node next;

//         Node(int data) {
//             this.data = data;
//             this.next = null;
//         }
//     }

//     static class stack {
//         static Node head = null;

//         // Check whether stack is empty
//         public static boolean isEmpty() {
//             return head == null;
//         }

//         // PUSH
//         public static void push(int data) {
//             Node newNode = new Node(data);

//             newNode.next = head;
//             head = newNode;
//         }

//         // POP
//         public static int pop() {
//             if (isEmpty()) {
//                 return -1;
//             }

//             int data = head.data;
//             head = head.next;
//             return data;
//         }

//         // PEEK
//         public static int peek() {
//             if (isEmpty()) {
//                 return -1;
//             }

//             return head.data;
//         }

//         // PRINT STACK without deleting elements
//         public static void printStack() {
//             Node temp = head;

//             while (temp != null) {
//                 System.out.println(temp.data);
//                 temp = temp.next;
//             }
//         }
//     }

//     public static void main(String args[]) {
//         stack.push(1);
//         stack.push(2);
//         stack.push(3);
//         stack.push(4);
//         stack.push(5);
//         stack.push(6);

//         stack.printStack();
//     }
// }

// class Solution {
//     public void moveZeroes(int[] nums) {
//       int k=0;
//       for(int i=0;i<nums.length;i++)
//       {
//         if(nums[i]!=0)
//         {
//             nums[k]=nums[i];
//             k++;
//         }

//       } 
//       while(k<nums.length)
//       {
//         nums[k]=0;
//         k++;
//       } 
//     }
// }