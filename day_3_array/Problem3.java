import java.util.HashMap;
import java.util.Map;

public class Problem3 {

    // get element which is present in arr more than n/2 times

    // better sol n
    // static int majorityElement(int[] arr) {

    // int n = arr.length;

    // HashMap<Integer, Integer> map = new HashMap<>();

    // // finding therir count and storing in array

    // for (int i = 0; i < n; i++) {
    // int val = map.getOrDefault(arr[i], 0);
    // map.put(arr[i], val + 1);
    // }

    // // hashmap travelsal
    // for (Map.Entry<Integer, Integer> it : map.entrySet()) {
    // if (it.getValue() > (n / 2)) {
    // return it.getKey();
    // }
    // }

    // return -1;
    // }

    // otiomal soln - Moorses voting algoothm
    public static int majorityElement(int[] v) {

        // size of the given array:
        int n = v.length;

        int cnt = 0; // count
        int el = 0; // Element

        // applying the algorithm:
        for (int i = 0; i < n; i++) {
            if (cnt == 0) {
                cnt = 1;
                el = v[i];
            } else if (el == v[i])
                cnt++;
            else
                cnt--;
        }

        // checking if the stored element
        // is the majority element:
        int cnt1 = 0;
        for (int i = 0; i < n; i++) {
            if (v[i] == el)
                cnt1++;
        }

        if (cnt1 > (n / 2))
            return el;
        return -1;
    }

    public static void main(String[] args) {

        int[] arr = { 2, 1, 1, 1, 1, 2, 2 };
        int ans = majorityElement(arr);
        System.out.println("The majority element is: " + ans);

    }
}
