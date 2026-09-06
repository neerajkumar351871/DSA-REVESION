class solution {
    public double findMaxAverage(int[] nums, int k) {
       
        int sum = 0;

        // First k elements ka sum
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        int maxSum = sum;

        // Sliding window
        for (int i = k; i < nums.length; i++) {
            sum = sum - nums[i - k] + nums[i];
            maxSum = Math.max(maxSum, sum);
        }

        return (double) maxSum / k;
        
    }
    public static void main(String[] args) {
        solution obj= new solution();
        int nums[]={1,2,3,4,5,6,7,8};
        int k=4;
        System.out.println(obj.findMaxAverage(nums, k));
    }
}