
import java.util.Stack;

class duplicatepar {

    public static boolean duplicate(String str) {

        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch == ')') {

                int count = 0;

                while (s.peek() != '(') {
                    s.pop();
                    count++;
                }

                if (!s.isEmpty()) {
                    s.pop();
                }

                if (count < 1) {
                    return true;
                }
            }
            else {
                s.push(ch);
            }
        }

        return false;
    }

    public static void main(String args[]) {

        String str = "((a+b))";
        String str2 = "(a-b)";

        System.out.println(duplicate(str));  // true
        System.out.println(duplicate(str2)); // false
    }
}

// import java.util.Stack;

// class Main {

//     public static boolean duplicate(String str) {

//         Stack<Character> s = new Stack<>();

//         for (int i = 0; i < str.length(); i++) {

//             char ch = str.charAt(i);

//             if (ch == ')') {

//                 int count = 0;

//                 while (s.peek() != '(') {
//                     s.pop();
//                     count++;
//                 }

//                 if (!s.isEmpty()) {
//                     s.pop();
//                 }

//                 if (count < 1) {
//                     return true;
//                 }
//             }
//             else {
//                 s.push(ch);
//             }
//         }

//         return false;
//     }

//     public static void main(String args[]) {

//         String str = "((a+b))";
//         String str2 = "(a-b)";

//         System.out.println(duplicate(str));  // true
//         System.out.println(duplicate(str2)); // false
//     }
// }

// import java.lang.StringBuilder;
// import java.util.Stack;
// class  stack
//     {  public static void  removeSpace(String str)
//        {
//            // System.out.println(str.length());
//            Stack<String> s= new Stack<>();
//           StringBuilder words= new StringBuilder("");
//            int i=0;
//              while(i!=str.length())
//                {  char ch= str.charAt(i);
//                    if( ch !=' ')
//                    {
//                       words.append(ch);
//                     }
//                    else
//                    {
//                    s.push(words.toString());
//                     words.setLength(0);
//                   }
//                    i++;
//                  }
            
//             if (words.length() > 0) {
//             s.push(words.toString());
//         }
          
//        }
//         public static void main(String args[])
//         {
//             String str= "The sky is bule"; // spcae 6 word->12  total=19.
//             removeSpace(str);
//         }
//     }
