package day_9_recrsion;

import java.util.ArrayList;
import java.util.List;

public class Problrm_3 {
    // combination sum - target and arr given - have comninations whose sum is equal
    // to target

    static void findCombinations(int ind, int[] arr, int target, List<List<Integer>> ans, List<Integer> ds) {
        if (ind == arr.length) {
            if (target == 0) {
                ans.add(new ArrayList<>(ds)); 
            }
            return;
        }

        if (arr[ind] <= target) {
            ds.add(arr[ind]);
            findCombinations(ind, arr, target - arr[ind], ans, ds);
            ds.remove(ds.size() - 1);
        }
        findCombinations(ind + 1, arr, target, ans, ds);
    }

    static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        findCombinations(0, candidates, target, ans, new ArrayList<>());
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 6, 7 };
        int target = 7;

        List<List<Integer>> ls = combinationSum(arr, target);
        System.out.println("Combinations are: ");
        for (int i = 0; i < ls.size(); i++) {
            for (int j = 0; j < ls.get(i).size(); j++) {
                System.out.print(ls.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}
