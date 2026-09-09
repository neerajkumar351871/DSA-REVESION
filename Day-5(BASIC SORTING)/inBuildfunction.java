import java.util.Arrays;
import java.util.Collections;
public class inBuildfunction
{  public static void printArry(Integer[] nums)
{
    for(Integer i=0;i<nums.length;i++)
    {
        System.out.print(nums[i]+" ");
    }
}
    public static void main(String args[])
    {
        Integer[] arr={5,4,2,3,1};
        // Arrays.sort(arr);

        // WITH INDEX.
        // Arrays.sort(arr,0,3);
        Arrays.sort(arr, Collections.reverseOrder());
        printArry(arr);
        
    }
}