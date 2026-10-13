import java.util.ArrayList;
public class containerwithmostwater
{  
    // Brute  force  - 9(n^2);
public static void Containerwater(ArrayList<Integer> height)
{   int maxContainwater=0;
   for(int i=0;i<height.size();i++)
   {
    for(int j=i+1;j<height.size();j++)
    {
        int minheight= Math.min(height.get(i), height.get(j));
        int width=j-i;
        int waterlevel=minheight*width;
       maxContainwater=Math.max(waterlevel,maxContainwater);
    }
   }
   System.out.println(maxContainwater);
}
// 2 Pointer Approach.
public static void  mostcontain(ArrayList<Integer> height)
{
    int start=0;
    int end= height.size()-1;
    int maxContainwater=0;
    while(start<end)
    {
        int minheight= Math.min(height.get(start), height.get(end));
        int width=end-start;
        int waterlevel=minheight*width;
       maxContainwater=Math.max(waterlevel,maxContainwater);
        if(height.get(start)< height.get(end))
        {
            start++;
        }
        else
        {
            end--;
        }

    }
    System.out.println("MOST CANTAINER WATER:"+maxContainwater);
}
    public static void main(String args[])
    {
        ArrayList<Integer> height= new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        Containerwater(height);
        mostcontain(height);
    }
}