import java.util.*;
class Solution {
    public String simplifyPath(String path) {
      String str[]=path.split("/"); 
      Stack<String>s = new Stack<>();
      int sz=str.length;
      for(int i=0;i<sz;i++)
      {
        String curr= str[i];
        if(curr.equals("")|| curr.equals("."))
        {
            continue;
        }
        else if(curr.equals(".."))
        {  if(!s.isEmpty())
        {
            s.pop();
        }
        }
        else
        {
            s.push(curr);
        }
      }
      StringBuilder sb= new StringBuilder();
        while(!s.isEmpty())
        {
           sb.insert(0,"/"+s.pop());
        }

       if(sb.length()==0)
       {
        return"/";
       }
       return sb.toString();
    }
}

