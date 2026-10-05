public class Sudoku {
    public static void print(char sudoku[][]){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                System.out.print(sudoku[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static boolean isSafe(char sudoku[][],int i,int j,int num){
        
        int col = j;
        int row = i;
        // check row
        for(col =0;col<9;col++){
            if(sudoku[row][col]==(char)(num+'0')){
                return false;
            }
        }
        // check col
        col = j;
        row = i;
        for(row =0;row<9;row++){
            if(sudoku[row][col]==(char)(num+'0')){
                return false;
            }
        }

        col = (j/3)*3;
        row = (i/3)*3;
        // check grid
        for(int x = row;x<row+3;x++){
            for(int y = col; y<col+3;y++){
                if(sudoku[x][y]==(char)(num+'0')){
                    return false;
                }
            }
        }

        return true;
    }
    public static boolean sudokuSolver(char sudoku[][],int i,int j){
        if(i==9){
            print(sudoku);
            return true;
        }
        int nRow = i,nCol = j+1;
        if(j==8){
            nRow = i+1;
            nCol =0;
        }

        if(sudoku[i][j]!='.'){
            sudokuSolver(sudoku,nRow, nCol);
            return true;
        }

        for(int num=1;num<=9; num++){
            
                if(isSafe(sudoku,i,j,num)){

                    sudoku[i][j]=(char)(num+'0');

                    sudokuSolver(sudoku, nRow, nCol);

                    sudoku[i][j] = '.';
                }
            
        }
        return true;
    }    

    public static void main(String[] args) {
        char sudoku[][] = {
            {'5','3','.','.','7','.','.','.','.'},
            {'6','.','.','1','9','5','.','.','.'},
            {'.','9','8','.','.','.','.','6','.'},
            {'8','.','.','.','6','.','.','.','3'},
            {'4','.','.','8','.','3','.','.','1'},
            {'7','.','.','.','2','.','.','.','6'},
            {'.','6','.','.','.','.','2','8','.'},
            {'.','.','.','4','1','9','.','.','5'},
            {'.','.','.','.','8','.','.','7','9'}
        };

        sudokuSolver(sudoku,0,0);




    }
}
