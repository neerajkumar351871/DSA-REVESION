import java.util.*;
public class Question
{   
    public static  void maxLength()
    {
        int  pair[][]={{5,24},{39,60},{5,28},{27,40},{50,90}};
        int maxpair=0;
        Arrays.sort(pair,Comparator.comparingDouble(o->o[1]));
        maxpair=1;
        int lastIndex=pair[0][1];
        for(int i=1;i<pair.length;i++)
        {
            if(pair[i][0]>=lastIndex)
            {
             maxpair++;
             lastIndex= pair[i][1];
            }
        }
        System.out.println("Max pair length->"+maxpair);
    }
    
public static void indainCoins() 
{
    int value = 590;
    Integer coins[] = {1,2,5,10,20,50,100,500,2000};

    Arrays.sort(coins, Comparator.reverseOrder());

    int counter = 0;
    ArrayList<Integer> ans = new ArrayList<>();

    for(int i = 0; i < coins.length; i++)
    {
        if(coins[i] <= value)
        {
            while(coins[i] <= value)
            {
                ans.add(coins[i]);
                value -= coins[i];
                counter++;
            }
        }
    }

    System.out.println("Coins selected: " + ans);
    System.out.println("Total coins: " + counter);
}

public static void main(String args[])
    {
        maxLength();
        indainCoins();
    }
}