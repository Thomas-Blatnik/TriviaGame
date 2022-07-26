package com.games;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public abstract class Game {
    protected  List<Player> players = new ArrayList<>();

//    protected final String JEOPARDY_CATEGORY_1 = "Category1";
//    protected final String JEOPARDY_CATEGORY_2 = "Category2";
//    protected final String JEOPARDY_CATEGORY_3 = "Category3";
//    protected final String JEOPARDY_CATEGORY_4 = "Category4";
//    protected final String JEOPARDY_CATEGORY_5 = "Category5";
//    protected final String JEOPARDY_CATEGORY_6 = "Category6";
//    protected final String DOUBLE_JEOPARDY_CATEGORY_1 = "Category1";
//    protected final String DOUBLE_JEOPARDY_CATEGORY_2 = "Category2";
//    protected final String DOUBLE_JEOPARDY_CATEGORY_3 = "Category3";
//    protected final String DOUBLE_JEOPARDY_CATEGORY_4 = "Category4";
//    protected final String DOUBLE_JEOPARDY_CATEGORY_5 = "Category5";
//    protected final String DOUBLE_JEOPARDY_CATEGORY_6 = "Category6";
//
//
//    public Clue Clue0 = new Clue("Category1", 200,
//            "answer0",
//            "correctResponse0");
//    public Clue Clue1 = new Clue("Category1", 400,
//            "answer1",
//            "correctResponse1");
//    public Clue Clue2 = new Clue("Category1", 600,
//            "answer2",
//            "correctResponse2");
//    public Clue Clue3 = new Clue("Category3", 800,
//            "answer3",
//            "correctResponse3");
//    public Clue Clue4 = new Clue("Category4", 1000,
//            "answer4",
//            "correctResponse4");
//    public Clue Clue5 = new Clue("Category2", 200,
//            "answer5",
//            "correctResponse5");
//    public Clue Clue6 = new Clue("Category2", 400,
//            "answer6",
//            "correctResponse6");
//    public Clue Clue7 = new Clue("Category2", 600,
//            "answer7",
//            "correctResponse7");
//    public Clue Clue8 = new Clue("Category2", 800,
//            "answer8",
//            "correctResponse8");
//    public Clue Clue9 = new Clue("Category2", 1000,
//            "answer9",
//            "correctResponse9");
//    public Clue Clue10 = new Clue("Category3", 200,
//            "answer10",
//            "correctResponse10");
//    public Clue Clue11 = new Clue("Category3", 400,
//            "answer11",
//            "correctResponse11");
//    public Clue Clue12 = new Clue("Category3", 600,
//            "answer12",
//            "correctResponse12");
//    public Clue Clue13 = new Clue("Category3", 800,
//            "answer13",
//            "correctResponse13");
//    public Clue Clue14 = new Clue("Category3", 1000,
//            "answer14",
//            "correctResponse14");
//    public Clue Clue15 = new Clue("Category4", 200,
//            "answer15",
//            "correctResponse15");
//    public Clue Clue16 = new Clue("Category4", 400,
//            "answer16",
//            "correctResponse16");
//    public Clue Clue17 = new Clue("Category4", 600,
//            "answer17",
//            "correctResponse17");
//    public Clue Clue18 = new Clue("Category4", 800,
//            "answer18",
//            "correctResponse18");
//    public Clue Clue19 = new Clue("Category4", 1000,
//            "answer19",
//            "correctResponse19");
//    public Clue Clue20 = new Clue("Category5", 200,
//            "answer20",
//            "correctResponse20");
//    public Clue Clue21 = new Clue("Category5", 400,
//            "answer21",
//            "correctResponse21");
//    public Clue Clue22 = new Clue("Category5", 600,
//            "answer22",
//            "correctResponse22");
//    public Clue Clue23 = new Clue("Category5", 800,
//            "answer23",
//            "correctResponse23");
//    public Clue Clue24 = new Clue("Category5", 1000,
//            "answer24",
//            "correctResponse24");
//    public Clue Clue25 = new Clue("Category6", 200,
//            "answer25",
//            "correctResponse25");
//    public Clue Clue26 = new Clue("Category6", 400,
//            "answer26",
//            "correctResponse26");
//    public Clue Clue27 = new Clue("Category6", 600,
//            "answer27",
//            "correctResponse27");
//    public Clue Clue28 = new Clue("Category6", 800,
//            "answer28",
//            "correctResponse28");
//    public Clue Clue29 = new Clue("Category6", 1000,
//            "answer29",
//            "correctResponse29");
//
//
//    public Clue DoubleClue0 = new Clue("Category1", 400,
//            "answer0",
//            "correctResponse0");
//    public Clue DoubleClue1 = new Clue("Category1", 800,
//            "answer1",
//            "correctResponse1");
//    public Clue DoubleClue2 = new Clue("Category1", 1200,
//            "answer2",
//            "correctResponse2");
//    public Clue DoubleClue3 = new Clue("Category3", 1600,
//            "answer3",
//            "correctResponse3");
//    public Clue DoubleClue4 = new Clue("Category4", 2000,
//            "answer4",
//            "correctResponse4");
//    public Clue DoubleClue5 = new Clue("Category2", 400,
//            "answer5",
//            "correctResponse5");
//    public Clue DoubleClue6 = new Clue("Category2", 800,
//            "answer6",
//            "correctResponse6");
//    public Clue DoubleClue7 = new Clue("Category2", 1200,
//            "answer7",
//            "correctResponse7");
//    public Clue DoubleClue8 = new Clue("Category2", 1600,
//            "answer8",
//            "correctResponse8");
//    public Clue DoubleClue9 = new Clue("Category2", 2000,
//            "answer9",
//            "correctResponse9");
//    public Clue DoubleClue10 = new Clue("Category3", 400,
//            "answer10",
//            "correctResponse10");
//    public Clue DoubleClue11 = new Clue("Category3", 800,
//            "answer11",
//            "correctResponse11");
//    public Clue DoubleClue12 = new Clue("Category3", 1200,
//            "answer12",
//            "correctResponse12");
//    public Clue DoubleClue13 = new Clue("Category3", 1600,
//            "answer13",
//            "correctResponse13");
//    public Clue DoubleClue14 = new Clue("Category3", 2000,
//            "answer14",
//            "correctResponse14");
//    public Clue DoubleClue15 = new Clue("Category4", 400,
//            "answer15",
//            "correctResponse15");
//    public Clue DoubleClue16 = new Clue("Category4", 800,
//            "answer16",
//            "correctResponse16");
//    public Clue DoubleClue17 = new Clue("Category4", 1200,
//            "answer17",
//            "correctResponse17");
//    public Clue DoubleClue18 = new Clue("Category4", 1600,
//            "answer18",
//            "correctResponse18");
//    public Clue DoubleClue19 = new Clue("Category4", 2000,
//            "answer19",
//            "correctResponse19");
//    public Clue DoubleClue20 = new Clue("Category5", 400,
//            "answer20",
//            "correctResponse20");
//    public Clue DoubleClue21 = new Clue("Category5", 800,
//            "answer21",
//            "correctResponse21");
//    public Clue DoubleClue22 = new Clue("Category5", 1200,
//            "answer22",
//            "correctResponse22");
//    public Clue DoubleClue23 = new Clue("Category5", 1600,
//            "answer23",
//            "correctResponse23");
//    public Clue DoubleClue24 = new Clue("Category5", 2000,
//            "answer24",
//            "correctResponse24");
//    public Clue DoubleClue25 = new Clue("Category6", 400,
//            "answer25",
//            "correctResponse25");
//    public Clue DoubleClue26 = new Clue("Category6", 800,
//            "answer26",
//            "correctResponse26");
//    public Clue DoubleClue27 = new Clue("Category6", 1200,
//            "answer27",
//            "correctResponse27");
//    public Clue DoubleClue28 = new Clue("Category6", 1600,
//            "answer28",
//            "correctResponse28");
//    public Clue DoubleClue29 = new Clue("Category6", 2000,
//            "answer29",
//            "correctResponse29");

    //Properties
    public List<Clue> cluesJeopardyRound = new ArrayList<>();
    protected List<String> categoriesJeopardyRound = new ArrayList<>();
    protected List<Clue> cluesDoubleJeopardyRound = new ArrayList<>();
    protected List<String> categoriesDoubleJeopardyRound = new ArrayList<>();

//    protected String finalJeopardyCategory = "FinalCategory";
//    protected String finalJeopardyAnswer = "FinalAnswer";
//    protected String finalJeopardyCorrectResponse = "correctResponseFinal";

    //Constructor
    public Game(){};

    //Getters and Setters
    public List<String> getCategoriesJeopardyRound() {
        return this.categoriesJeopardyRound;
    }

    public List<String> getCategoriesDoubleJeopardyRound() {
        return this.categoriesDoubleJeopardyRound;
    }

    public List<Clue> getCluesJeopardyRound() {
        return this.cluesJeopardyRound;
    }

    public List<Clue> getCluesDoubleJeopardyRound() {
        return this.cluesDoubleJeopardyRound;
    }

    public List<Player> getPlayers(){
        return this.players;
    }

    public abstract String getFinalJeopardyCorrectResponse();

    public abstract String getFinalJeopardyAnswer();

    public abstract String getFinalJeopardyCategory();


//    public String getFinalJeopardyCategory(){
//        return this.finalJeopardyCategory;
//    }
//
//    public String getFinalJeopardyAnswer(){
//        return this.finalJeopardyAnswer;
//    }
//
//    public String getFinalJeopardyCorrectResponse(){
//        return this.finalJeopardyCorrectResponse;
//    }



    //Prints Jeopardy Board to Screen

    // |-----------------------------------------------------------------------------------------------|
    // | (1) Category1 | (2) Category2 | (3) Category3 | (4) Category4 | (5) Category5 | (6) Category6 |
    // |---------------|---------------|---------------|---------------|---------------|---------------|
    // |           200 |           200 |           200 |           200 |           200 |           200 |
    // |---------------|---------------|---------------|---------------|---------------|---------------|
    // |           400 |           400 |           400 |           400 |           400 |           400 |
    // |---------------|---------------|---------------|---------------|---------------|---------------|
    // |           600 |           600 |           600 |           600 |           600 |           600 |
    // |---------------|---------------|---------------|---------------|---------------|---------------|
    // |           800 |           800 |           800 |           800 |           800 |           800 |
    // |---------------|---------------|---------------|---------------|---------------|---------------|
    // |          1000 |          1000 |          1000 |          1000 |          1000 |          1000 |
    // |-----------------------------------------------------------------------------------------------|

    public void showTheBoard(List<String> categories, List<Clue> clues, int basePointValue, int round) {


        int totalCharactersInCategoryNames = 0;
        for (String category: categories) {
            totalCharactersInCategoryNames += category.length();
        }

        //Print top line of dashes
        System.out.print("|");

        for (int i = 0; i < totalCharactersInCategoryNames + (7 * categories.size() -1); i++){
            System.out.print("-");
        }

        System.out.println("|");

        //Print Line of Categories
        System.out.print("|");
        for(int i = 0; i < categories.size(); i++){
            System.out.print(" (" + (i + 1) + ") " + categories.get(i) + " |");
        }
        System.out.print("\n");

        //Print division between categories and dollar amounts
        printHyphens(categories);

        //Print dollar amount lines with divisions in between

        printDollarAmountLine(1,categories,clues,basePointValue,round);
        printHyphens(categories);
        printDollarAmountLine(2,categories,clues,basePointValue,round);
        printHyphens(categories);
        printDollarAmountLine(3,categories,clues,basePointValue,round);
        printHyphens(categories);
        printDollarAmountLine(4,categories,clues,basePointValue,round);
        printHyphens(categories);
        printDollarAmountLine(5,categories,clues,basePointValue,round);

        //Print Bottom Line of dashes;
        System.out.print("|");

        for (int i = 0; i < totalCharactersInCategoryNames + (7 * categories.size() -1); i++){
            System.out.print("-");
        }

        System.out.println("|");

    }


    public void printDollarAmountLine(int line, List<String> categories, List<Clue> clues,int basePointValue,int round) {
        System.out.print("|");
        int dollarValue = basePointValue * line * round;

        //****ONLY WORKS IF DOLLAR VALUE IS BETWEEN 100 AND 9999****
        //Will work for normal Jeopardy! amounts
        int digitsInDollarValue;
        if (dollarValue > 999) {
            digitsInDollarValue = 4;
        }
        else {
            digitsInDollarValue = 3;
        }

        for(int i = 0; i < categories.size(); i++){

            int spacesToAdd =0;

            //Checks if clue has been answered yet. Prints blank space if it has. Prints dollar value if not.
            if(clues.get(5 * i + line -1).HasBeenSelected()){
                spacesToAdd = categories.get(i).length() + 6;
                for (int j = 0; j < spacesToAdd; j++){
                    System.out.print(" ");
                }
                System.out.print("|");
            }
            else{
                spacesToAdd = (categories.get(i).length() + 5) - digitsInDollarValue;
                for (int j = 0; j < spacesToAdd; j++){
                    System.out.print(" ");
                }
                System.out.print(dollarValue + " |");
            }
        }
        System.out.println();
    }


    //Print hyphens for formatting Jeopardy board
    public void printHyphens(List<String> categories){
        System.out.print("|");

        for(int i = 0; i < categories.size(); i++){
            for (int j = 0; j < categories.get(i).length() + 6; j++){
                System.out.print("-");
            }
            System.out.print("|");
        }
        System.out.println();

    }

    //Print scoreboard to screen
    public void showScoreBoard(List<Player> players){
        System.out.println("\n");
        for (int i = 0; i < players.size(); i++){
            System.out.print(players.get(i).getName() + ":  " + players.get(i).getScore() + "    ");
        }
        System.out.println();
    }


    public void adjustScores(List<Player> players){
        String playerToAdjust;
        Scanner scanner = new Scanner(System.in);
        do {


            System.out.println("\nWhose score needs to be adjusted?");

            System.out.print("Enter player name or type 'exit' to go back: ");

            playerToAdjust = scanner.nextLine();

            if (playerToAdjust.equalsIgnoreCase(players.get(0).getName()) || playerToAdjust.equalsIgnoreCase(players.get(1).getName()) || playerToAdjust.equalsIgnoreCase(players.get(2).getName()) || playerToAdjust.equalsIgnoreCase("exit")) {
                if (playerToAdjust.equalsIgnoreCase("exit")) {
                    return;
                }
            }
            else{
                continue;
            }

            break;

        }while(true);

        System.out.print("Enter an amount to add or a negative number to subtract from " + playerToAdjust + "'s score: ");
        int adjustmentAmount = Integer.parseInt(scanner.nextLine());


        int indexOfPlayerToAdjust = 0;

       if(playerToAdjust.equalsIgnoreCase(players.get(1).getName())) {
           indexOfPlayerToAdjust = 1;
       }
       else if(playerToAdjust.equalsIgnoreCase(players.get(2).getName())) {
           indexOfPlayerToAdjust = 2;
       }


       players.get(indexOfPlayerToAdjust).adjustScore(true, adjustmentAmount);


    }

    //Used to reset hasBuzzedIn buzzer after each question.
    public void reset(boolean[] switchToReset) {
        for (int i = 0; i < switchToReset.length; i++) {
            switchToReset[i] = false;
        }
    }



}
