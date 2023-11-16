import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem2 {

    // merge overlapping intervals
    // such (1 , 2) (1, 4) (2, 4) (4,9)(5,10)
    // ans (1, 4) (4, 10)

    // optimal approuch

    class Solution {

        // optimal soln  
        public int[][] merge(int[][] intervals) {
    
            //sort the intervals 
           Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
    
            //now have onetravelsal 
            
            int start = intervals[0][0];
            int end = intervals[0][1];

            List<int[]> ans = new ArrayList<>();

            for(int[] interval : intervals){
                // (1, 2) (1, 8)
                if(interval[0] <= end){
                    end = Math.max(end, interval[1]);
                }else{
                    ans.add(new int[]{start, end});
                    start = interval[0];
                    end = interval[1];
                }
            }
            ans.add(new int[]{start, end});

            return ans.toArray(new int[ans.size()][]);
        
            
        }
    }

    static List<List<Integer>> mergeIntervals(int[][] arr) {
        List<List<Integer>> ans = new ArrayList<>();

        if (arr.length == 0 || arr == null) {
            return ans;
        }

        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));

        int start = arr[0][0];
        int end = arr[0][1];

        for (int[] interval : arr) {
            // (1, 2) (1, 8)
            if (interval[0] <= end) {
                end = Math.max(end, interval[1]);
            } else {
                ans.add(Arrays.asList(start, end));
                start = interval[0];
                end = interval[1];
            }
        }

        ans.add(Arrays.asList(start, end));

        return ans;
    }

    public static void main(String[] args) {
        int[][] arr = { { 1, 3 }, { 8, 10 }, { 2, 6 }, { 15, 18 } };
        List<List<Integer>> ans = mergeIntervals(arr);
        System.out.print("The merged intervals are: \n");
        for (List<Integer> it : ans) {
            System.out.print("[" + it.get(0) + ", " + it.get(1) + "] ");
        }
        System.out.println();
    }
}
