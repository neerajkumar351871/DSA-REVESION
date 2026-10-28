import java.util.Stack;
public class Stacks
    {
// ----------------------------BRUTE FORCE----------------------------------------------------------
    // TIME COMPLEXITY O(N^2);
    // SPCAE COMPLEXITY O(1);
    // public static  void NextGreater(int[] arr)
    //     {
    //     int[] nextGreater= new int[arr.length+1];
    //     for(int i=0;i<arr.length;i++)
    //         {    nextGreater[i]=-1;
    //             for (int j = i + 1; j < arr.length; j++) {

    //             if (arr[i]<arr[j]) 
    //             {
    //                 nextGreater[i] = arr[j];
    //                 break;
    //             }
    //         }
    //         }
    //         for(int i=0;i<nextGreater.length;i++)
    //             {
    //                System.out.print(nextGreater[i]+" "); 
    //             }
    //     }
//---------------------------------------OPTMIZATION APPROACH-----------------------------------------
        public static void NextGreater(int[]arr)
        {
          Stack<Integer> s = new Stack<>();
         int[] nextGreater= new int[arr.length];
        for(int i=arr.length;i>=0;i--)
            {  
            //Step 1:- Compare karga or check karga stack empty h ya nahi
                while(!s.isEmpty() && arr[s.peek()]<=arr[i])
                    {
                        s.pop();
                    }
                // Step 2:- if-else.
                if(s.isEmpty())
                {
                    nextGreater[i]=-1;
                }
                else
                {
                  nextGreater[i]=arr[s.peek()];
                }
                // Step 3:-
                s.push(i);
              
            }
        printElement(nextGreater);
        }
        public static void  printElement(int arr[])
        {
            for(int i=0;i<arr.length;i++)
                {
                 System.out.print(arr[i]+" ");
                }
            System.out.println();
        }
    public static void main(String args[])
    {
        int[] arr={1,2,1};
        NextGreater(arr);
    }
    }
    