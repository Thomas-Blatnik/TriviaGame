package com.games;


import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/* Description:  A command line version of a Jeopardy! game. Allows three players to "buzz in" and answer questions
from a variety of questions in two rounds (Jeopardy! and Double Jeopardy!) and then wager their points on a Final
Jeopardy! question.

Ideas for features to add:
-Display points gained in green or points lost in red after a player reponds to a question
-Display player's score in red if they are in the negative
-Use file I/O to record stats of who answered each question, what their response was, if the got it right or wrong,
how many points they gained or lost, how many correct and incorrect answers each player had for the game. Then allow the
option to read the file and display this report.
-Incorporate a user interface instead of being a command line program once more knowledgable with front end programming
-Find some way to incorporate input from an actual buzzer system
 */

public class Main {

    public static void main(String[] args) {

        Game game;
        Random rand = new Random();

        //Keeps track of who has control of board
        int playerInControl = 0;

        //Keeps track of what category and clue within category was chosen
        String categoryNumberSelectedString;
        int categoryNumberSelected;
        int placeInCategory;
        int questionNumber;
        String dollarValueSelectedString;
        int dollarValueSelected;
        int basePointValue = 200;  //Value of lowest dollar amount in Jeopardy round
        int round = 1;
        int clueIndex;
        int numberOfFirstClueInCategory;
        String playerWhoBuzzedInString;
        int playerWhoBuzzedIn;
        boolean[] hasBuzzedIn = {false, false, false};  //Keeps track of if each player has buzzed in yet. Will be reset to all false after each question.
        String response;
        int dailyDouble1 = 99;  //Number of daily dauble will be randomly set to number 0-29 in each round
        int dailyDouble2 = 99;  //Number of daily double will be randomly set to a different number 0-29 but only in the double jeopardy round
        int maxWager; //Max wager will be calculated based on round and player scores for daily doubles and final jeopardy
        String wagerString;
        int wager;
        boolean isValidNumber = true;
        List<Clue> clues;
        List<String> categories;


        //Audio FilePaths
        String thisIsJeopardySound = "JeopardySounds/jeopardy-intro-1.wav";
        String correctAnswerSound = "JeopardySounds/rightanswer.wav";
        String boardFillSound = "JeopardySounds/jeopardy-board-sms.wav";
        String timesUpSound = "JeopardySounds/times-up_AN8OlqZ.wav";
        String finalJeoparyMusicSound = "JeopardySounds/jeopardy-final-jeopardy-thinking-music.wav";
        String dailyDoubleSound = "JeopardySounds/jeopardy-daily-double-sound-effect-from-youtube_76mCCAq.wav";
        String incorrectAnswerSound = "JeopardySounds/Ooh-sorry-thats-not-right.wav";

        System.out.println("*******************************");
        System.out.println("****** THIS IS JEOPARDY! ******");
        System.out.println("*******************************");
        System.out.println();

        //Play intro music
        AudioPlayer.playSound(thisIsJeopardySound);

        Scanner scanner = new Scanner(System.in);

        //Select game(ie. what set of questions to use.
        //Game 0 is placeholder questions for testing.


        do {
            System.out.println("Which game would you like to play? (Currently available: 1-4)");
            System.out.print("Enter game number: ");
            String gameSelected = scanner.nextLine();

            if (gameSelected.equals("0")) {
                game = new Game0();
                break;
            }
            else if(gameSelected.equals("1")){
                game = new Game1();
                break;
            }
            else if(gameSelected.equals("2")){
                game = new Game2();
                break;
            }
            else if(gameSelected.equals("3")){
                game = new Game3();
                break;
            }
            else if(gameSelected.equals("4")){
                game = new Game4();
                break;
            }
            //Add more games here with else ifs when questions are written
            //and classes created.

            else {
                System.out.println("Game not available.");
                System.out.println();
            }
        } while(true);

        //Create array containing categories and clues for Jeopardy and Double Jeopardy rounds
        List<Clue> jeopardyRound = new ArrayList<>();
        for(Clue clue : game.getCluesJeopardyRound()){
            jeopardyRound.add(clue);
        }
        List<Clue> doubleJeopardyRound = new ArrayList<>();
        for(Clue clue : game.getCluesDoubleJeopardyRound()){
            doubleJeopardyRound.add(clue);
        }
        List<Clue>[] cluesByRound = new List[2];
        cluesByRound[0] = jeopardyRound;
        cluesByRound[1] = doubleJeopardyRound;


        List<String> jeopardyCategories = new ArrayList<>();
        for(String category : game.getCategoriesJeopardyRound()){
            jeopardyCategories.add(category);
        }
        List<String> doubleJeopardyCategories = new ArrayList<>();
        for(String category : game.getCategoriesDoubleJeopardyRound()){
            doubleJeopardyCategories.add(category);
        }
        List<String>[] categoriesByRound = new List[2];
        categoriesByRound[0] = jeopardyCategories;
        categoriesByRound[1] = doubleJeopardyCategories;


        //Instantiate players
        Player player1 = new Player("1");
        game.getPlayers().add(player1);
        Player player2 = new Player("2");
        game.getPlayers().add(player2);
        Player player3 = new Player("3");
        game.getPlayers().add(player3);

        //Get names of players from user
        System.out.println();
        System.out.print("Enter name for Player 1: ");
        String playerName = scanner.nextLine();
        game.getPlayers().get(0).setName(playerName);

        System.out.println();
        System.out.print("Enter name for Player 2: ");
        playerName = scanner.nextLine();
        game.getPlayers().get(1).setName(playerName);

        System.out.println();
        System.out.print("Enter name for Player 3: ");
        playerName = scanner.nextLine();
        game.getPlayers().get(2).setName(playerName);

        System.out.println();


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

        System.out.println();

        boolean hasCluesRemaining = false;

    for(round = 1; round <= 2; round++) {

        //Randomly select which clues are daily doubles(1 daily double for round 1, 2 daily doubles for round 2)

        dailyDouble1 = rand.nextInt(30);

        if(round == 2){
            do{
                dailyDouble2 = rand.nextInt(30);
            }while(dailyDouble1 == dailyDouble2);
        }

        //Give control of board to player in last place at start of double jeopardy round.
        if(round == 2) {

            playerInControl = 0;

            if (game.getPlayers().get(1).getScore() < game.getPlayers().get(0).getScore()) {
                playerInControl = 1;
            }

            if (game.getPlayers().get(2).getScore() < game.getPlayers().get(0).getScore() && game.getPlayers().get(2).getScore() < game.getPlayers().get(1).getScore()) {
                playerInControl = 2;
            }
            System.out.println();
            System.out.println("That concludes the Jeopardy round.");
            System.out.println();
            System.out.println(game.getPlayers().get(playerInControl).getName() + " will select first in Double Jeopardy.");
            System.out.println();
            scanner.nextLine();
        }

        AudioPlayer.playSound(boardFillSound);

        for (int cluesRemaining = 30; cluesRemaining > 0; cluesRemaining--) {

            //Select Category
            do {
                game.showScoreBoard(game.getPlayers());

                System.out.println();

                game.showTheBoard(categoriesByRound[round - 1], cluesByRound[round - 1], basePointValue, round);
                System.out.println();


                System.out.println(game.getPlayers().get(playerInControl).getName() + ", select a category.");
                System.out.print("Enter category number (or enter 7 to consult judges): ");
                categoryNumberSelectedString = scanner.nextLine();


                if (!(categoryNumberSelectedString.equals("1") || categoryNumberSelectedString.equals("2") || categoryNumberSelectedString.equals("3") || categoryNumberSelectedString.equals("4") || categoryNumberSelectedString.equals("5") || categoryNumberSelectedString.equals("6") || categoryNumberSelectedString.equals("7"))) {
                    System.out.println("Invalid selection. Please enter a category number 1-6 or 7 to consult judges.");
                    System.out.println();
                    continue;
                }
                categoryNumberSelected = Integer.parseInt(categoryNumberSelectedString);

                //If selected, allows manual adjustment of player scores.
                if (categoryNumberSelected == 7) {
                    game.adjustScores(game.getPlayers());
                    continue;
                }

                numberOfFirstClueInCategory = ((categoryNumberSelected - 1) * 5);

                //Check if there are any clues remaining in category and prompt player to choose
                //another category(go back to beginning of loop) if all clues have already
                //been selected.

                if (cluesByRound[round - 1].get(numberOfFirstClueInCategory).HasBeenSelected() &&
                        cluesByRound[round - 1].get(numberOfFirstClueInCategory + 1).HasBeenSelected() &&
                        cluesByRound[round - 1].get(numberOfFirstClueInCategory + 2).HasBeenSelected() &&
                        cluesByRound[round - 1].get(numberOfFirstClueInCategory + 3).HasBeenSelected() &&
                        cluesByRound[round - 1].get(numberOfFirstClueInCategory + 4).HasBeenSelected()) {

                    System.out.println("All clues in " + categoriesByRound[round - 1].get(categoryNumberSelected - 1) + " have already been selected.");
                    System.out.println("Choose another category.");
                    System.out.println();
                    continue;
                }

                break;
            } while (true);

            //Select Dollar amount
            do {

                do {
                    System.out.println(game.getPlayers().get(playerInControl).getName() + ", select a dollar amount in " + categoriesByRound[round - 1].get(categoryNumberSelected - 1) + ".");
                    System.out.print("Enter dollar amount: ");
                    dollarValueSelectedString = scanner.nextLine();

                    if (dollarValueSelectedString.equals("")) {
                        continue;
                    }

                    isValidNumber = true;

                    for (int i = 0; i < dollarValueSelectedString.length(); i++) {
                        if (dollarValueSelectedString.charAt(i) != '0' &&
                                dollarValueSelectedString.charAt(i) != '1' &&
                                dollarValueSelectedString.charAt(i) != '2' &&
                                dollarValueSelectedString.charAt(i) != '3' &&
                                dollarValueSelectedString.charAt(i) != '4' &&
                                dollarValueSelectedString.charAt(i) != '5' &&
                                dollarValueSelectedString.charAt(i) != '6' &&
                                dollarValueSelectedString.charAt(i) != '7' &&
                                dollarValueSelectedString.charAt(i) != '8' &&
                                dollarValueSelectedString.charAt(i) != '9') {

                            System.out.println("Must be a number.");
                            System.out.println();
                            isValidNumber = false;
                        }
                    }


                    }while(!isValidNumber);


                dollarValueSelected = Integer.parseInt(dollarValueSelectedString);

                //Check if dollar value entered is a valid choice.
                if (!(dollarValueSelected == basePointValue * round || dollarValueSelected == 2 * basePointValue * round || dollarValueSelected == 3 * basePointValue * round || dollarValueSelected == 4 * basePointValue * round || dollarValueSelected == 5 * basePointValue * round)) {
                    System.out.println("Invalid selection. Valid choices are: " + basePointValue * round + ", " + 2 * basePointValue * round + ", " + 3 * basePointValue * round + ", " + 4 * basePointValue * round + ", " + 5 * basePointValue * round);
                    continue;
                }

                //Calculates which clue 0-29 to select from list of clues based on user input
                clueIndex = ((dollarValueSelected / basePointValue) / round - 1) + ((categoryNumberSelected - 1) * 5);

                if (cluesByRound[round - 1].get(clueIndex).HasBeenSelected()) {
                    System.out.println(categoriesByRound[round - 1].get(categoryNumberSelected - 1) + " for " + dollarValueSelected + " has already been selected.");
                    continue;
                } else {
                    break;
                }
            } while (true);

            //Mark clue as selected
            cluesByRound[round - 1].get(clueIndex).selectClue();

            //Resets buzzer to allow to show no one has buzzed in yet for current question
            game.reset(hasBuzzedIn);


            //Check if clue is daily double and do daily double if it is
            if (clueIndex == dailyDouble1 || clueIndex == dailyDouble2) {
                System.out.println();
                System.out.println(categoriesByRound[round - 1].get(categoryNumberSelected - 1) + " for " + dollarValueSelected);
                System.out.println();
                System.out.println("****************************");
                System.out.println("*******DAILY DOUBLE*********");
                System.out.println("****************************");
                System.out.println();

                AudioPlayer.playSound(dailyDoubleSound);

                //Determine max wager for daily double.
                maxWager = basePointValue * round * 5;  //Sets maxWager to value of highest question in the round

                if (game.players.get(playerInControl).getScore() > maxWager) {
                    maxWager = game.players.get(playerInControl).getScore();        //Sets max wager to players score if they have more than value of highest question in the round
                }


                do {
                    System.out.println(game.getPlayers().get(playerInControl).getName() + ", you may wager up to " + maxWager);
                    System.out.print("Enter wager for " + game.getPlayers().get(playerInControl).getName() + ": ");
                    wagerString = scanner.nextLine();

                    if (wagerString.equals("")) {
                        continue;
                    }

                    isValidNumber = true;

                    for (int i = 0; i < wagerString.length(); i++) {
                        if (wagerString.charAt(i) != '0' &&
                                wagerString.charAt(i) != '1' &&
                                wagerString.charAt(i) != '2' &&
                                wagerString.charAt(i) != '3' &&
                                wagerString.charAt(i) != '4' &&
                                wagerString.charAt(i) != '5' &&
                                wagerString.charAt(i) != '6' &&
                                wagerString.charAt(i) != '7' &&
                                wagerString.charAt(i) != '8' &&
                                wagerString.charAt(i) != '9') {

                            System.out.println("Wager must be a number 0 to " + maxWager + ".");
                            System.out.println();
                            isValidNumber = false;
                        }
                    }

                    if(!isValidNumber){
                        continue;
                    }

                    wager = Integer.parseInt(wagerString);

                    if (wager > maxWager) {
                        System.out.println("Cannot wager more than " + maxWager + ".");
                        System.out.println();
                        continue;
                    }

                    break;
                } while (true);

                System.out.println();
                System.out.println(categoriesByRound[round - 1].get(categoryNumberSelected - 1));
                System.out.println();
                System.out.println(cluesByRound[round - 1].get(clueIndex).getAnswer());
                System.out.println();

                System.out.println("Enter response for " + game.getPlayers().get(playerInControl).getName() + ".");
                System.out.print("What is ");
                response = scanner.nextLine();

                if (response.equalsIgnoreCase(cluesByRound[round - 1].get(clueIndex).getCorrectResponse())) {
                    System.out.println();
                    System.out.println("Correct!");
                    System.out.println();
                    AudioPlayer.playSound(correctAnswerSound);
                    //Adds wager to player's score if correct
                    game.players.get(playerInControl).adjustScore(true, wager);
                } else {
                    System.out.println();
                    System.out.println("Sorry. What is " + response + "? is incorrect.");
                    System.out.println();
                    AudioPlayer.playSound(incorrectAnswerSound);

                    //Subtracts wager from player's score if incorrect
                    game.players.get(playerInControl).adjustScore(false, wager);
                }

                System.out.println();
                System.out.println("Correct Response:");
                System.out.println("What is " + cluesByRound[round -1].get(clueIndex).getCorrectResponse());

            } else {

                //Show clue, let players buzz in, check answers, and adjust scores as necessary
                do {
                    System.out.println();
                    System.out.println(categoriesByRound[round - 1].get(categoryNumberSelected - 1) + " for " + dollarValueSelected);
                    System.out.println();

                    System.out.println(cluesByRound[round - 1].get(clueIndex).getAnswer());
                    System.out.println();


                    System.out.println("Who buzzed in?");
                    System.out.println("(1)" + player1.getName());
                    System.out.println("(2)" + player2.getName());
                    System.out.println("(3)" + player3.getName());
                    System.out.println("(4)Time's up");
                    System.out.println();
                    System.out.print("Enter selection: ");
                    playerWhoBuzzedInString = scanner.nextLine();


                    if (!(playerWhoBuzzedInString.equals("1") || playerWhoBuzzedInString.equals("2") || playerWhoBuzzedInString.equals("3") || playerWhoBuzzedInString.equals("4"))) {
                        System.out.println("Invalid selection. Must enter 1, 2, 3, or 4.");
                        System.out.println();
                        continue;
                    }

                    playerWhoBuzzedIn = Integer.parseInt(playerWhoBuzzedInString) - 1;

                    //Display answer if no one else wants to buzz in.
                    if (playerWhoBuzzedIn == 3) {

                        AudioPlayer.playSound(timesUpSound);

                        System.out.println();
                        break;
                    }

                    if (hasBuzzedIn[playerWhoBuzzedIn]) {
                        System.out.println();
                        System.out.println(game.getPlayers().get(playerWhoBuzzedIn).getName() + " has already buzzed in.");
                        continue;
                    }

                    //Update buzzer to show player has buzzed in.
                    hasBuzzedIn[playerWhoBuzzedIn] = true;

                    System.out.println();
                    System.out.println("Enter reponse for " + game.getPlayers().get(playerWhoBuzzedIn).getName() + ".");
                    System.out.print("What is ");
                    response = scanner.nextLine();
                    System.out.println();

                    //Check response for correctness

                    if (response.equalsIgnoreCase(cluesByRound[round - 1].get(clueIndex).getCorrectResponse())) {
                        System.out.println();
                        System.out.println("Correct!");
                        System.out.println();

                        AudioPlayer.playSound(correctAnswerSound);

                        //Add points to score for correct answer
                        game.getPlayers().get(playerWhoBuzzedIn).adjustScore(true, dollarValueSelected);

                        //Give player who gave correct response control of the board
                        playerInControl = playerWhoBuzzedIn;

                        break;
                    } else {
                        System.out.println();
                        System.out.println("Sorry. What is " + response + "? is incorrect.");
                        System.out.println();
                        AudioPlayer.playSound(incorrectAnswerSound);
                        //Subtract points from score for incorrect answer.
                        game.getPlayers().get(playerWhoBuzzedIn).adjustScore(false, dollarValueSelected);
                    }

                    System.out.println();
                    game.showScoreBoard(game.getPlayers());
                    System.out.println();

                } while (!hasBuzzedIn[0] || !hasBuzzedIn[1] || !hasBuzzedIn[2]);  //Keeps looping until someone breaks loop with a correct answer or all players have buzzed in
                System.out.println("Correct response:");
                System.out.println("What is " + cluesByRound[round-1].get(clueIndex).getCorrectResponse());
                System.out.println();
            }
        }
    }



    //Final Jeopardy

        //Determine eligibility for final jeopardy.
        for(Player player : game.getPlayers()){
            if(player.getScore() > 0){
                player.makeEligibleForFinalJeopardy();
            }
            else{
                System.out.println();
                System.out.println(player.getName() + " does not have any money and will not be joining us for Final Jeopardy.");
                System.out.println();
            }
        }

        int[] finalJeopardyWagers = new int[]{0, 0, 0};

        System.out.println();
        System.out.println("The category for Final Jeopardy is " + game.getFinalJeopardyCategory());
        System.out.println();
        game.showScoreBoard(game.getPlayers());
        System.out.println();

        //Get wagers
        for(int i = 0; i < game.getPlayers().size(); i++){
            maxWager = game.players.get(i).getScore();

            //Only ask for wager if player is elibible for final jeopardy
            if(game.getPlayers().get(i).isEligibleForFinalJeopardy()) {

                do {
                    System.out.println(game.getPlayers().get(i).getName() + ", you may wager up to " + maxWager);
                    System.out.print("Enter wager for " + game.getPlayers().get(i).getName() + ": ");
                    wagerString = scanner.nextLine();

                    if (wagerString.equals("")) {
                        continue;
                    }

                    isValidNumber = true;

                    for (int j = 0; j < wagerString.length(); j++) {
                        if (wagerString.charAt(j) < '0' || wagerString.charAt(j) > '9') {

                            System.out.println("Wager must be a number 0 to " + maxWager + ".");
                            System.out.println();
                            isValidNumber = false;
                        }
                    }

                    if(!isValidNumber){
                        continue;
                    }

                    wager = Integer.parseInt(wagerString);

                    finalJeopardyWagers[i] = wager;

                    if (wager > game.players.get(i).getScore()) {
                        System.out.println("Cannot wager more than " + maxWager + ".");
                        System.out.println();
                        continue;
                    }

                    //Add wager to array of wagers
                    finalJeopardyWagers[i] = wager;

                    break;
                } while (true);
            }
        }

        System.out.println();
        System.out.println(game.getFinalJeopardyCategory());
        System.out.println();
        System.out.println(game.getFinalJeopardyAnswer());
        System.out.println();
        scanner.nextLine();
        AudioPlayer.playSound(finalJeoparyMusicSound);

        for(int i = 0; i < game.getPlayers().size(); i++) {
            if (game.getPlayers().get(i).isEligibleForFinalJeopardy()) {
                //Get response for player
                System.out.println("Enter response for " + game.getPlayers().get(i).getName() + ":");
                System.out.print("What is ");
                response = scanner.nextLine();
                System.out.println();
                //Check if correct
                if (response.equalsIgnoreCase(game.getFinalJeopardyCorrectResponse())) {
                    System.out.println("Correct!");
                    System.out.println(game.getPlayers().get(i).getName() + " wagered " + finalJeopardyWagers[i]);
                    System.out.println();
//                    AudioPlayer.playSound(correctAnswerSound);

                    game.getPlayers().get(i).adjustScore(true, finalJeopardyWagers[i]);
                    System.out.println("+" + finalJeopardyWagers[i]);
                } else {
                    System.out.println("Sorry. What is " + response + "? is incorrect.");
                    System.out.println();
//                    AudioPlayer.playSound(incorrectAnswerSound);

                    game.getPlayers().get(i).adjustScore(false, finalJeopardyWagers[i]);
                    System.out.println(game.getPlayers().get(i).getName() + " wagered " + finalJeopardyWagers[i]);
                    System.out.println("-" + finalJeopardyWagers[i]);
                }

                System.out.println(game.getPlayers().get(i).getName() + ": " + game.getPlayers().get(i).getScore());
                System.out.println();
            }
        }

            scanner.nextLine();
            System.out.println();
            System.out.println("Correct response:");
            System.out.println();
            System.out.println(game.getFinalJeopardyCorrectResponse());
            System.out.println();
            System.out.println("Final Scores:");
            game.showScoreBoard(game.getPlayers());
            System.out.println();
            System.out.println();


        scanner.close();
    }
}
