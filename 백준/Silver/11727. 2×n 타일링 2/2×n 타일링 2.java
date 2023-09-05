import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static int[] dp = new int[1001];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        dp[1] = 1;
        dp[2] = 3;
        for (int i = 3; i < n + 1; i++) {
            dp[i] = (dp[i - 1] + 2 * dp[i - 2]) % 10007;
        }

        System.out.println(dp[n]);
    }
}