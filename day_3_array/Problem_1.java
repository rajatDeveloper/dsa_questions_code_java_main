import java.util.ArrayList;
import java.util.Arrays;

public class Problem_1 {

    static boolean binarySaerch(ArrayList<Integer> matrix, int target) {
        int low = 0;
        int high = matrix.size() - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (matrix.get(mid) == target) {
                return true;
            } else if (matrix.get(mid) < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false;
    }

    // static boolean searchMatrix(ArrayList<ArrayList<Integer>> matrix, int target)
    // {

    // for (int i = 0; i < matrix.size(); i++) {
    // if (matrix.get(i).get(0) <= target && matrix.get(i).get(matrix.get(0).size()
    // - 1) >= target) {
    // return binarySaerch(matrix.get(i), target);
    // }
    // }

    // return false;
    // }

    // optional soln

    static boolean searchMatrix(ArrayList<ArrayList<Integer>> matrix, int target) {
        int n = matrix.size();
        int m = matrix.get(0).size();
        int low = 0;
        int high = n * m - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            int row = mid / m;
            int col = mid % m;
            if (matrix.get(row).get(col) == target)
                return true;
            else if (matrix.get(row).get(col) < target)
                low = mid + 1;
            else
                high = mid - 1;

        }

        return false;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        matrix.add(new ArrayList<>(Arrays.asList(1, 2, 3, 4)));
        matrix.add(new ArrayList<>(Arrays.asList(5, 6, 7, 8)));
        matrix.add(new ArrayList<>(Arrays.asList(9, 10, 11, 12)));

        boolean result = searchMatrix(matrix, 12);
        System.out.println(result ? "true" : "false");
    }
}
