public class printSubstring
    {   
        public static void subString(String str,int st, int end)
        {
          while(st<=end)
              {
                  System.out.print(str.charAt(st));
                  st++;
              }
        }
        public static void main(String args[])
        {
            String str="Hello wolrd";
             subString(str,2,4);
        }
    }