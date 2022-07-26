package Jeopardy.Game.Jeopardy.Game.Model;

import Jeopardy.Game.Jeopardy.Game.Player;
import Jeopardy.Game.Jeopardy.Game.services.ClueService;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {

    private Clue[] jeopardy;
    @JsonProperty("double jeopardy")
    private Clue[] doubleJeopardy;
    @JsonProperty("final jeopardy")
    private Clue finalJeopardy;

    public Clue[] getJeopardy(){
        return jeopardy;
    }

    public Clue[] getDoubleJeopardy(){
        return doubleJeopardy;
    }
    public Clue getFinalJeopardy(){
        return finalJeopardy;
    }

    private List<String> categoriesJeopardyRound;
    private List<String> categoriesDoubleJeopardyRound;
    private List<Clue> cluesJeopardyRound;
    private List<Clue> cluesDoubleJeopardyRound;
    private List<Player> players = new ArrayList<>();


    //Constructor
    public Game(){};

    public void setClues(){
        this.categoriesJeopardyRound = getCategories(jeopardy);
        this.categoriesDoubleJeopardyRound = getCategories(doubleJeopardy);
        this.cluesJeopardyRound = sortClues(jeopardy, 1);
        this.cluesDoubleJeopardyRound = sortClues(doubleJeopardy,2);
    }



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

    //Sorts clues from JSON into the correct order

    public List<String> getCategories(Clue[] clues){
        List<String> jeopardyCategories = new ArrayList<>();

        for (Clue clue : clues) {
            if (!jeopardyCategories.contains(clue.getCategory())) {
                jeopardyCategories.add(clue.getCategory());
            }
        }

        return jeopardyCategories;
    }

    public List<Clue> sortClues(Clue[] clues, int round) {
        List<Clue> jeopardyCluesSorted = new ArrayList<>();
        List<String> jeopardyCategories = new ArrayList<>();

        for (Clue clue : clues) {
            if (!jeopardyCategories.contains(clue.getCategory())) {
                jeopardyCategories.add(clue.getCategory());
            }
        }

        for (int i = 0; i < jeopardyCategories.size(); i++) {

            List<Clue> jeopardyCategory = new ArrayList<>();

            for (Clue clue : clues) {
                if (clue.getCategory().equals(jeopardyCategories.get(i))) {
                    jeopardyCategory.add(clue);
                }
            }


            Clue[] jeopardyCategorysorted = new Clue[5];

            if (round == 1) {
                for (Clue clue : jeopardyCategory) {
                    if (clue.getValue().equals("200")) {
                        jeopardyCategorysorted[0] = clue;
                    } else if (clue.getValue().equals("400")) {
                        jeopardyCategorysorted[1] = clue;
                    } else if (clue.getValue().equals("600")) {
                        jeopardyCategorysorted[2] = clue;
                    } else if (clue.getValue().equals("800")) {
                        jeopardyCategorysorted[3] = clue;
                    } else if (clue.getValue().equals("1000")) {
                        jeopardyCategorysorted[4] = clue;
                    }
                }
            } else if (round == 2) {
                for (Clue clue : jeopardyCategory) {
                    if (clue.getValue().equals("400")) {
                        jeopardyCategorysorted[0] = clue;
                    } else if (clue.getValue().equals("800")) {
                        jeopardyCategorysorted[1] = clue;
                    } else if (clue.getValue().equals("1200")) {
                        jeopardyCategorysorted[2] = clue;
                    } else if (clue.getValue().equals("1600")) {
                        jeopardyCategorysorted[3] = clue;
                    } else if (clue.getValue().equals("2000")) {
                        jeopardyCategorysorted[4] = clue;
                    }
                }
            }


            for (Clue clue : jeopardyCategory) {
                if (clue.getValue().equals("Daily Double")) {
                    for (int j = 0; j < jeopardyCategorysorted.length; j++) {
                        if (jeopardyCategorysorted[j] == null) {
                            jeopardyCategorysorted[j] = clue;
                            break;
                        }
                    }
                }
            }

            for (Clue clue : jeopardyCategorysorted) {
                jeopardyCluesSorted.add(clue);
            }
        }

        return jeopardyCluesSorted;
    }























}
