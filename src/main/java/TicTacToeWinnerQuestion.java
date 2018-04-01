package main.java;

/**
 * Design an algorithm to figure out if someone has won a game of tic-tac-toe.
 * Consider that we know the last move.
 */
public class TicTacToeWinnerQuestion
{
    public boolean hasWon(int[][] board, int row, int column)
    {
        if(hasWonRow (board, row, column))
            return true;
        if(hasWonColumn(board, row, column))
            return true;
        if(hasWonDiagonal(board, row, column))
            return true;
        return false;
    }

    private boolean hasWonRow(int[][] board, int row, int column)
    {
        int cellValue = board[row][column];
        return(board[row][0] == cellValue && board[row][1] == cellValue && board[row][2] == cellValue);
    }

    private boolean hasWonColumn(int[][] board, int row, int column)
    {
        int cellValue = board[row][column];
        return(board[0][column] == cellValue && board[1][column] == cellValue && board[2][column] == cellValue);
    }

    private boolean hasWonDiagonal(int[][] board, int row, int column)
    {
        int cellValue = board[row][column];
//        if()
        return true;
    }
}
