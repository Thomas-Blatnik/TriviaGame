package com.games;

public class Game2 extends Game{

    protected final String JEOPARDY_CATEGORY_1 = "COMPUTER";
    protected final String JEOPARDY_CATEGORY_2 = "PROGRAMMING";
    protected final String JEOPARDY_CATEGORY_3 = "EXCEPTIONS";
    protected final String JEOPARDY_CATEGORY_4 = "BLOOD";
    protected final String JEOPARDY_CATEGORY_5 = "SWEAT";
    protected final String JEOPARDY_CATEGORY_6 = "AND 'TEER'S";
    protected final String DOUBLE_JEOPARDY_CATEGORY_1 = "LITERARY RODENTS";
    protected final String DOUBLE_JEOPARDY_CATEGORY_2 = "LATIN MUSIC";
    protected final String DOUBLE_JEOPARDY_CATEGORY_3 = "NORSE MYTHOLOGY";
    protected final String DOUBLE_JEOPARDY_CATEGORY_4 = "AVIAN NAMES";
    protected final String DOUBLE_JEOPARDY_CATEGORY_5 = "MOVIE QUOTES";
    protected final String DOUBLE_JEOPARDY_CATEGORY_6 = "HARRY POTTER";

    public Clue Clue0 = new Clue("COMPUTER", 200,
            "CPU STANDS FOR THIS",
            "CENTRAL PROCESSING UNIT");
    public Clue Clue1 = new Clue("COMPUTER", 400,
            "THE NUMBER OF BITS IN A BYTE",
            "8");
    public Clue Clue2 = new Clue("COMPUTER", 600,
            "101 IN BINARY IS THIS NUMBER IN DECIMAL",
            "5");
    public Clue Clue3 = new Clue("COMPUTER", 800,
            "LISBETH SALANDER IS A SKILLED COMPUTER HACKER IN A \nSTIEG LARSSON NOVEL CALLED 'THE GIRL WITH' THIS",
            "THE DRAGON TATTOO");
    public Clue Clue4 = new Clue("COMPUTER", 1000,
            "1969 MOVIE IN WHICH KURT RUSSELL BECOMES\nA HUMAN COMPUTER",
            "THE COMPUTER WORE TENNIS SHOES");
    public Clue Clue5 = new Clue("PROGRAMMING", 200,
            "NUMBER THAT REFERS TO AN ELEMENT'S PLACE IN AN ARRAY",
            "INDEX");
    public Clue Clue6 = new Clue("PROGRAMMING", 400,
            "TYPE OF COLLECTION THAT IS FIRST-IN FIRST-OUT",
            "QUEUE");
    public Clue Clue7 = new Clue("PROGRAMMING", 600,
            "PRINCIPLE OF OBJECT ORIENTED PROGRAMMING THAT\nALLOWS ONE CLASS TO ADOPT PROPERTIES AND BEHAVIORS\nOF ANOTHER CLASS",
            "INHERITANCE");
    public Clue Clue8 = new Clue("PROGRAMMING", 800,
            "PRINCIPLE OF OBJECT ORIENTED PROGRAMMING THAT\nALLOWS SOMETHING TO BE ASSIGNED A DIFFERENT MEANING\nOR USAGE BASED ON ITS CONTEXT",
            "POLYMORPHISM");
    public Clue Clue9 = new Clue("PROGRAMMING", 1000,
            "PRINCIPLE OF OBJECT ORIENTED PROGRAMMING THAT REFERS TO\nTHE BUNDLING OF DATA AND BEHAVIORS INTO INDIVIDUAL\nUNITS",
            "ENCAPSULATION");
    public Clue Clue10 = new Clue("EXCEPTIONS", 200,
            "A COMMON RULE OF THUMB IN SPELLING IS 'I' BEFORE 'E'\nEXCEPT AFTER THIS LETTER",
            "C");
    public Clue Clue11 = new Clue("EXCEPTIONS", 400,
            "ALL OF THE DWARVES IN SNOW WHITE AND THE SEVEN\nDWARVES HAD BEARDS EXCEPT FOR HIM",
            "DOPEY");
    public Clue Clue12 = new Clue("EXCEPTIONS", 600,
            "THE DUCK-BILLED THIS IS ONE OF THE FEW MAMMALS\nTHAT LAYS EGGS INSTEAD OF GIVING BIRTH TO\nLIVE YOUNG",
            "PLATYPUS");
    public Clue Clue13 = new Clue("EXCEPTIONS", 800,
            "HE WAS THE ONLY PERSON TO SERVE AS U.S. PRESIDENT WITHOUT\nEVER BEING ELECTED AS PRESIDENT OR VICE PRESIDENT",
            "GERALD FORD");
    public Clue Clue14 = new Clue("EXCEPTIONS", 1000,
            "MOST ELEMENTS ON THE PERIODIC TABLE ARE GASES OR\nSOLIDS AT ROOM TEMPERATURE EXCEPT FOR THE TWO\nTHAT ARE LIQUIDS: BROMINE AND THIS ELEMENT,\nATOMIC SYMBOL HG",
            "MERCURY");
    public Clue Clue15 = new Clue("BLOOD", 200,
            "LEUKOCYTES, WHICH HELP THE BODY FIGHT INFECTION,\nARE ALSO KNOWN AS THIS COLOR BLOOD CELLS",
            "WHITE");
    public Clue Clue16 = new Clue("BLOOD", 400,
            "ALSO KNOWN AS THROMBOCYTES, THESE CELL FRAGMENTS\nHELP THE BLOOD FORM CLOTS AND STOP BLEEDING IN\nRESPONSE TO A WOUND",
            "PLATELETS");
    public Clue Clue17 = new Clue("BLOOD", 600,
            "ALSO KNOWN AS COUMADIN, THIS BLOOD THINNER\nIS SIMILAR TO RAT POISON",
            "WARFARIN");
    public Clue Clue18 = new Clue("BLOOD", 800,
            "THIS BLOOD TYPE IS THE UNIVERSAL DONOR",
            "O NEGATIVE");
    public Clue Clue19 = new Clue("BLOOD", 1000,
            "THE NEGATIVE OR POSITIVE IN A BLOOD TYPE REFERS\nTO THIS TWO LETTER FACTOR",
            "RH");
    public Clue Clue20 = new Clue("SWEAT", 200,
            "YOU'RE LIKELY TO BREAK A SWEAT DURING THE 26.2 MILES\nOF ONE OF THESE RACES",
            "MARATHON");
    public Clue Clue21 = new Clue("SWEAT", 400,
            "TONY STARK COULD TELL YOU THAT THIS TRIATHLON\nCONSISTS OF A 2.4 MILE SWIM, 112 MILE BIKE AND 26.2 MILE RUN",
            "IRONMAN");
    public Clue Clue22 = new Clue("SWEAT", 600,
            "SYNONYM FOR CRAZINESS THAT IS THE NAME OF A\nSEAN T FITNESS PROGRAM",
            "INSANITY");
    public Clue Clue23 = new Clue("SWEAT", 800,
            "ARCTIC ENEMA, EVEREST AND ELECTROSHOCK THERAPY\nARE NAMES OF OBSTACLES IN THIS MUD RUN",
            "TOUGH MUDDER");
    public Clue Clue24 = new Clue("SWEAT", 1000,
            "FITNESS PERSONALITY WHO HAD A LINE OF AEROBIC VIDEOS\nCALLED \"SWEATIN' TO THE THE OLDIES\"",
            "RICHARD SIMMONS");
    public Clue Clue25 = new Clue("AND 'TEER'S", 200,
            "TO CONTROL THE MOVEMENT OF A VEHICLE",
            "STEER");
    public Clue Clue26 = new Clue("AND 'TEER'S", 400,
            "ONE WHO FREELY OFFERS TO TAKE PART IN AN ENTERPRISE OR TASK",
            "VOLUNTEER");
    public Clue Clue27 = new Clue("AND 'TEER'S", 600,
            "ONE WHO TAKES ADVANTAGE OF A SITUATION FOR MONETARY\nGAIN",
            "PROFITEER");
    public Clue Clue28 = new Clue("AND 'TEER'S", 800,
            "JIM HENSON, SHARI LEWIS AND JEFF DUNHAM",
            "PUPPETEERS");
    public Clue Clue29 = new Clue("AND 'TEER'S", 1000,
            "D'ARTAGNAN MEETS THREE OF THEM IN AN ALEXANDRE DUMAS\nNOVEL",
            "MUSKETEERS");


    public Clue DoubleClue0 = new Clue("LITERARY RODENTS", 400,
            "TEMPLETON IS A RAT THAT RUNS ERRANDS FOR THE\nTITULAR SPIDER IN THIS CHILDREN'S BOOK",
            "CHARLOTTE'S WEB");
    public Clue DoubleClue1 = new Clue("LITERARY RODENTS", 800,
            "STEINBECK NOVELLA IN WHICH GEORGE AND LENNY\nLOOK FOR WORK ON A FARM",
            "OF MICE AND MEN");
    public Clue DoubleClue2 = new Clue("LITERARY RODENTS", 1200,
            "THE MAIN CHARACTER GETS TURNED INTO A MOUSE AFTER\nINTRUDING ON A CONVENTION OF THE TITLE VILLAINS IN THIS\nROALD DAHL BOOK",
            "THE WITCHES");
    public Clue DoubleClue3 = new Clue("LITERARY RODENTS", 1600,
            "A COLONY OF RABBITS LOOKS FOR A NEW HOME IN THIS\nRICHARD ADAMS NOVEL",
            "WATERSHIP DOWN");
    public Clue DoubleClue4 = new Clue("LITERARY RODENTS", 2000,
            "A BRIAN JACQUES CHILDREN'S SERIES CHRONICLES THE ADVENTURES\nOF THE VARIOUS WOODLAND CRITTERS THAT INHABIT THE\nABBEY WITH THIS COLORFUL NAME",
            "REDWALL");
    public Clue DoubleClue5 = new Clue("LATIN MUSIC", 400,
            "HER HIPS DON'T LIE",
            "SHAKIRA");
    public Clue DoubleClue6 = new Clue("LATIN MUSIC", 800,
            "THE LAST NAME OF THIS SINGER OF 'BAILANDO'\nMEANS CHURCHES IN SPANISH",
            "ENRIQUE IGLESIAS");
    public Clue DoubleClue7 = new Clue("LATIN MUSIC", 1200,
            "SONG THAT INCLUDES THE LYRICS: \n\"SHE'LL MAKE YOU TAKE YOUR CLOTHES OFF AND GO DANCING\nIN THE RAIN. SHE'LL MAKE YOU LIVE HER CRAZY LIFE,\nBUT SHE'LL TAKE AWAY YOUR PAIN...\"",
            "LIVIN' LA VIDA LOCA");
    public Clue DoubleClue8 = new Clue("LATIN MUSIC", 1600,
            "THE TITLE OF THIS LUIS FONSI HIT TRANSLATES\nTO 'SLOWLY'",
            "DESPACITO");
    public Clue DoubleClue9 = new Clue("LATIN MUSIC", 2000,
            "HITS FROM THIS COLOMBIAN ARTIST INCLUDE 'LA CAMISA NEGRA',\n'A DIOS LE PIDO' AND 'ME ENAMORA'",
            "JUANES");
    public Clue DoubleClue10 = new Clue("NORSE MYTHOLOGY", 400,
            "NORSE GOD OF THUNDER",
            "THOR");
    public Clue DoubleClue11 = new Clue("NORSE MYTHOLOGY", 800,
            "TOM HIDDLESTON COULD TELL YOU THAT THIS NORSE\nGOD WAS A TRICKSTER",
            "LOKI");
    public Clue DoubleClue12 = new Clue("NORSE MYTHOLOGY", 1200,
            "BIFROST, THE BRIDGE THAT CONNECTS MIDGARD AND\nASGARD IS ONE OF THESE COLORFUL PHENOMENA",
            "RAINBOW");
    public Clue DoubleClue13 = new Clue("NORSE MYTHOLOGY", 1600,
            "RATATOSKR IS ONE OF THESE ANIMALS THAT RUNS\nUP AND DOWN THE WORLD TREE YGGDRASIL DELIVERING\nMESSAGES",
            "SQUIRREL");
    public Clue DoubleClue14 = new Clue("NORSE MYTHOLOGY", 2000,
            "NAME OF THE THUNDER GOD'S HAMMER",
            "MJOLNIR");
    public Clue DoubleClue15 = new Clue("AVIAN NAMES", 400,
            "PROFESSIONAL SKATEBOARDER WHOSE NAME IS ON A\nSERIES OF VIDEO GAMES",
            "TONY HAWK");
    public Clue DoubleClue16 = new Clue("AVIAN NAMES", 800,
            "THIS ACTOR'S MOVIES INCLUDE 'MRS. DOUBTFIRE', 'HOOK'\nAND 'JUMANJI'",
            "ROBIN WILLIAMS");
    public Clue DoubleClue17 = new Clue("AVIAN NAMES", 1200,
            "CAPTAIN OF THE BLACK PEARL PLAYED BY JOHNNY DEPP",
            "JACK SPARROW");
    public Clue DoubleClue18 = new Clue("AVIAN NAMES", 1600,
            "LAST NAME OF ATTICUS FROM 'TO KILL A MOCKINGBIRD'",
            "FINCH");
    public Clue DoubleClue19 = new Clue("AVIAN NAMES", 2000,
            "AUTHOR OF 'THE RED BADGE OF COURAGE'",
            "STEPHEN CRANE");
    public Clue DoubleClue20 = new Clue("MOVIE QUOTES", 400,
            "'MY NAME IS INIGO MONTOYA. YOU KILLED MY FATHER.\nPREPARE TO DIE'",
            "THE PRINCESS BRIDE");
    public Clue DoubleClue21 = new Clue("MOVIE QUOTES", 800,
            "'FRANKLY, MY DEAR, I DON'T GIVE A DAMN'",
            "GONE WITH THE WIND");
    public Clue DoubleClue22 = new Clue("MOVIE QUOTES", 1200,
            "'MY MAMA ALWAYS SAID LIFE WAS LIKE A BOX OF CHOCOLATES. YOU NEVER KNOW WHAT YOU'RE GONNA GET'",
            "FORREST GUMP");
    public Clue DoubleClue23 = new Clue("MOVIE QUOTES", 1600,
            "'SURELY YOU CAN'T BE SERIOUS'.\n'I AM SERIOUS. AND DON'T CALL ME SHIRLEY.'",
            "AIRPLANE!");
    public Clue DoubleClue24 = new Clue("MOVIE QUOTES", 2000,
            "'IF YOU BUILD IT, HE WILL COME'",
            "FIELD OF DREAMS");
    public Clue DoubleClue25 = new Clue("HARRY POTTER", 400,
            "HOGWARTS HOUSES INCLUDE GRYFFINDOR, SLYTHERIN,\nRAVENCLAW AND THIS HOUSE",
            "HUFFLEPUFF");
    public Clue DoubleClue26 = new Clue("HARRY POTTER", 800,
            "HEADMASTER OF HOGWARTS WHEN HARRY STARTS HIS FIRST YEAR",
            "ALBUS DUMBLEDORE");
    public Clue DoubleClue27 = new Clue("HARRY POTTER", 1200,
            "PROFESSOR QUIRREL IS THE FIRST OF MANY TEACHERS\nHARRY HAS IN THIS SUBJECT IN HIS YEARS AT HOGWARTS",
            "DEFENSE AGAINST THE DARK ARTS");
    public Clue DoubleClue28 = new Clue("HARRY POTTER", 1600,
            "THIS BULGARIAN PRO QUIDDITCH PLAYER REPRESENTED\nDURMSTRANG IN THE TRIWIZARD TOURNAMENT",
            "VIKTOR KRUM");
    public Clue DoubleClue29 = new Clue("HARRY POTTER", 2000,
            "LAST NAME OF THE THREE BROTHERS WHO ORIGINALLY POSSESSED\nTHE DEATHLY HALLOWS",
            "PEVERELL");


    protected String finalJeopardyCategory = "MATH AND LITERATURE";
    protected String finalJeopardyAnswer = "THE 227 DAYS THAT THE NARRATOR OF THIS NOVEL\nSPENDS AT SEA IS LIKELY A REFERENCE TO\nTHE FRACTION 22/7";
    protected String finalJeopardyCorrectResponse = "LIFE OF PI";

    //Constructors
    public Game2(){
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
}
