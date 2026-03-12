import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt(); // number of test cases

        while (t-- > 0) {

            int n = sc.nextInt();
            Integer[] arr = new Integer[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            Arrays.sort(arr, (a, b) -> {
                int bitA = Integer.bitCount(a);
                int bitB = Integer.bitCount(b);

                boolean evenA = bitA % 2 == 0;
                boolean evenB = bitB % 2 == 0;

                if (evenA && !evenB) return -1;
                if (!evenA && evenB) return 1;

                return a - b;
            });

            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
