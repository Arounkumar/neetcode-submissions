class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> seen = new HashSet();
        for (int i = 0; i < board[0].length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                char val = board[i][j];
                if (val == '.') {
                    continue;
                }
                if (!seen.add(val + "row-" + i) || !seen.add(val + "col-" + j)
                    || !seen.add(val + "box-" + (i/3) + "-" + (j/3))) {
                        return false;
                }
            }
        }
        return true;
    }
}
