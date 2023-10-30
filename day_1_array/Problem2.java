import java.util.ArrayList;
import java.util.List;

public class Problem2 {

    // pascal trinagle

    // variant one

    static double nCr(int n, int r) {
        double res = 1;
        for (int i = 0; i < r; i++) {
            res *= (n - i);
            res /= (i + 1);
        }
        return res;
    }

    // varient two - print complte row o fpascal triba==ngle

    static void pascalRow(int row) {

        long ans = 1;
        System.out.print(ans + " ");

        for (int i = 1; i < row; i++) {
            ans = ans * (row - i);
            ans = ans / i;
            System.out.print(ans + " ");
        }
        System.out.println();
    }

    static List<Integer> genrateRow(int row) {
        long ans = 1;
        List<Integer> ansRow = new ArrayList<Integer>();
        ansRow.add(1);

        for (int col = 1; col < row; col++) {
            ans = ans * (row - col);
            ans = ans / col;
            ansRow.add((int) ans);

        }

        return ansRow;
    }

    static List<List<Integer>> pascalTrinagle(int n) {
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            ans.add(genrateRow(i));
        }

        return ans;
    }

    public static void main(String[] args) {

        System.out.println("Variant one ans for  row = 5, col = 3 is : " + nCr(5 - 1, 3 - 1));

        System.out.println("the row is for n - 5 : ");
        pascalRow(5);

    }
}
