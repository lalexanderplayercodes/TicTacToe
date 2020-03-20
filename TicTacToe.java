public class TicTacToe {



    private int board[][];



    public TicTacToe()

    {

        board = new int[3][3];

        for(int i=0;i<board.length;i++)

            for(int j=0;j<board[i].length;j++)

                board[i][j] = 0;

    }



    public void move(int playerNumber, int row, int col)

    {

        board[row][col] = playerNumber;

    }



    public boolean isLegalMove(int row, int col)

    {

        if(row >=0 && row <board.length && col >=0 && col < board.length)

        {

            if(board[row][col] == 0)

                return true;

        }



        return false;

    }



    public boolean isGameWon()

    {

        if(isRowWinner())

            return true;

        if(isColumnWinner())

            return true;

        if(isDiagonalWinner())

            return true;



        return false;

    }



    private boolean isRowWinner()

    {

        for(int i=0;i<3;i++)

        {

            if((board[i][0] == board[i][1] ) && (board[i][0] == board[i][2]))

                if(board[i][0] == 1 || board[i][0] == 2)

                    return true;

        }

        return false;

    }



    private boolean isColumnWinner()

    {

        for(int i=0;i<3;i++)

        {

            if((board[0][i] == board[1][i] ) && (board[1][i] == board[2][i]))

                if(board[0][i] == 1 || board[0][i] == 2)

                    return true;

        }

        return false;

    }



    private boolean isDiagonalWinner()

    {

        if((board[0][0] == board[1][1]) && (board[1][1] == board[2][2]))

            if(board[0][0] == 1 || board[0][0] == 2)

                return true;

        if((board[0][2] == board[1][1]) && (board[1][1] == board[2][0]))

            if(board[1][1] == 1 || board[1][1] == 2)

                return true;

        return false;

    }



    public boolean isGameTie()

    {

        if(!isGameWon())

        {

            for(int i=0;i<board.length;i++)

                for(int j=0;j<board[i].length;j++)

                    if(board[i][j] == 0)

                        return false;

            return true;

        }



        return false;

    }



    public String toString()

    {

        String boardString="";

        for(int i=0;i<3;i++)

        {

            for(int j=0;j<3;j++)

            {

                if(board[i][j] == 1)

                    boardString += "X" ;

                else if(board[i][j] == 2)

                    boardString += "O" ;

                else

                    boardString += " " ;



                if(j != 2)

                    boardString += " |";



            }



            if(i != 2)

                boardString += "\n";

        }

        boardString += "\n";



        return boardString;

    }

}