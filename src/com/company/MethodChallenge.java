package com.company;

public class MethodChallenge {
    // Create a method called displayHighScorePosition
    // it should a players name as a parameter, and a 2nd parameter as a position in the high score table
    // You should display the players name along with a message like " managed to get into position " and the
    // position they got and a further message " on the high score table".
    //
    // Create a 2nd method called calculateHighScorePosition
    // it should be sent one argument only, the player score
    // it should return an in
    // the return data should be
    // 1 if the score is >=1000
    // 2 if the score is >=500 and < 1000
    // 3 if the score is >=100 and < 500
    // 4 in all other cases
    // call both methods and display the results of the following
    // a score of 1500, 900, 400 and 50

    public static void main(String[] args) {
        displayHighScorePosition("Eric", 1500);
        displayHighScorePosition("Corina", 900);
        displayHighScorePosition("Mom", 50);
        displayHighScorePosition("Dad", 400);
    }

    public static void displayHighScorePosition(String name, int score) {
        String result = name + " managed to get into position " + calculateHighScorePosition(score);
        System.out.println(result);
    }

    public static int calculateHighScorePosition(int score) {
        if (score >= 1000) {
            return 1;
        } else if (score >= 500) {
            return 2;
        } else if (score >= 100) {
            return 3;
        }
        return 4;
    }
}
