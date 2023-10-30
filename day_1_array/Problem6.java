public class Problem6 {

    static int maxPro(int[] arr) {
        int maxPro = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    maxPro = Math.max(maxPro, arr[j] - arr[i]);
                }
            }
        }

        return maxPro;
    }

    // optimal soiln

    static int maxOptimalPro(int[] arr) {
        int maxPro = 0;
        int minPrize = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            minPrize = Math.min(minPrize, arr[i]);
            maxPro = Math.max(maxPro, arr[i] - minPrize);
        }

        return maxPro;

    }

    public static void main(String[] args) {

    }
}
