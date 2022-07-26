package Jeopardy.Game.Jeopardy.Game.Model;

public class Clue {

    private String category;
    private String clue;
    private String answer;
    private String value;
    private boolean hasBeenSelected = false;

    public String getCategory(){
        return category;
    }

    public String getClue(){
        return clue;
    }

    public String getAnswer(){
        return answer;
    }

    public String getValue(){
        return value;
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
