public class  shortestPath
    {   public static double shortestpath(String strs)
        {    String str = strs.toUpperCase();
             int x=0;
            int y=0;
            for(int i=0;i<str.length();i++)
                {
                    if(str.charAt(i)=='N')
                    {
                        y++;
                    }
                    else if(str.charAt(i)=='S')
                    {
                        y--;
                    }
                    else if(str.charAt(i)=='W')
                    {
                        x--;
                    }
                    else 
                    {
                        x++;
                    }
                    
                }
            int xsq= x*x;
            int ysq=y*y;
           
            return Math.sqrt(xsq+ysq);
            }
        public static void main(String args[])
        {
            // String str="WNEENESENNN";
            String str="wnsewnsw";
            System.out.println("Shortest Path : "+shortestpath(str));
        }
    }