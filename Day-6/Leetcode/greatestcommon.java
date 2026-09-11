
class greatestcommon {

    // leet Code 1979. Find Greatest Common Divisor of Array
    public int gcd(int a, int b)
    {
        if(b==0)
        {
            return a;

        }
        return gcd(a, a%b);
    }
    public int findGCD(int[] nums) {
        int sn = Integer.MAX_VALUE;
        int ln= Integer.MIN_VALUE;
         for(int i=0;i<nums.length;i++)
         {
            sn=Math.min(sn, nums[i]);
            ln= Math.max(ln, nums[i]);
         }
         // calculate gcd
         for(int i=2;i<=ln;i++)
         {
            if(sn%i==0 &&  ln%i==0)
            {
                return i;
            }
         }
         return gcd(sn, ln);
        }

    public static void main(String[] args) {
        int[] nums = {2, 5, 6, 9, 10};
        System.out.println(nums);
    }
}
