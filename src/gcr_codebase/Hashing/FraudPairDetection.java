package gcr_codebase.Hashing;

import java.util.HashMap;
import java.util.Arrays;

public class FraudPairDetection {


    public static int[] findFraudPair(int[] amounts, int target) {

        HashMap<Integer, Integer> seen = new HashMap<>();

        for (int i = 0; i < amounts.length; i++) {

            int complement = target - amounts[i];


            if (seen.containsKey(complement)) {
                return new int[] { seen.get(complement), i };
            }


            seen.put(amounts[i], i);
        }

        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {

        int[] amounts = {40, 10, 20, 30, 50};
        int target = 50;

        int[] result = findFraudPair(amounts, target);

        System.out.println("Transaction Amounts: " + Arrays.toString(amounts));
        System.out.println("Indices: " + Arrays.toString(result));
    }
}
