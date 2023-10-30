public class maxOfSubArr {
    public static int getMax(int arr[], int n) {
        int maxMain = 0;
        int maxLast = arr[0];
        for (int i = 0; i < n; i++) {
            maxMain += arr[i];
            if (maxLast < maxMain) {
                maxLast = maxMain;
            }
            if (maxMain < 0) {
                maxMain = 0;
            }
        }
        return maxMain;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, -2, 5 };
        int n = arr.length;
        int ans = getMax(arr, n);
        System.out.println(ans);
    }
}
