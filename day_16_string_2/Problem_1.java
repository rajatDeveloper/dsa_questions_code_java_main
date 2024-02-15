package day_16_string_2;

public class Problem_1 {
    public boolean compare(String s1, String s2, int start) {

        int n1 = s1.length();
        int n2 = s2.length();
        for (int i = 0; i < n2; i++) {
            if (start >= n1)
                return false;
            if (s1.charAt(start++) != s2.charAt(i)) {
                return false;
            }
        }

        return true;

    }

    public int strStr(String haystack, String needle) {

        int n = haystack.length();

        for (int i = 0; i < n; i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                if (compare(haystack, needle, i)) {
                    return i;
                }
            }
        }

        return -1;
    }
}
