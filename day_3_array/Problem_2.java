public class Problem_2 {

    // pow(x, n ) x^n

    // optimal soln

    static double pow(double x, int n) {
        double ans = 1;
        int nn = n;
        if (nn < 0) {
            nn = -1 * nn;
        }

        while (nn > 0) {
            if (nn % 2 == 1) {
                ans = ans * x;
                nn = nn - 1;
            } else {
                x = x * x;
                nn = nn / 2;

            }

        }

        if (n < 0) {
            ans = 1 / ans;
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(pow(4, 2));
    }
}
