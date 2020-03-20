import java.util.Random;
import java.util.Scanner;
public class GameDriver {
    public static void main(String[] args) {


        String name;

        Player player1, player2, currentPlayer;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter first player name : ");

        name = scan.nextLine();

        player1 = new Player(name);

        System.out.print("Enter second player name : ");

        name = scan.nextLine();

        player2 = new Player(name);

        Random ran = new Random();

        int num = ran.nextInt(2)+1;


        if(num == 2)

        {

            currentPlayer = player1;

            player1 = player2;

            player2 = currentPlayer;

        }


        System.out.println(player1.getName()+" is player1 and "+player2.getName()+" is player 2");


        num = 1;

        TicTacToe game = new TicTacToe();

        int row, col;

        while(!game.isGameTie() && !game.isGameWon())

        {

            System.out.println("Board :\n"+game);

            if(num == 1)

                System.out.println("It iss "+player1.getName()+" turn ");

            else

                System.out.println("It iss "+player2.getName()+" turn ");



            System.out.print("Enter row number (0-2) and column number(0-2) of your move : ");

            row = scan.nextInt();

            col = scan.nextInt();

            while(!game.isLegalMove(row, col))

            {

                System.out.println("That is an invalid move");

                System.out.print("Enter the row number (0-2) and column number(0-2) of your move : ");

                row = scan.nextInt();

                col = scan.nextInt();

            }


            game.move(num, row, col);


            if(num == 1)

                num = 2;

            else

                num = 1;

        }


        System.out.println("Board :\n"+game);

        if(game.isGameTie())

            System.out.println("Game result is a tie");

        else
        {

            if(num == 1)

            {

                System.out.println(player2.getName()+" won the game. Good job!");

                player2.incrementWins();

                player1.incrementLoss();

            }else

            {

                System.out.println(player1.getName()+" won the game. Good job!");

                player1.incrementWins();

                player2.incrementLoss();

            }

        }



        scan.close();

    }
}
