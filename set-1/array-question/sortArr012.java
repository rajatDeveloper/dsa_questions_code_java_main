import java.util.Scanner;

public class sortArr012 {
    public static void arrSort(int arr[]) {
        int oneNum = 0;
        int zeroNum = 0;
        int twoNum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                zeroNum++;
            } else if (arr[i] == 1) {
                oneNum++;
            } else if (arr[i] == 2) {
                twoNum++;
            }
        }
        int i = 0;
        while (i < zeroNum) {
            arr[i] = 0;
            i++;
        }
        while (i < zeroNum + oneNum) {
            arr[i] = 1;
            i++;
        }
        while (i < zeroNum + oneNum + twoNum) {
            arr[i] = 2;
            i++;
        }
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);
        int size = rd.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt();

        }
        arrSort(arr);

        printArr(arr);

        rd.close();
    }
}
