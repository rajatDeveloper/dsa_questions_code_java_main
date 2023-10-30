import java.util.Scanner;

public class union {
    public static void UnionFun(int arr1[], int arr2[]) {
        int i, j;
        for (i = 0; i < arr1.length; i++) {
            for (j = 0; j < arr2.length; j++) {
                if (arr1[i] != arr2[j]) {
                    System.out.print(arr1[i] + " " + arr2[j] + " ");
                    arr2[j] = Integer.MIN_VALUE;
                    break;
                }
            }
        }

    }

    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);
        int size1 = rd.nextInt();
        int arr1[] = new int[size1];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = rd.nextInt();
        }
        int size2 = rd.nextInt();
        int arr2[] = new int[size2];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = rd.nextInt();
        }
        UnionFun(arr1, arr2);
        rd.close();
    }
}
