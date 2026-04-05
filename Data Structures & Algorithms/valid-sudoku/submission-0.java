class Solution {
    public boolean isValidSudoku(char[][] board) {
         for(int i = 0; i < 9; i++){
            Set<Character> set1 = new HashSet<>();
            Set<Character> set2 = new HashSet<>();
            for(int j = 0; j < 9; j++){
                if(board[i][j] != '.'){
                    if(set1.contains(board[i][j])) return false;
                    set1.add(board[i][j]);
                }
                if(board[j][i] !='.'){
                     if(set2.contains(board[j][i])) return false;
                    set2.add(board[j][i]);
                }
            }
        }
        // 3 X 3 grid check

        for(int i = 0; i < 9 ; i=i+3){
            for(int j = 0; j < 9; j+=3){
                 Set<Character> set3 = new HashSet<>();
                 for(int r = i; r < i+3; r++){
                    for(int c = j; c < j+3; c++){
                        if(board[r][c] !='.'){
                            if(set3.contains(board[r][c])) return false;
                            set3.add(board[r][c]);
                        }
                    }
                 }
            }
        }
        return true;
    }
}
