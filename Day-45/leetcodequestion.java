import java.util.Stack;
public class leetcodequestion
    {    public static String greatString(String str)
        {
            Stack<Character>s= new Stack<>();
            for(int i=0;i<str.length();i++)
                {
                  char ch=str.charAt(i);
                     // Check condition h.
                    if(!s.isEmpty() && Math.abs(s.peek()-ch)==32)
                    {
                        s.pop();
                    }
                        // Push condition.
                    else
                    {
                      s.push(ch);  
                    }
              
                 }
            // Print.
                  StringBuilder st= new StringBuilder(" ");
                       while(!s.isEmpty())
                        {
                            st.append(s.peek());
                            s.pop();
                        }
                return st.reverse().toString();
        }

    public static void main(String args[])
        {
            String st="leEeetcode";
            // String st1="abBAcC"; 
            // greatString(st);
            greatString(st);
            System.out.println(greatString(st));

        }
    }