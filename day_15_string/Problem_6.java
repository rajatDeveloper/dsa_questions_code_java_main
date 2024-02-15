import java.util.Collections;

public class Problem_6 {
    public int repeatedStringMatch(String a, String b) {
         final int n = (int) Math.ceil((double) b.length() / (double) a.length());
    final String s = String.join("", Collections.nCopies(n, a));
    if (s.contains(b))
      return n;
    if ((s + a).contains(b))
      return n + 1;
    return -1;}
}
