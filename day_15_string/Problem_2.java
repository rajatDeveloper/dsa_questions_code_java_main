public class Problem_2 {
    // returm max substring pal from string

    public boolean isPal(String str, int i, int j) {

        while (i < j) {
            char ch1 = str.charAt(i);
            char ch2 = str.charAt(j);

            if (ch1 != ch2) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public String longestPalindrome(String s) {

        int max = 0, start = 0, end = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (isPal(s, i, j)) {
                    if ((j - i + 1) > max) {
                        max = j - i + 1;
                        start = i;
                        end = j;
                    }
                }
            }
        }

        return s.substring(start, end + 1);

    }
}
