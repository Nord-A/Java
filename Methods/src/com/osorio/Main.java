package com.osorio;

public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(true, score, levelCompleted, bonus);
        System.out.println("Your final scores " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(true, score, levelCompleted, bonus);
        System.out.println("Your final scores " + highScore);

        // create a method called displayHighScorePosition
        // it should receive a players name as a parameter, and 2nd parameter as a position in the high score table
        // you should display the players name along with a message like " managed to get into position " and the
        // position they got and a further message " on the high score table".
        //
        // create a 2nd method called calculateHighScorePosition
        // it should be sent one argument only, the player score
        // it should return an int
        // the return data should be
        // 1 if the score is >= 1000
        // 2 if the score is >= 500 and < 1000
        // 3 if the score is >= 100 and < 500
        // 4 in all other cases
        // call both methods and display the results following
        // a score of 1500, 900, 400, and 50

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Luis", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Gunnva", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Mamma", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Babba", highScorePosition);

        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Shakespare", highScorePosition);

        highScorePosition = calculateHighScorePosition(500);
        displayHighScorePosition("Carol", highScorePosition);

        highScorePosition = calculateHighScorePosition(100);
        displayHighScorePosition("Einstein", highScorePosition);


    }


    public static void displayHighScorePosition(String playername, int highScorePosition) {
        System.out.println(playername + " managed to get into position " + highScorePosition
                + " on the high score table");
    }


    public static int calculateHighScorePosition(int playerScore) {
        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500 && playerScore < 1000) {
            return 2;
        } else if (playerScore >= 100 && playerScore < 500) {
            return 3;
        } else {
            return 4;
        }

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {


        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;


        } else {
            return -1;
        }

    }
}

