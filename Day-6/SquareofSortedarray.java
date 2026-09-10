import java.util.Arrays;
// Question no 977. Squares of a Sorted Array
public class SquareofSortedarray
{    public int[] sortedSquares(int[] nums) {
        // work karga numbers ka sqaure niklna ma.
         for(int i=0;i<nums.length;i++)
         {
            nums[i]=nums[i]*nums[i];
         }
         Arrays.sort(nums);
         printarray(nums);
         return nums;
    }
    public static void printarray(int[] value)
    {
       for(int i=0;i<value.length;i++)
       {
     
            System.out.print(value[i]+" ");
       }    
    }
    public static void main(String args[])
    {
        SquareofSortedarray  obj = new SquareofSortedarray();
        int[]nums={-4,-1,0,3,10};
        obj.sortedSquares(nums);

    }
}