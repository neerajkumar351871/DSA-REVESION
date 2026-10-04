class RansomNote {
       public int[] freq(String str) {

        int[] map = new int[26];

        for (int i = 0; i < str.length(); i++) {
            map[str.charAt(i) - 'a']++;
        }

        return map;
    }

    public boolean canConstruct(String ransomNote, String magazine) {

        int[] ransomFreq = freq(ransomNote);
        int[] magazineFreq = freq(magazine);

        for (int i = 0; i < 26; i++) {

            if (ransomFreq[i] > magazineFreq[i]) {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        RansomNote obj = new RansomNote();
      System.out.print(obj.canConstruct("ransomNote","magazine"));
    }
}