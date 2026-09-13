
public class largestString {

    public static String isCompare(String[] fruits) {
        String largest = fruits[0];
        for (int i = 1; i < fruits.length; i++) {
            // string==0;
            // String are equal.

            // String <0
            //Str<str1;
            // String >0;
            // Str>str1;
            // if(largest.compareTo(fruits[i])<0)
            // {
            //     largest=fruits[i];
            // }
            if (largest.compareToIgnoreCase(fruits[i]) < 0) {
                largest = fruits[i];
            }
        }
        return largest;
    }

    public static void main(String args[]) {
        String[] str = {"Apple", "Mango", "Grapes"};
        System.out.println(isCompare(str));
    }
}
