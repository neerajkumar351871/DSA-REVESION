
class leetcodeSortp {

    public int[] sortArrayByParity(int[] nums) {
        int j = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        } printarray(nums);
        return nums;
    }
    public static void printarray(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        leetcodeSortp obj= new leetcodeSortp();
        int[] nums = {3, 1, 2, 4};
        obj.sortArrayByParity(nums);

    }
}
