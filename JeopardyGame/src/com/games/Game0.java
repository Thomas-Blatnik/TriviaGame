package com.games;

import jdk.internal.jimage.ImageStrings;

import java.util.ArrayList;
import java.util.List;

public class Game0 extends Game {

    protected final String JEOPARDY_CATEGORY_1 = "Category1";
    protected final String JEOPARDY_CATEGORY_2 = "Category2";
    protected final String JEOPARDY_CATEGORY_3 = "Category3";
    protected final String JEOPARDY_CATEGORY_4 = "Category4";
    protected final String JEOPARDY_CATEGORY_5 = "Category5";
    protected final String JEOPARDY_CATEGORY_6 = "Category6";
    protected final String DOUBLE_JEOPARDY_CATEGORY_1 = "Category1";
    protected final String DOUBLE_JEOPARDY_CATEGORY_2 = "Category2";
    protected final String DOUBLE_JEOPARDY_CATEGORY_3 = "Category3";
    protected final String DOUBLE_JEOPARDY_CATEGORY_4 = "Category4";
    protected final String DOUBLE_JEOPARDY_CATEGORY_5 = "Category5";
    protected final String DOUBLE_JEOPARDY_CATEGORY_6 = "Category6";


    public Clue Clue0 = new Clue("Category1", 200,
            "answer0",
            "correctResponse0");
    public Clue Clue1 = new Clue("Category1", 400,
            "answer1",
            "correctResponse1");
    public Clue Clue2 = new Clue("Category1", 600,
            "answer2",
            "correctResponse2");
    public Clue Clue3 = new Clue("Category3", 800,
            "answer3",
            "correctResponse3");
    public Clue Clue4 = new Clue("Category4", 1000,
            "answer4",
            "correctResponse4");
    public Clue Clue5 = new Clue("Category2", 200,
            "answer5",
            "correctResponse5");
    public Clue Clue6 = new Clue("Category2", 400,
            "answer6",
            "correctResponse6");
    public Clue Clue7 = new Clue("Category2", 600,
            "answer7",
            "correctResponse7");
    public Clue Clue8 = new Clue("Category2", 800,
            "answer8",
            "correctResponse8");
    public Clue Clue9 = new Clue("Category2", 1000,
            "answer9",
            "correctResponse9");
    public Clue Clue10 = new Clue("Category3", 200,
            "answer10",
            "correctResponse10");
    public Clue Clue11 = new Clue("Category3", 400,
            "answer11",
            "correctResponse11");
    public Clue Clue12 = new Clue("Category3", 600,
            "answer12",
            "correctResponse12");
    public Clue Clue13 = new Clue("Category3", 800,
            "answer13",
            "correctResponse13");
    public Clue Clue14 = new Clue("Category3", 1000,
            "answer14",
            "correctResponse14");
    public Clue Clue15 = new Clue("Category4", 200,
            "answer15",
            "correctResponse15");
    public Clue Clue16 = new Clue("Category4", 400,
            "answer16",
            "correctResponse16");
    public Clue Clue17 = new Clue("Category4", 600,
            "answer17",
            "correctResponse17");
    public Clue Clue18 = new Clue("Category4", 800,
            "answer18",
            "correctResponse18");
    public Clue Clue19 = new Clue("Category4", 1000,
            "answer19",
            "correctResponse19");
    public Clue Clue20 = new Clue("Category5", 200,
            "answer20",
            "correctResponse20");
    public Clue Clue21 = new Clue("Category5", 400,
            "answer21",
            "correctResponse21");
    public Clue Clue22 = new Clue("Category5", 600,
            "answer22",
            "correctResponse22");
    public Clue Clue23 = new Clue("Category5", 800,
            "answer23",
            "correctResponse23");
    public Clue Clue24 = new Clue("Category5", 1000,
            "answer24",
            "correctResponse24");
    public Clue Clue25 = new Clue("Category6", 200,
            "answer25",
            "correctResponse25");
    public Clue Clue26 = new Clue("Category6", 400,
            "answer26",
            "correctResponse26");
    public Clue Clue27 = new Clue("Category6", 600,
            "answer27",
            "correctResponse27");
    public Clue Clue28 = new Clue("Category6", 800,
            "answer28",
            "correctResponse28");
    public Clue Clue29 = new Clue("Category6", 1000,
            "answer29",
            "correctResponse29");


    public Clue DoubleClue0 = new Clue("Category1", 400,
            "answer0",
            "correctResponse0");
    public Clue DoubleClue1 = new Clue("Category1", 800,
            "answer1",
            "correctResponse1");
    public Clue DoubleClue2 = new Clue("Category1", 1200,
            "answer2",
            "correctResponse2");
    public Clue DoubleClue3 = new Clue("Category3", 1600,
            "answer3",
            "correctResponse3");
    public Clue DoubleClue4 = new Clue("Category4", 2000,
            "answer4",
            "correctResponse4");
    public Clue DoubleClue5 = new Clue("Category2", 400,
            "answer5",
            "correctResponse5");
    public Clue DoubleClue6 = new Clue("Category2", 800,
            "answer6",
            "correctResponse6");
    public Clue DoubleClue7 = new Clue("Category2", 1200,
            "answer7",
            "correctResponse7");
    public Clue DoubleClue8 = new Clue("Category2", 1600,
            "answer8",
            "correctResponse8");
    public Clue DoubleClue9 = new Clue("Category2", 2000,
            "answer9",
            "correctResponse9");
    public Clue DoubleClue10 = new Clue("Category3", 400,
            "answer10",
            "correctResponse10");
    public Clue DoubleClue11 = new Clue("Category3", 800,
            "answer11",
            "correctResponse11");
    public Clue DoubleClue12 = new Clue("Category3", 1200,
            "answer12",
            "correctResponse12");
    public Clue DoubleClue13 = new Clue("Category3", 1600,
            "answer13",
            "correctResponse13");
    public Clue DoubleClue14 = new Clue("Category3", 2000,
            "answer14",
            "correctResponse14");
    public Clue DoubleClue15 = new Clue("Category4", 400,
            "answer15",
            "correctResponse15");
    public Clue DoubleClue16 = new Clue("Category4", 800,
            "answer16",
            "correctResponse16");
    public Clue DoubleClue17 = new Clue("Category4", 1200,
            "answer17",
            "correctResponse17");
    public Clue DoubleClue18 = new Clue("Category4", 1600,
            "answer18",
            "correctResponse18");
    public Clue DoubleClue19 = new Clue("Category4", 2000,
            "answer19",
            "correctResponse19");
    public Clue DoubleClue20 = new Clue("Category5", 400,
            "answer20",
            "correctResponse20");
    public Clue DoubleClue21 = new Clue("Category5", 800,
            "answer21",
            "correctResponse21");
    public Clue DoubleClue22 = new Clue("Category5", 1200,
            "answer22",
            "correctResponse22");
    public Clue DoubleClue23 = new Clue("Category5", 1600,
            "answer23",
            "correctResponse23");
    public Clue DoubleClue24 = new Clue("Category5", 2000,
            "answer24",
            "correctResponse24");
    public Clue DoubleClue25 = new Clue("Category6", 400,
            "answer25",
            "correctResponse25");
    public Clue DoubleClue26 = new Clue("Category6", 800,
            "answer26",
            "correctResponse26");
    public Clue DoubleClue27 = new Clue("Category6", 1200,
            "answer27",
            "correctResponse27");
    public Clue DoubleClue28 = new Clue("Category6", 1600,
            "answer28",
            "correctResponse28");
    public Clue DoubleClue29 = new Clue("Category6", 2000,
            "answer29",
            "correctResponse29");


    protected String finalJeopardyCategory = "FinalCategory";
    protected String finalJeopardyAnswer = "FinalAnswer";
    protected String finalJeopardyCorrectResponse = "correctResponseFinal";

    //Constructors
    public Game0(){
        super();
        //Populate list of categories for Jeopardy round
        categoriesJeopardyRound.add(JEOPARDY_CATEGORY_1);
        categoriesJeopardyRound.add(JEOPARDY_CATEGORY_2);
        categoriesJeopardyRound.add(JEOPARDY_CATEGORY_3);
        categoriesJeopardyRound.add(JEOPARDY_CATEGORY_4);
        categoriesJeopardyRound.add(JEOPARDY_CATEGORY_5);
        categoriesJeopardyRound.add(JEOPARDY_CATEGORY_6);

        //Populate list of categories for Double Jeopardy round
        categoriesDoubleJeopardyRound.add(DOUBLE_JEOPARDY_CATEGORY_1);
        categoriesDoubleJeopardyRound.add(DOUBLE_JEOPARDY_CATEGORY_2);
        categoriesDoubleJeopardyRound.add(DOUBLE_JEOPARDY_CATEGORY_3);
        categoriesDoubleJeopardyRound.add(DOUBLE_JEOPARDY_CATEGORY_4);
        categoriesDoubleJeopardyRound.add(DOUBLE_JEOPARDY_CATEGORY_5);
        categoriesDoubleJeopardyRound.add(DOUBLE_JEOPARDY_CATEGORY_6);

        //Populate list of clues for Jeopardy Round
        cluesJeopardyRound.add(Clue0);
        cluesJeopardyRound.add(Clue1);
        cluesJeopardyRound.add(Clue2);
        cluesJeopardyRound.add(Clue3);
        cluesJeopardyRound.add(Clue4);
        cluesJeopardyRound.add(Clue5);
        cluesJeopardyRound.add(Clue6);
        cluesJeopardyRound.add(Clue7);
        cluesJeopardyRound.add(Clue8);
        cluesJeopardyRound.add(Clue9);
        cluesJeopardyRound.add(Clue10);
        cluesJeopardyRound.add(Clue11);
        cluesJeopardyRound.add(Clue12);
        cluesJeopardyRound.add(Clue13);
        cluesJeopardyRound.add(Clue14);
        cluesJeopardyRound.add(Clue15);
        cluesJeopardyRound.add(Clue16);
        cluesJeopardyRound.add(Clue17);
        cluesJeopardyRound.add(Clue18);
        cluesJeopardyRound.add(Clue19);
        cluesJeopardyRound.add(Clue20);
        cluesJeopardyRound.add(Clue21);
        cluesJeopardyRound.add(Clue22);
        cluesJeopardyRound.add(Clue23);
        cluesJeopardyRound.add(Clue24);
        cluesJeopardyRound.add(Clue25);
        cluesJeopardyRound.add(Clue26);
        cluesJeopardyRound.add(Clue27);
        cluesJeopardyRound.add(Clue28);
        cluesJeopardyRound.add(Clue29);

        //Populate list of clues for Double Jeopardy Round
        cluesDoubleJeopardyRound.add(DoubleClue0);
        cluesDoubleJeopardyRound.add(DoubleClue1);
        cluesDoubleJeopardyRound.add(DoubleClue2);
        cluesDoubleJeopardyRound.add(DoubleClue3);
        cluesDoubleJeopardyRound.add(DoubleClue4);
        cluesDoubleJeopardyRound.add(DoubleClue5);
        cluesDoubleJeopardyRound.add(DoubleClue6);
        cluesDoubleJeopardyRound.add(DoubleClue7);
        cluesDoubleJeopardyRound.add(DoubleClue8);
        cluesDoubleJeopardyRound.add(DoubleClue9);
        cluesDoubleJeopardyRound.add(DoubleClue10);
        cluesDoubleJeopardyRound.add(DoubleClue11);
        cluesDoubleJeopardyRound.add(DoubleClue12);
        cluesDoubleJeopardyRound.add(DoubleClue13);
        cluesDoubleJeopardyRound.add(DoubleClue14);
        cluesDoubleJeopardyRound.add(DoubleClue15);
        cluesDoubleJeopardyRound.add(DoubleClue16);
        cluesDoubleJeopardyRound.add(DoubleClue17);
        cluesDoubleJeopardyRound.add(DoubleClue18);
        cluesDoubleJeopardyRound.add(DoubleClue19);
        cluesDoubleJeopardyRound.add(DoubleClue20);
        cluesDoubleJeopardyRound.add(DoubleClue21);
        cluesDoubleJeopardyRound.add(DoubleClue22);
        cluesDoubleJeopardyRound.add(DoubleClue23);
        cluesDoubleJeopardyRound.add(DoubleClue24);
        cluesDoubleJeopardyRound.add(DoubleClue25);
        cluesDoubleJeopardyRound.add(DoubleClue26);
        cluesDoubleJeopardyRound.add(DoubleClue27);
        cluesDoubleJeopardyRound.add(DoubleClue28);
        cluesDoubleJeopardyRound.add(DoubleClue29);

    }


    public String getFinalJeopardyCategory(){
        return this.finalJeopardyCategory;
    }

    public String getFinalJeopardyAnswer(){
        return this.finalJeopardyAnswer;
    }

    public String getFinalJeopardyCorrectResponse(){
        return this.finalJeopardyCorrectResponse;
    }
    //Methods




}
