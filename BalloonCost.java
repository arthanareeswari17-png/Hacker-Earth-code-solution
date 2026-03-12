import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt(); // test cases

        while (t-- > 0) {

            int g = sc.nextInt(); // green balloon cost
            int p = sc.nextInt(); // purple balloon cost

            int n = sc.nextInt(); // number of participants

            int problem1 = 0;
            int problem2 = 0;

            for (int i = 0; i < n; i++) {

                int a = sc.nextInt();
                int b = sc.nextInt();

                if (a == 1) problem1++;
                if (b == 1) problem2++;
            }

            int cost1 = problem1 * g + problem2 * p;
            int cost2 = problem1 * p + problem2 * g;

            System.out.println(Math.min(cost1, cost2));
        }

        sc.close();
    }
}
