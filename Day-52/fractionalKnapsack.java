import java.util.*;
class fractionalKnapsack
 {
    public static void main(String args[])
     {
         int[] val={60,100,120};
         int[]weight={10,20,30};
         int w=50;
           int size=val.length;
         double[][]ratio=new double[size][2];
         //0 th col-> idx , 1  th col->ration.
       
         for(int i=0;i<size;i++)
             {
                 ratio[i][0]=i;
                 ratio[i][1]=val[i]/(double)weight[i];
           }
         // Random ratio calculate.
         Arrays.sort(ratio,Comparator.comparingDouble(o-> o[1]));
         int capicity=w;
        double finalvalue=0;
         // Loop reverse isliya use khy h ku ki greedy algo ha 😂.
         for(int i=ratio.length-1;i>=0;i--)
             {
               int idx= (int)ratio[i][0];
                 if(capicity>=weight[idx])
                 {
                     finalvalue+=val[idx];
                    capicity-=weight[idx];
                 }
                 else
                 {
                    finalvalue+=(ratio[i][1]*capicity); 
                     capicity=0;
                     break;
                 }
             }
         System.out.println("MAX PROFIT"+finalvalue);
     }
    }

