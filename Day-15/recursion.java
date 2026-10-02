public class recursion
    {
        // Freinds pairing problem.
        public static  int frpapr(int n)
        {
           // base case.
          if(n==1||n==2)
          {
              return n;
          }
         // // Choise.
         //    //Single.
         // int single=frpapr(n-1);
         // // pair.
         // int pair=frpapr(n-2);
         //  //  pairways.
         //  int pairways= (n-1)*pair;
         //    int totalways=single+pairways;
         //  return totalways ;
            return frpapr(n-1)+(n-1)*frpapr(n-2);
          
        }
        public static void printbinstring(int n, int lastplace, String str)
        {   // Base case.
            if(n==0)
            {
               System.out.println(str);
                return;
            }
            // Recursive call.
            printbinstring(n-1, 0,str+"0");
            if(lastplace==0)
            {
              printbinstring(n-1,1,str+"1");  
            }
                
        }
        public static void occurrenceindices(int arr[], int i, int key)
        {
            // Base case
            if(i==arr.length)
            {
                return;
            }
            // kaam
            
            if(arr[i]==key)
            {
             System.out.print(i+" ");
            }
            occurrenceindices(arr, i+1, key);
            
        }
        public static int ConvertIntoString(int n)
        {   StringBuilder adddata= new StringBuilder();
            String arr[]={"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"}
            // base case.
                if(n==0)
            {
                System.out.print(adddata);
                return 0;
            }
            // kaam;
             
            adddata.append(ConvertIntoString(n%10));
            
            return 
                
        }
        public static void main(String args[])
        {
          //System.out.println("Total ways: "+frpapr(5));
            printbinstring(3,0,"");
            int arr[]={3, 2, 4, 5, 6, 2, 7, 2, 2};
            int key=2;
            occurrenceindices(arr,0,key);
        }
    }