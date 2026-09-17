class operationonbitmask
    {
        public static int getithbit(int n, int i)
        {
            int bitmask=1;
            if((n&(bitmask<<i))==0)
            {
                return 0;
            }
            else
            {
                return 1;
            }
        }
        public  static int setithbit(int n, int i)
        {
            int bitmask=1<<i;
            return n|bitmask;
        }
        public static int clearithbit(int n ,int i)
        {
            int bitmask=~(1<<i);
            return(n&bitmask);
        }
        public static int updateithbit(int n, int i, int newbit)
        {
            if(newbit==1)
            {
             return setithbit(n, i);
            }
            else
            {
                return clearithbit(n,i);
            }
        }
        public static int clearlastithbit(int n ,int i)
        {
            int bitmask=((-1)<<i);
         return((n&bitmask));
        }
        public static int clearrangeofbits(int num, int i,int j)
        {
            int abitmask=((~0)<<j+1);
            int bbitmask=(1<<i)-1;
            return num&(abitmask|bbitmask) ;
            
        }
        public static boolean ispower(int n)
        {
       return (n&(n-1))==0;
        }
		public static int countsetbit(int n)
		{
			int counter=0;
			while(n>0)
			{
				if((n&1)!=0)
				{
					counter++;
				}
			 n=n>>1;// RIGHT SHIFT.
			}
			return counter;
		}
		
    public static void main(String args[])
        {
    System.out.println("GET ITH BIT:"+getithbit(12,2));  
    System.out.println("SET ITH BIT: "+setithbit(10,2));
    System.out.println("CLEAR ITH BIT:"+clearithbit(10,1));
    System.out.println("SET ITH  BIT:"+updateithbit(10,2,0));
    System.out.println("CLEAR  LAST ITH BIT:"+clearlastithbit(15,2));
    System.out.println("CLEAR RANGE OF BITS:"+clearrangeofbits(10,2,4));
    System.out.println("CHECK IS POWER :"+ispower(20));
    System.out.println("COUNT SET BITS:"+countsetbit(10));
        
        }
    }