public class Quicksort
    { 
        public static void quickSort(int arr[], int start , int end)
        {
            if(start>=end)
            {
                return;
            }
             // find last element.
            int pIdx=partition(arr, start, end);
            quickSort(arr, start,pIdx-1);// Left part.
            quickSort(arr, pIdx+1, end);//Right part.
        }
   public static int partition(int[] arr, int start, int end)
{
    int pivot = arr[end];
    int i = start - 1;

    for(int j = start; j < end; j++)
    {
        if(arr[j] <= pivot)
        {
            i++;

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    i++;

    int temp = arr[i];
    arr[i] = arr[end];
    arr[end] = temp;

    return i;
}
        
        public static void  printarray(int[] array)
        {
            for(int i=0;i<array.length;i++)
                {
                    System.out.print(array[i]);
                }
            System.out.println();
        }
        public static void main(String args[])
        {
            int[] arr={6, 3, 9, 8, 2, 5 };
             System.out.println("--------------BFORE QUICK SORT--------------");
             printarray(arr);
             quickSort(arr ,0,arr.length-1);
             System.out.println("--------------AFTER QUICK SORT--------------");
             printarray(arr);
       
         
        }
    }