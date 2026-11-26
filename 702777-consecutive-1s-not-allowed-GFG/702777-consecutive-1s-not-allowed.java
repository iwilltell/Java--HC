class Solution {
    int countStrings(int n) {
        // code here
        if(n == 1) return 2;
        if(n == 2) return 3;
        
        int prv2 = 2,prv1 = 3;
        for(int i = 3; i <= n; i++){
            int curr = prv1 + prv2;
            prv2 = prv1;
            prv1 = curr;
        }
        return prv1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna