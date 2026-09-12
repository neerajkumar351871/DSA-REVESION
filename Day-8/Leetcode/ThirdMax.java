import java.util.Arrays;
public class ThirdMax {
   public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int[] dist = new int[3];
        int ct = 0;

        // Maximum (last element after sort)
        dist[0] = nums[nums.length - 1];
        ct = 1;

        // Right to left, lekin index -1 se bachne ke liye length-2 se start
        for (int i = nums.length - 2; i >= 0; i--) {
            // Agar current number last distinct max se alag hai
            if (nums[i] != dist[ct - 1]) {
                if (ct < 3) {
                    dist[ct] = nums[i];
                    ct++;
                }
                if (ct == 3) {
                    return dist[2]; // third distinct maximum
                }
            }
        }

        // Agar 3 distinct max nahi mile, to maximum return karo
        return nums[nums.length - 1];
    }

    public static void main(String[] args) {
        ThirdMax obj = new ThirdMax();
        int nums[] = {7, 2, 5, 7, 1, 5};
        System.out.println(obj.thirdMax(nums));
    }
}
