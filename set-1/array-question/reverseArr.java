import java.util.Scanner;

public class reverseArr {

    public static void arrRev(int arr[]) {
        int temp;
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);
        System.out.print("Enter lenght of arr or Str : ");
        int num = rd.nextInt();
        int arrData[] = new int[num];
        for (int i = 0; i < arrData.length; i++) {
            arrData[i] = rd.nextInt();
        }
        arrRev(arrData);
        printArr(arrData);

        rd.close();
    }
}