import java.util.ArrayList;
import java.util.*;
class GreedyAlgo
    {
 //-------------------------With Sorting-----------------------------------------
  
    public static void  maxactivity(int[]start , int[]end)
        {
            int maxActivity=0;
            ArrayList<Integer>ans=new ArrayList<>();
            // Perform max one activity.
            ans.add(0);
            maxActivity=1;
            int lastIndex= end[0];
            for(int i=1;i<end.length;i++)
                {
                    if(start[i]>=lastIndex)
                    {
                        maxActivity++;
                        lastIndex=end[i];
                        ans.add(i);
                    }
            }
            // Print ans.
            System.out.println("Max Size:"+maxActivity);
            for(int i=0;i<ans.size();i++)
                {
                   System.out.print("A"+ans.get(i)+" "); 
                }
        }
//-------------------------Without Sorting-----------------------------------------
        public static  void  maxActivity(int[]start, int[]end)
        {
            int maxact=0;
            ArrayList<Integer> ans= new  ArrayList<>();
            //Sort function  of 2 d Array.
            int[][] activity= new int[end.length][3];
            for(int i=0;i<end.length;i++)
                {
                  activity[i][0]=i;
                  activity[i][1]=start[i];
                  activity[i][2]=end[i];
                }
         Arrays.sort(activity, Comparator.comparingDouble(o -> o[2]));
            ans.add(activity[0][0]);
             int lastindex=activity[0][2];
             maxact=1;
            for(int i=1;i<activity.length;i++)
                {
                    if(activity[i][1]>=lastindex)
                    {
                        maxact++;
                        lastindex=activity[i][2];
                        ans.add(activity[i][0]);
                    }
                }
               System.out.println("Max Size:"+maxact);
              for(int i=0;i<ans.size();i++)
                {
                   System.out.print("A"+ans.get(i)+" "); 
                }
       
         
        }
        
 // Question 3. Fractional knapsack.
        public static void FractionalKnapsack()
        {
            int[] value={60,100, 120};
            int[] weight={10,20,30};
            int  capicity=50;
            int sum=0;
            //  find ratio..
            double [][]ratio=new double[weight.length][2];
            for(int i=0;i<value.length;i++)
                {
                    ratio[i][0]=i;
                    ratio[i][1]=(value[i]/(double)weight[i]);
                }
            Arrays.sort(ratio,Comparator.comparingDouble(o->o[1]));
            for(int i=ratio.length-1;i>=0;i--)
                {  int idx=(int)ratio[i][0];
                    if(capicity>=weight[idx])
                    {
                       sum+=value[idx];
                        capicity-=weight[idx];
                    }
                    else
                    {
                        sum+=(capicity*ratio[i][1]);
                    }
                }
            System.out.println("Total value:"+sum);
            
        }
        public static void main(String args[])
        {
              //   int start[]={1,3,0,5,8,5};
              //   int end[]=  {2,4,6,7,9,9};
              // // maxactivity(start, end);  
              // maxActivity(start, end);
            FractionalKnapsack();
        }
    }