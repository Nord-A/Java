package com.osorio;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

//	if (score < 5000 && score > 1000) {                            // If there is now square brackets
//		System.out.println("Your score was less than 5000 but greater than 1000");// only the next statement will execute
//	} else if(score < 1000){
//			System.out.println("your score was less than 1000");
//	} else {
//		System.out.println("Got here!");
//	}

        if (gameOver == true) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }

        // Print out a second score on the screen with the following
        // Score set to 10000
        // LevelCompleted set to 8
        // Bonus set to 200

        // My version below!!!!!!!!!!!!!!!!!!!!!!!!!!!

        if (gameOver == true) {
            int secondScore = 10000;
            int secondLevelCompleted = 8;
            int secondBonus = 200;
            int finalScore = secondScore + (secondLevelCompleted * secondBonus);
            System.out.println("your second final score " + finalScore);
        }


        // Teachers version!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

        boolean newgameOver = true;
        int newscore = 10000;
        int newlevelCompleted = 8;
        int newbonus = 200;


        if (newgameOver == true) {
            int finalScore = newscore + (newlevelCompleted * newbonus);
            System.out.println("Your final score was " + finalScore);


        }
    }
}
