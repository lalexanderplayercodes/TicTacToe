import java.util.Random;
import java.util.Scanner;
public class Player {


        private String name;

        private int wins;

        private int loss;


        public Player(String name) {

            this.name = name;

            wins = 0;

            loss = 0;

        }


        public void incrementWins() {

            wins++;

        }


        public void incrementLoss() {

            loss++;

        }


        public int getWins() {

            return wins;

        }


        public int getLoss() {

            return loss;

        }


        public String getName() {

            return name;

        }

    }
