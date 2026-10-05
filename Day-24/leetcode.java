public class leetcode
{
    public int calPoints(String[] operations) {

        int[] store = new int[operations.length];
        int k = 0;

        for (int i = 0; i < operations.length; i++) {

            if (operations[i].equals("C")) {

                k--;

            } 
            else if (operations[i].equals("D")) {

                store[k] = 2 * store[k - 1];
                k++;

            } 
            else if (operations[i].equals("+")) {

                store[k] = store[k - 1] + store[k - 2];
                k++;

            } 
            else {

                store[k] = Integer.parseInt(operations[i]);
                k++;
            }
        }

        int x = 0;

        for (int i = 0; i < k; i++) {
            x += store[i];
        }

        return x;
    }

        public static void main(String args[])
        {  leetcode obj= new leetcode();
            String[] str={"5","2","C","D","+"};
            System.out.println(obj.calPoints(str));
            
        }
    }