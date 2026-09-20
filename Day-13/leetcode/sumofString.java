class sumofString  {

    public static int breaknumber(int n) {
        int sum = 0;

        while (n != 0) {
            int lastdigit = n % 10;
            sum += lastdigit;
            n = n / 10;
        }

        return sum;
    }

    public int getLucky(String s, int k) {

        int value = 0;

        // Convert string to number sum
        for (int i = 0; i < s.length(); i++) {
            value += breaknumber(s.charAt(i) - 'a' + 1);
        }

        // Perform k transformations
        for (int i = 1; i < k; i++) {
            value = breaknumber(value);
        }

        return value;
    }
}