public class Backtracking
    {
        public static void changearr(int[]arr,int i, int val)
        {  // Base case.
            
            if(i==arr.length)
            {
                printarray(arr);
                return;
            }
            //Recurision call.
            arr[i]=val;
            changearr(arr ,i+1, val+1);
            arr[i]= val-2;// Backtacking.
        }
        public static void subset(String str,String ans , int i)
        {
            // Base case.
       if(i==str.length())
       {  
        if(ans.length()==0)
       {
           System.out.println("null");
       }
          else
       {
         System.out.println(ans);   
       }
          
         return;
       }
         // Recurision call.
        // Yess choice.
            subset(str,ans+str.charAt(i),i+1);
        // NO choice.
           subset(str, ans, i+1);
            
        }
        
    public static void printarray(int[] arr)
        {
            for(int i=0;i<arr.length;i++)
                {
                    System.out.print(arr[i]+" ");
                }
            System.out.println();
        }
public static void main(String args[])
        {
            int[]arr= new int[5];
            changearr(arr,0, 1);
            printarray(arr);
            String str="abc";
            subset(str," ",0);
        }
    }