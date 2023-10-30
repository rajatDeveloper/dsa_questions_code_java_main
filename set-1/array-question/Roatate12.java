import java.util.Scanner;

public class Roatate12 {
    public static void rotate(int arr[]) {
        int size = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            arr[i] = arr[size];
            arr[size] = temp;

        }
    }

    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);
        int size = rd.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt();
        }
        rotate(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
