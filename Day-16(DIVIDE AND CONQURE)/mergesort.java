public class mergesort
{  
    public static  void printArray(int[]arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void mergesort(int [] arr, int start, int end)
    {

  // Base case
  if(start== end)
  {
     return ;
  }
    int mid= start+(end-start)/2; //Find mid;
    mergesort(arr, start, mid);  //  Left part.
    mergesort(arr, mid+1, end);  // Right  part.
    merge(arr, start, mid, end);

    }
    public static void merge(int[] array,int start,int mid,int end )
    {
      // Create temp array.
      int temp[]= new int[end-start+1];
      int k=0; // Temp ka liya iteration work karga.
      int i=start;
      int j=mid+1;
    
    // ye part part sort karga.

    while(i<=mid && j<=end)
    {
        // Yha check karo khone sa element chhota h
        if(array[i]<array[j])
        {
            temp[k]=array[i];
            i++;
        }
        else
        {
         temp[k]=array[j];
         j++;
        }
        k++;
    }
    // ye ho gaya sort 
    // par is ma ek problem h agar ye odd length hua to elment hua to element ko  drop kar de ga.array
    // is ka liya conercase.
    
    // left part.
    // Jo element bcahe ha unkaliya.
    while(i<=mid)
    {
        temp[k++]=array[i++];
    }
    // Right part.
    // Jo element bcahe ha unkaliya.
    while(j<=end)
    {
        temp[k++]=array[j++];
    }

    // ab hmm original array ma  copy karana h 

     for(k=0, i=start;k<temp.length;k++,i++)
                {
                    array[i]=temp[k];
                }

    }
    public static void main(String args[])
    {
        int[] arr={6,3,9,5,2,8};
         System.out.println("----------BEFORE SORTED----------");
         printArray(arr);
         System.out.println("----------AFTER SORTED----------");
         mergesort(arr, 0,arr.length-1);
         printArray(arr);



    }
}