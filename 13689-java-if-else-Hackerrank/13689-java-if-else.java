public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        if (n % 2 == 0 && 2 <= n && n <= 5){
            System.out.println("Not Weird");
        } else if (n % 2 == 0 && 6 <= n && n <= 20){
            System.out.println("Weird");
        }else if(n % 2 == 0 && 20 <= n){
            System.out.println("Not Weird");

import java.util.regex.*;
import java.util.concurrent.*;
import java.text.*;
import java.util.*;
import java.math.*;
import java.security.*;
import java.io.*;

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna