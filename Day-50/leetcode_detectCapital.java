// Online Java Compiler (Editor)
// Write and run Java online using this editor.

class  leetcode_detectCapital {
    public static boolean detectCapital(String word) {
      int counter=0;
      int size=word.length();
        for(int i=0;i<size;i++)
            {  char ch= word.charAt(i);  
                
                    if((ch >='A') && (ch<='Z'))
                {
                    counter++;
                }
            }
        // All capital ho to.
        if(counter==size)
        {
            return true;
        }
         // All Small ho to
         if(counter ==0)
         {
             return true;
         }
        // First word capital ho too.
     if(counter==1 && word.charAt(0)>='A' && word.charAt(0)<='Z')
         {
             return true;
         }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(detectCapital("g"));
    }
}