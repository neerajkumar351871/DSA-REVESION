class recurisionproblems
    {
        public static  int tiligproblem(int n)
        {
            if(n==0 || n==1)
            {
             return 1;   
            }
            // KAAM.
            // Chooise.
            // int vertical=tiligproblem(n-1);
            // int horizontal=tiligproblem(n-2);
            // int totalway=vertical+horizontal;
            // return totalway;
            return ((tiligproblem(n-1))+(tiligproblem(n-2)));
          
            
        }
        public static  void removeduplicate(String str, int idx, StringBuilder newstr, boolean map[])
        {
            // Base case.
            if(idx==str.length())
            {
               System.out.println("New string:"+newstr);
                return;
            }
            char currchar=str.charAt(idx);
            // kaam.
            if(map[currchar-'a']==true)
            { // Duplicate elemenets.
              removeduplicate(str, idx+1, newstr, map);  
            }
            else
            {
            map[currchar-'a']=true;
            removeduplicate(str, idx+1, newstr.append(currchar), map); 
            }
        }
        
      
        public static void main(String args[])
        {
            System.out.println("Total Ways:"+tiligproblem(3));
            String str="appnnacollege";
            removeduplicate(str,0,new StringBuilder(""), new boolean[26]);
            
        }
    }