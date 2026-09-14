class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();

        int m = matrix.length;
        int n = matrix[0].length;

        int sr = 0;
        int sc = 0;
        int er = m - 1;
        int ec = n - 1;

        while (sr <= er && sc <= ec) {

            for (int j = sc; j <= ec; j++) {
                list.add(matrix[sr][j]);
            }

            for (int i = sr + 1; i <= er; i++) {
                list.add(matrix[i][ec]);
            }

            for (int j = ec - 1; j >= sc; j--) {
                if (sr != er) {
                    list.add(matrix[er][j]);
                }
            }
            for (int i = er - 1; i > sr; i--) {
                if (sc != ec) {
                    list.add(matrix[i][sc]);
                }
            }
            sr++;
            er--;
            sc++;
            ec--;

        }
        System.out.println(list);
        return list;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna