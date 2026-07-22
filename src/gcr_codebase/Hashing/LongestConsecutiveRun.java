package gcr_codebase.Hashing;

import java.util.HashSet;

public class LongestConsecutiveRun {


    public static int longestConsecutiveRun(int[] ids) {

        HashSet<Integer> idSet = new HashSet<>();


        for (int id : ids) {
            idSet.add(id);
        }

        int longest = 0;


        for (int id : idSet) {


            if (!idSet.contains(id - 1)) {

                int current = id;
                int length = 1;

                while (idSet.contains(current + 1)) {
                    current++;
                    length++;
                }

                longest = Math.max(longest, length);
            }
        }

        return longest;
    }

    public static void main(String[] args) {

        int[] ids = {100, 4, 200, 1, 3, 2};

        int result = longestConsecutiveRun(ids);

        System.out.println("Longest Consecutive Run Length: " + result);
    }
}
