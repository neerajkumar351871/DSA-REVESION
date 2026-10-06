import java.util.ArrayList;
public class arraylistimplementation
    {
        public static void main(String args[])
        {
            ArrayList<Integer> list= new ArrayList<>();
            // 1. Add operations.
            list.add(1);
            list.add(2);
            list.add(3);
            list.add(4);
            list.add(5);
            System.out.println(list);

           // 2. Add operations.
            //-----return the values-----;
            int element= list.get(3);
            System.out.println(element);
            
           // 3. Remove operations.
            // syntax= remove(index);
            list.remove(3);// Take index value and remove the index value.
            System.out.println(list);
             
           // 4. Set element  operations.
            // Syntax =set(index, value);
            list.set(3,4);
            System.out.println(list);
             
           // 5. Contain element  operations.
            //Synatx contain()->return the value true /false.
            
            System.out.println(list.contains(3));
            System.out.println(list.contains(9));


            

            
            
        }
    }