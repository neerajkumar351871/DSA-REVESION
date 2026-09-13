import java.util.Scanner;
public class string {
  
   public static void printLetter(String str)
   {
    for(int i=0;i<str.length();i++)
    {
        System.out.print(str.charAt(i)+" ");
    }
   }
    public static void main(String args[]) {
        //---------- First type to decalare string --------------.
        String str = "Neeraj kumar";
        System.out.println(str);

//---------------- Second type to declare string.--------------.
        String str1 = new String("Hello world");
        System.out.println(str1);

//----------------Take input---------------------
        Scanner sc = new Scanner(System.in);
//-----Take only one word---------.
// String str2= sc.next();
// System.out.println(str2);

// //-------Take a sentence------.
//         System.err.println("Enter your name:");
//         String str4 = sc.nextLine();
//         System.out.println(str4 + ".");
// //--------Length function----------.
//         System.out.println("FIND STRING LENGTH");
//         System.out.println(str4.length());
// --------------------Concatenate-------------
        String First = "Neeraj";
        String MiddleName = "Kumar";
        System.out.println("MY FULL NAME IS : " + (First + MiddleName));

//----------------------charAt()---------------
    System.out.println(First.charAt(4));
    printLetter(First);
    }
}
