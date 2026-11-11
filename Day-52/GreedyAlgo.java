import java.util.*;
class GreedyAlgo
    {  
        // THis is work ending time are sorted.
        public static void ActivitySelection(int[]start, int[]end)
        {
             int maxActivity=0;
          ArrayList<Integer>ans= new ArrayList<>();  
            // One Activity are done.
          maxActivity=1;
          ans.add(0);
          int size=start.length;
            int lastIndex=end[0];
            for(int i=1;i<size;i++)
                {
                     if(start[i]>=lastIndex)
                     { // Activity Selection.
                        ans.add(i);
                        maxActivity++;
                        lastIndex= end[i]; 
                     }
                }
            System.out.println("MAX ACTIVITY:"+maxActivity); 
             for(int i=0;i<ans.size();i++)
                 {
                     System.out.print("A"+ans.get(i)+" ");
                 }
               System.out.println();
        }
//   When ending time are not sorted......
        public static void ActivitySelections(int[]start, int[]end)
        {
            int  maxActivity=0;
            ArrayList<Integer>ans= new ArrayList<>();
         
            // Sorting end time.
            int size=start.length;
            int[][] activity= new  int[size][3];
            for(int i=0;i<start.length;i++)      
                {                                // | IDX | ST | EN | 
                    activity[i][0]=i;            // |  0  | 0  | 6  | 
                    activity[i][1]=start[i];     // |  1  | 1  | 2  |
                     activity[i][2]=end[i];      // |  2  | 3  | 4  |
                                                 // |  3  | 5  | 7  | 
                }                                // |  4  | 5  | 9  |
                                                 // |  5  | 8  | 9  |
            Arrays.sort(activity,Comparator.comparingDouble(o -> o[2]));
            // Select one activty onelist.
             ans.add(activity[0][0]);
             maxActivity=1;
                int lastIndex=activity[0][2];
               for(int i=1;i<size;i++)
                {
                      if(activity[i][1]>=lastIndex)
                  {
                      maxActivity++;
                      ans.add(activity[i][0]);
                      lastIndex=activity[i][2];
                  }

                }
            System.out.println("MAX ACTIVITY:"+maxActivity); 
             for(int i=0;i<ans.size();i++)
                 {
                     System.out.print("A"+ans.get(i)+" ");
                 }
               System.out.println();
            
        }

        public static void main(String args[])
        {
         int  start[]={1,3,0,5,8,5};
         int  end[]=  {2,4,6,7,9,9};
            ActivitySelection(start, end);
            ActivitySelections(start,end);
        }
    }