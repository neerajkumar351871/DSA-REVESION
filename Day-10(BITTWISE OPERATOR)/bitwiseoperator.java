class bitwiseoperator
{ 
    public  static void And(int a, int b)
    {
        System.out.println("AND OPERATOR:"+(a&b));
    }
    public static void  or(int a, int b)
    {
        System.out.println("OR OPERATOR:"+(a|b));
    }
    public static void xor(int a, int b)
    {
        System.out.println("XOR OPERATOR:"+(a^b));
    }
    public  static void not(int a)
    {
        System.out.println("NOT OPERATOR"+(~a));
    }
     public static void leftShift(int a,  int b)
    {
        System.out.println("LEFT SHIFT OPERATOR:"+(a<<b));

    }
    public  static void rightShift(int a, int b)
    {
       System.out.println("RIGHT SHIFT : "+(a>>b));
    }
    public static void checkOddEven(int a)
    {
        int bitmask=1;
        if((a&bitmask)==0)
        {
            System.out.println("VALUE IS EVEN:"+a);  
        }
        else
        {
            System.out.println("VALUE IS ODD:"+a);
        }
    }
    public static void main(String[] args) {
        And(5,6);
        or(5,6);
        xor(5,6);
        not(5);
        leftShift(5,2);
        rightShift(5,2);
        checkOddEven(15);
    }
}