class Solution {
    static int countStrings(int n) {
        // Base cases
        if (n == 1) return 2;
        if (n == 2) return 3;

        int prev2 = 2; // f(1)
        int prev1 = 3; // f(2)
        int current = 0;

        for (int i = 3; i <= n; i++) {
            current = prev1 + prev2;
            prev2 = prev1;
            prev1 = current;
        }
        return current;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna