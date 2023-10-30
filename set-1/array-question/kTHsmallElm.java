
import java.util.Arrays;
import java.util.Scanner;

public class kTHsmallElm {
    public static int nThVAl(int arr[], int pos) {
        int val;
        Arrays.sort(arr);
        val = arr[pos - 1];
        return val;
    }

    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);
        int size = rd.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt();
        }
        System.out.print("Enter the nth postion : ");
        int pos = rd.nextInt();
        int val = nThVAl(arr, pos);
        System.out.println(pos + "th smallest elment of array is : " + val);
        rd.close();
    }
}
