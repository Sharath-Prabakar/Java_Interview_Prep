import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            long n = in.nextInt();
            System.out.println(sum(n, 3) + sum(n, 5) - sum(n, 15));

        }

    }

    public static long sum(long n, int multiple) {
        //using S = n/2 * (a1 + aN) where n is no of terms
        //a1 - first term
        //aN - last term
        long n_terms = (n - 1) / multiple;
        long sum_first_last = multiple + n_terms * multiple;
        long sum = (n_terms * sum_first_last) / 2;
        return sum;
    }

}