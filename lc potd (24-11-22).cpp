class Solution {
public:
    bool exist(vector<vector<char>>& board, string word) {
        for (size_t y = 0; y < board.size(); y++) {
            for (size_t x = 0; x < board[y].size(); x++) {
                if (dfs(board, x, y, word)) {
                    return true;
                }
            }
        }
        
        return false;
    }
    
    bool dfs(vector<vector<char>>& board, size_t x, size_t y, string_view word) {
        if (word.empty()) {
            return true;
        }
        if (y >= board.size() || x >= board[y].size()) {
            return false;
        }
        const char ch = board[y][x];
        if (ch != word.front()) {
            return false;
        }
        board[y][x] = '*';
        word = word.substr(1);
        const bool res = 
            dfs(board, x + 1, y, word) |
            dfs(board, x - 1, y, word) |
            dfs(board, x, y + 1, word) |
            dfs(board, x, y - 1, word) ;
        
        board[y][x] = ch;
        return res;
    }
};
