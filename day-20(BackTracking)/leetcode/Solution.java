class Solution {

    public boolean checkvowel(char ch) {

        if (ch == 'a' || ch == 'e' || ch == 'i' ||
            ch == 'o' || ch == 'u' ||
            ch == 'A' || ch == 'E' || ch == 'I' ||
            ch == 'O' || ch == 'U') {

            return true;
        }

        return false;
    }

    public String reverseVowels(String s) {

        char[] arr = s.toCharArray();

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {

            if (!checkvowel(arr[start])) {
                start++;
            }

            else if (!checkvowel(arr[end])) {
                end--;
            }

            else {

                char temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;

                start++;
                end--;
            }
        }

        return new String(arr);
    }
}