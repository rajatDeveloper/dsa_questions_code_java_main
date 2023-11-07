package day_10_recrsion_backtracking;

import java.util.*;

public class Problem_1 {

    // get all permutation of a array

    static void recrPermuatation(int[] nums, List<Integer> ds, List<List<Integer>> ans, boolean[] freq) {

        if (ds.size() == nums.length) {
            ans.add(new ArrayList<>(ds));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (!freq[i]) {

                freq[i] = true;
                ds.add(nums[i]);
                recrPermuatation(nums, ds, ans, freq);
                freq[i] = false;
                ds.remove(ds.size() - 1);
            }
        }

    }

    static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        recrPermuatation(nums, new ArrayList<>(), ans, new boolean[nums.length]);
        return ans;
    }

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3 };

        for (List<Integer> ls : permute(arr)) {
            System.out.println(ls);
        }

    }
}
