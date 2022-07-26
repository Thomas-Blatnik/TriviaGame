package com.games;

public class Clue {

    //Properties

    private final String CATEGORY;
    private final int DOLLAR_VALUE;
    private boolean hasBeenSelected = false;
    private final String ANSWER;
    private final String CORRECT_RESPONSE;

    //Constructors

    public Clue(String category, int dollarValue, String answer, String correctResponse){

        this.CATEGORY = category;
        this.DOLLAR_VALUE = dollarValue;
        this.ANSWER = answer;
        this.CORRECT_RESPONSE = correctResponse;

    }

    //Getters and Setters

    public String getCategory(){
        return this.CATEGORY;
    }

    public int getDollarValue(){
        return this.DOLLAR_VALUE;
    }

    public String getAnswer(){
        return this.ANSWER;
    }

    public String getCorrectResponse(){
        return this.CORRECT_RESPONSE;
    }

    public boolean HasBeenSelected(){
        return this.hasBeenSelected;
    }

    //Methods

    //Marks clue as having been selected. Used for displaying Jeopardy Board.
    public void selectClue(){
        hasBeenSelected = true;
    }

}
