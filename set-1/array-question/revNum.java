import java.util.Scanner;

public class revNum {
    public static int revNumData(int num) {
        int temp = num, revNum = 0;
        while (temp > 0) {
            int lastdig = temp % 10;
            temp = temp / 10;
            revNum = revNum * 10 + lastdig;
        }
        return revNum;
    }

    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);
        int num = rd.nextInt();
        System.out.println(revNumData(num));
        rd.close();
    }
}
