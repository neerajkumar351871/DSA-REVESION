
import java.util.Stack;

class leetcode {
    public static  int[] finalPrices(int[] prices) {

        Stack<Integer> s = new Stack<>();

        for (int i = prices.length - 1; i >= 0; i--) {

            int current = prices[i];

            while (!s.isEmpty() && s.peek() > current) {
                s.pop();
            }

            if (!s.isEmpty()) {
                prices[i] = current - s.peek();
            }

            s.push(current);
        }

        return prices;
    }
    public  static  void main(String args[])
    {
        int[] arr={8,4,6,2,3};
         System.out.print(finalPrices(arr).toString());
         }
}
