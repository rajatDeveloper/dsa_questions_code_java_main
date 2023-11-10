import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Problem_7 {

    // return the max no. of pages that std can get but should be min from
    // combinations of pages
    // Input 1:
    // A = [12, 34, 67, 90]
    // B = 2
    // o/p - > 113

    // Explanation 1:
    // There are two students. Books can be distributed in following fashion :
    // 1) [12] and [34, 67, 90]
    // Max number of pages is allocated to student 2 with 34 + 67 + 90 = 191 pages
    // 2) [12, 34] and [67, 90]
    // Max number of pages is allocated to student 2 with 67 + 90 = 157 pages
    // 3) [12, 34, 67] and [90]
    // Max number of pages is allocated to student 1 with 12 + 34 + 67 = 113 pages
    // Of the 3 cases, Option 3 has the minimum pages = 113

    public static int countStudents(ArrayList<Integer> arr, int pages) {
        int n = arr.size(); // size of array
        int students = 1;
        long pagesStudent = 0;
        for (int i = 0; i < n; i++) {
            if (pagesStudent + arr.get(i) <= pages) {
                // add pages to current student
                pagesStudent += arr.get(i);
            } else {
                // add pages to next student
                students++;
                pagesStudent = arr.get(i);
            }
        }
        return students;
    }

    public static int findPages(ArrayList<Integer> arr, int n, int m) {
        // book allocation impossible
        if (m > n)
            return -1;

        int low = Collections.max(arr);
        int high = arr.stream().mapToInt(Integer::intValue).sum();
        while (low <= high) {
            int mid = (low + high) / 2;
            int students = countStudents(arr, mid);
            if (students > m) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(25, 46, 28, 49, 24));
        int n = 5;
        int m = 4;
        int ans = findPages(arr, n, m);
        System.out.println("The answer is: " + ans);
    }

}
