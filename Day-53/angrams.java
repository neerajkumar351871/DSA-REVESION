import java.util.*;
class angrams
{   
    public static boolean Angrams(String s , String t)
    {
         char[] a_Sort= s.toCharArray();
        char[] b_Sort= t.toCharArray();
        Arrays.sort(a_Sort);
        Arrays.sort(b_Sort);
        return Arrays.equals(a_Sort, b_Sort);
    }
    public static void main(String[] args) {
        String st="anagram";
        String st1="nagaram";
      System.out.println(Angrams(st, st1));
    }
}