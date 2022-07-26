package com.games;

public class Player {

    //Properties
    private String playerNumber;
    private String name;
    private int score = 0;
    private boolean isEligibleForFinalJeopardy = false;





    //Constructors
    public Player(String playerNumber){
        this.playerNumber = playerNumber;
    }

    //Getters and Setters

    public String getPlayerNumber() {
        return this.playerNumber;
    }

    public String getName() {
        return this.name;
    }

    public int getScore() {
        return this.score;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isEligibleForFinalJeopardy(){ return this.isEligibleForFinalJeopardy;}

    public void makeEligibleForFinalJeopardy(){
        this.isEligibleForFinalJeopardy = true;
    }

    //Methods

    //Adjusts player score based on boolean isCorrect and dollar value of clue
    //Adds dollar value to score if correct
    //Subtracts dollar value from score if not correct
    public void adjustScore(boolean isCorrect, int dollarValue){
        if(isCorrect){
            score += dollarValue;
        }
        else{
            score -= dollarValue;
        }
    }
}
