public  class stringBuilder
{ 
    public  static void stringBuilders()
    {
        StringBuilder str= new StringBuilder();
        for(char ch='A'; ch<='Z';ch++)
        {
            str.append(ch+" ");
        }
        System.out.print(str);
        System.err.print("Invalid input");
    }
    public static void main(String[] args) {
        stringBuilders();
       
    }
}