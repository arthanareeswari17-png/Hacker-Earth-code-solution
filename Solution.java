import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();     // Read integer
        String s = sc.next();     // Read string

        System.out.println(n * 2);  // Print double of integer
        System.out.println(s);      // Print the same string

        sc.close();
    }
}
