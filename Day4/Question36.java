/*
 * Q36. You are climbing a staircase. It takes n steps to reach the top. Each
 * time you can either climb 1 or 2 steps. In how many distinct ways can you
 * climb to the top? Examples: Input: n = 2 Output: 2 Explanation: There are two
 * ways to climb to the top. 1. 1 step + 1 step 2. 2 steps Input: n = 3 Output:
 * 3 Explanation: There are three ways to climb to the top. 1. 1 step + 1 step +
 * 1 step 2. 1 step + 2 steps 3. 2 steps + 1 step
 */

import java.util.*;

public class Question36 {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res[] = new int[n + 1];
        res[0] = 1;
        res[1] = 1;
        for (int i = 2; i <= n; i++) {
            res[i] = res[i - 1] + res[i - 2];
        }
        System.out.println("Maximum possible number of steps is: " + res[n]);
    }
}
