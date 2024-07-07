import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> validStrings(int n) {
        List<String> list = new ArrayList<>();
        int m = (int) Math.pow(2, n);
        int[][] sequence = new int[m][n];
        
        // Populate the sequence array
        for (int j = 0; j < n; j++) {
            int itr = (int) Math.pow(2, n - j - 1);
            for (int i = 0; i < m;) {
                for (int k = 0; k < itr && i < m; k++, i++) {
                    sequence[i][j] = 1;
                }
                i += itr;
            }
        }

        // Generate valid strings
        for (int i = 0; i < m; i++) {
            StringBuilder str = new StringBuilder();
            boolean flag = true;
            for (int j = 0; j < n; j++) {
                if (j < n - 1 && sequence[i][j] == 0 && sequence[i][j + 1] == 0) {
                    flag = false;
                    break;
                }
                str.append(sequence[i][j]);
            }
            if (flag) {
                list.add(str.toString());
            }
        }
        return list;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.validStrings(3));
    }
}
