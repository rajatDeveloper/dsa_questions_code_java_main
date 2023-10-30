import java.util.Scanner;

public class minMaxOFArr {
    public static int[] minMax(int arr[]) {
        int arrMinMAx[] = new int[2];
        arrMinMAx[0] = Integer.MAX_VALUE;// min
        arrMinMAx[1] = Integer.MIN_VALUE;// max
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < arrMinMAx[0]) {
                arrMinMAx[0] = arr[i];
            } else if (arr[i] > arrMinMAx[1]) {
                arrMinMAx[1] = arr[i];
            }
        }
        return arrMinMAx;
    }

    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);
        int size = rd.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt();
        }
        int arrMinMax[] = minMax(arr);
        System.out.println("min value is : " + arrMinMax[0]);
        System.out.println("max value is : " + arrMinMax[1]);
        rd.close();
    }
}
