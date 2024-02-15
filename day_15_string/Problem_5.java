public class Problem_5 {
    // longest prfix in arr
    // Input: strs = ["flower","flow","flight"]
    // Output: "fl"

    public String common(String s1, String s2) {
        StringBuilder sb = new StringBuilder();
        int n = Math.min(s1.length(), s2.length());
        for (int i = 0; i < n; i++) {
            if (s1.charAt(i) == s2.charAt(i)) {
                sb.append(s1.charAt(i));
            } else {
                break;
            }
        }

        return sb.toString();
    }

    public String longestCommonPrefix(String[] strs) {
        String res = strs[0];

        for (int i = 1; i < strs.length; i++) {
            res = common(res, strs[i]);
        }

        return res;

    }

    // public String longestCommonPrefix(String[] strs) {
    // if (strs.length == 0)
    // return "";
    // String prefix = strs[0];

    // for (int i = 1; i < strs.length; i++) {
    // while (strs[i].indexOf(prefix) != 0) {
    // prefix = prefix.substring(0, prefix.length() - 1);
    // if (prefix.isEmpty())
    // return "";
    // }
    // }
    // return prefix;
    // }
}
