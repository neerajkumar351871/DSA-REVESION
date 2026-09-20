 class recursion
     {
 public static int firstOccurence(int arr[],int key, int i)
         {   // base case.
             
             if(i==arr.length-1)
             {
                 return -1;
             } 
             // Recursive call(kaam)
             if(key==arr[i])
             {
                 return i;
             }
             // Function call.
             
             return firstOccurence(arr, key, i+1) ;
         }
         public  static int lastOccurence(int[] arr, int key, int i)
         {
             if(i==arr.length)
             {
                 return -1;
             }
             int isfound=lastOccurence(arr, key, i+1);
             if(isfound==-1 && arr[i]==key)
             {
                 return i;
             }
             return isfound;
         }
         public static int isPower(int n, int a)
         {
            // Base case.
             if(n==0)
             {
                 return 1;
             }
             int halfpower= isPower(n/2, a);
             int halfpowersqr= halfpower*halfpower;
             if(n%2==1)
             {
                halfpowersqr = halfpowersqr*a;
             }
             
             return halfpowersqr;
         }
         public static void main(String args[])
         {
             int arr[]={8,3,6,9,5,10,2,5,3};
             System.out.println("INDEX IS NOT FOUND:"+firstOccurence(arr, 5,0));
             System.out.println("Last Occurance:"+lastOccurence(arr, 5,0));
             System.out.println("CHECK POWER:"+isPower(4,2));
             System.out.println(4%2);
             System.out.println(4/2);
        
         }
     }