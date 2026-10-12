import java.util.ArrayList;
import java.util.Collections;
class ArraylistRevesion {
    public static void  printArraylist(ArrayList<Integer> list, int i)
    {
       // Print arraylist.
      // base case.
        if(i==list.size())
        {
            return ;
        }
        // Recurive call.
        System.out.print(list.get(i));
        printArraylist(list, i+1);
        
}
    public static void reverseArrayList(ArrayList<Integer>list,int start, int end)
    {
        //Base case.
        if(start>=end)
        {
            return ;
        }
            int temp = list.get(start);
            list.set(start, list.get(end));
            list.set(end, temp);
        reverseArrayList(list, start+1,end-1);
        
        return ;
        
    }
    public static void main(String[] args) {
      ArrayList<Integer> list= new ArrayList<>();
        // Add element.
        list.add(7);
        list.add(4);
        list.add(2);
        list.add(3);
        list.add(9);
        list.add(8);
        list.add(0);
        // reverseArrayList(list,0,list.size()-1);
        // System.out.print(list);
       //  printArraylist(list,0);
       //  System.out.println(list);
       //  // Get element.
       //  int ele= list.get(4);
       //  System.out.println(ele);        // Remove elemen;
       //  System.out.println(list.remove(6));
       //  System.out.println(list);


       //  // Set Element.
       //  list.set(4,5);
       //  System.out.println(list);

       //  // Contains element.
       // boolean value= list.contains(2);
       //  System.out.println(value);

        // Calculate size;
        // System.out.println(list.size());
        
       // Print arraylist.
        // for(int i=0;i<list.size();i++)
        //     {
        //         System.out.print(list.get(i)+" ");
        //     }

        // Print reverse();
//         System.out.println();
//         for(int i=list.size()-1;i>=0;i--)
//             {
//                 System.out.print(list.get(i)+" ");
//             }
// System.out.println();
        // Find max.
        // int maxs= Integer.MIN_VALUE;
        
        // for(int i=0;i<list.size()-1;i++)
            
        //     {
        //          maxs= Math.max(maxs, list.get(i));
        //         if(list.get(i)<list.get(i+1))
        //         {
        //             maxs=list.get(i+1);
        //         }
        //     }
        // System.out.println("max:"+maxs);
    


 // // Swap element.
 //        int start=0;
 //        int end=list.size()-1;
 //       while(start<end)
 //           {
 //               int temp = list.get(start);
 //               list.set(start, list.get(end));
 //               list.set(end, temp);
 //               start++;
 //               end --;
               
 //           }
 //        System.out.println(list);

        // inbuild class.
        System.out.println(list);
        Collections.sort(list);// Ascending order
        System.out.println(list);

        Collections.sort(list, Collections.reverseOrder());
        System.out.println("After sorting"+list);



        
        
      
    }
}