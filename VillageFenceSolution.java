import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String village = sc.next();

        char[] arr = village.toCharArray();

        // Replace empty grids with fences
        for (int i = 0; i < n; i++) {
            if (arr[i] == '.') {
                arr[i] = 'B';
            }
        }

        System.out.println("YES");
        System.out.println(new String(arr));

        sc.close();
    }
}
