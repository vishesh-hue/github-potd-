class Solution 
{
    public boolean isValidSudoku(char[][] board) 
    {
        var seen = new HashSet<>();
        for (int i = 0; i < 9; ++i)
            for (int j = 0; j < 9; ++j)
                if (board[i][j] != '.')
                    if (!seen.add(new Pair(board[i][j], -10 + i)) || 
                       !seen.add(new Pair(board[i][j], -20 + j)) || 
                       !seen.add(new Pair(board[i][j], i/3 * 10 + j/3)))
                    return false;
        return true;
    }
}
