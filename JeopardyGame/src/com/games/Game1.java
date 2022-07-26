package com.games;

public class Game1 extends Game{

    protected final String JEOPARDY_CATEGORY_1 = "VAMPIRES";
    protected final String JEOPARDY_CATEGORY_2 = "TV DOCTORS";
    protected final String JEOPARDY_CATEGORY_3 = "GREEK GODS";
    protected final String JEOPARDY_CATEGORY_4 = "NBA TEAMS";
    protected final String JEOPARDY_CATEGORY_5 = "DYSTOPIAN FICTION";
    protected final String JEOPARDY_CATEGORY_6 = "TAYLOR SWIFT";
    protected final String DOUBLE_JEOPARDY_CATEGORY_1 = "CAT NAMES";
    protected final String DOUBLE_JEOPARDY_CATEGORY_2 = "CHEMISTRY";
    protected final String DOUBLE_JEOPARDY_CATEGORY_3 = "DR SEUSS";
    protected final String DOUBLE_JEOPARDY_CATEGORY_4 = "DISNEY VOICES";
    protected final String DOUBLE_JEOPARDY_CATEGORY_5 = "CANADIANS";
    protected final String DOUBLE_JEOPARDY_CATEGORY_6 = "'EH'";

    public Clue Clue0 = new Clue("VAMPIRES", 200,
            "IF YOU WANT TO KEEP VAMPIRES AWAY \nFROM YOUR DINNER PARTY, WE SUGGEST\nUSING LOTS OF THIS AROMATIC IN\nYOUR DISH",
            "GARLIC");
    public Clue Clue1 = new Clue("VAMPIRES", 400,
            "TITLE CHARACTER IN A BRAM STOKER\nNOVEL",
            "DRACULA");
    public Clue Clue2 = new Clue("VAMPIRES", 600,
            "FIRST NAME OF VAMPIRE SLAYER PLAYED\nBY SARAH MICHELLE GELLAR",
            "BUFFY");
    public Clue Clue3 = new Clue("VAMPIRES", 800,
            "VAMPIRES ARE JUST ONE OF THE MANY\nTYPES OF MONSTERS BROTHERS SAM AND DEAN\nWINCHESTER HUNT ON THIS CW SHOW",
            "SUPERNATURAL");
    public Clue Clue4 = new Clue("VAMPIRES", 1000,
            "THE NAME OF THIS 1922 SILENT\nFILM COMES FROM A ROMANIAN WORD FOR\nVAMPIRE",
            "NOSFERATU");
    public Clue Clue5 = new Clue("TV DOCTORS", 200,
            "THIS TV DOCTOR'S NAME SOUNDS LIKE\nIT COMES FROM A MAGICAL LAND IN AN\nL. FRANK BAUM NOVEL",
            "DR. OZ");
    public Clue Clue6 = new Clue("TV DOCTORS", 400,
            "ACTORS THAT HAVE PLAYED THE TITLE\nCHARACTER ON THIS TIMEY-WIMEY SHOW\nINCLUDE DAVID TENNANT AND MATT SMITH",
            "DOCTOR WHO");
    public Clue Clue7 = new Clue("TV DOCTORS", 600,
            "THIS ACTOR PLAYED DR GREGORY HOUSE\nON HOUSE M.D.",
            "HUGH LAURIE");
    public Clue Clue8 = new Clue("TV DOCTORS", 800,
            "NAME OF THE SHOW WITH CHARACTERS J.D.,\nTURK, ELLIOT AND CARLA, OR THE\nTYPE OF CLOTHES THEY WEAR",
            "SCRUBS");
    public Clue Clue9 = new Clue("TV DOCTORS", 1000,
            "THIS CHARACTER PLAYED BY NEIL PATRICK\nHARRIS GOT HIS MEDICAL LICENSE AT THE AGE OF 14",
            "DOOGIE HOUSER");
    public Clue Clue10 = new Clue("GREEK GODS", 200,
            "THIS FATHER OF THE GODS IS OFTEN\nDEPICTED WITH A LIGHTNING BOLT",
            "ZEUS");
    public Clue Clue11 = new Clue("GREEK GODS", 400,
            "GOD OF THE UNDERWORLD",
            "HADES");
    public Clue Clue12 = new Clue("GREEK GODS", 600,
            "THIS MESSENGER GOD ASSOCIATED WITH SPEED\nGIVES ITS NAME TO A CLEVELAND ORGANIZATION\nTHAT PUTS ON ROAD RACES",
            "HERMES");
    public Clue Clue13 = new Clue("GREEK GODS", 800,
            "THIS GREEK GODDESS OF WISDOM IS ASSOCIATED\nWITH OWLS",
            "ATHENA");
    public Clue Clue14 = new Clue("GREEK GODS", 1000,
            "GODDESS OF SPRING AND WIFE TO THE GOD\nOF THE UNDERWORLD",
            "PERSEPHONE");
    public Clue Clue15 = new Clue("NBA TEAMS", 200,
            "THE NAME OF THIS FLORIDA TEAM \nDESCRIBES A FEATURE OF THE AREA'S\nCLIMATE",
            "HEAT");
    public Clue Clue16 = new Clue("NBA TEAMS", 400,
            "THIS MOTOR CITY TEAM IS NAMED AFTER\nENGINE PARTS",
            "PISTONS");
    public Clue Clue17 = new Clue("NBA TEAMS", 600,
            "HOUSTON WE HAVE A PROBLEM, IF YOU\nDON'T KNOW THE NAME OF THIS HOUSTON\nTEAM",
            "ROCKETS");
    public Clue Clue18 = new Clue("NBA TEAMS", 800,
            "IN 2013 THE NEW ORLEANS HORNETS CHANGED\nTHEIR NAME TO THIS BIRD",
            "PELICANS");
    public Clue Clue19 = new Clue("NBA TEAMS", 1000,
            "NBA TEAM NAMED AFTER A GENRE OF MUSIC",
            "JAZZ");
    public Clue Clue20 = new Clue("DYSTOPIAN FICTION", 200,
            "KATNISS EVERDEEN MUST FIGHT TO SURVIVE\nIN THE TITULAR EVENT IN THIS FIRST BOOK IN A TRILOGY",
            "THE HUNGER GAMES");
    public Clue Clue21 = new Clue("DYSTOPIAN FICTION", 400,
            "BIG BROTHER IS ALWAYS WATCHING IN THIS\nGEORGE ORWELL NOVEL",
            "1984");
    public Clue Clue22 = new Clue("DYSTOPIAN FICTION", 600,
            "ABNEGATION, ERUDITE, DAUNTLESS, AMITY\nAND CANDOR ARE THE FIVE FACTIONS TRIS\nHAS TO PICK FROM IN THIS NOVEL",
            "DIVERGENT");
    public Clue Clue23 = new Clue("DYSTOPIAN FICTION", 800,
            "IF YOU DON'T LIKE THIS RAY BRADBURY NOVEL,\nIT'S TITLE TELLS YOU AT WHAT TEMPERATURE\nIT WILL BURN",
            "FAHRENHEIT 451");
    public Clue Clue24 = new Clue("DYSTOPIAN FICTION", 1000,
            "THE TITLE OF THIS ALDOUS HUXLEY NOVEL\nCOMES FROM A LINE IN SHAKESPEARE'S 'THE TEMPEST'",
            "BRAVE NEW WORLD");
    public Clue Clue25 = new Clue("TAYLOR SWIFT", 200,
            "THIS TAYLOR SWIFT SONG IS A RETELLING\nOF ROMEO AND JULIET...WITH A\nHAPPIER ENDING",
            "LOVE STORY");
    public Clue Clue26 = new Clue("TAYLOR SWIFT", 400,
            "WHEN YOU THINK THIS COUNTRY SINGER,\nI HOPE YOU THINK OF THIS FIRST TAYLOR\nSWIFT SINGLE TO MAKE IT ON COUNTRY RADIO",
            "TIM MCGRAW");
    public Clue Clue27 = new Clue("TAYLOR SWIFT", 600,
            "THERE'S BEEN 'BAD BLOOD' BETWEEN TAYLOR\nAND THIS RAPPER EVER SINCE HE INTERRUPTED\nHER ACCEPTANCE OF A VMA AWARD IN 2009",
            "KANYE WEST");
    public Clue Clue28 = new Clue("TAYLOR SWIFT", 800,
            "SWIFT BRIEFLY DATED THIS OTHER TAYLOR\nBEST KNOWN FOR PLAYING A WEREWOLF IN THE\nTWILIGHT SERIES",
            "TAYLOR LAUTNER");
    public Clue Clue29 = new Clue("TAYLOR SWIFT", 1000,
            "THE 10 MINUTE VERSION OF THIS TAYLOR SWIFT\nSONG BROKE A RECORD FOR LONGEST SONG TO\nREACH NUMBER 1 ON THE POP CHARTS,\nPREVIOUSLY HELD BY DON MCLEAN'S AMERICAN PIE",
            "ALL TOO WELL");


    public Clue DoubleClue0 = new Clue("CAT NAMES", 400,
            "PERPETUAL NEMESIS OF JERRY",
            "TOM");
    public Clue DoubleClue1 = new Clue("CAT NAMES", 800,
            "LASAGNA-LOVING CREATION OF JIM DAVIS",
            "GARFIELD");
    public Clue DoubleClue2 = new Clue("CAT NAMES", 1200,
            "IF YOU SEE A DISEMBODIED SMILE WHILE WANDERING\nTHROUGH WONDERLAND, YOU MAY HAVE RUN INTO\nTHIS CREATURE",
            "THE CHESHIRE CAT");
    public Clue DoubleClue3 = new Clue("CAT NAMES", 1600,
            "THIS CAT ON SABRINA THE TEENAGE WITCH IS\nACTUALLY A WITCH HIMSELF THAT WAS TURNED\nINTO A CAT AS A PUNISHMENT",
            "SALEM");
    public Clue DoubleClue4 = new Clue("CAT NAMES", 2000,
            "HERMIONE'S CAT IN THE HARRY POTTER SERIES",
            "CROOKSHANKS");
    public Clue DoubleClue5 = new Clue("CHEMISTRY", 400,
            "AN ATOM'S NUCLEUS IS MADE UP OF NEUTRONS\nAND THESE POSITIVELY CHARGED PARTICLES",
            "PROTONS");
    public Clue DoubleClue6 = new Clue("CHEMISTRY", 800,
            "ANYTHING BELOW 7 ON THE PH SCALE IS AN ACID,\nANYTHING ABOVE 7 IS ONE OF THESE",
            "A BASE");
    public Clue DoubleClue7 = new Clue("CHEMISTRY", 1200,
            "THIS ELEMENT'S SYMBOL 'AU' COMES FROM THE LATIN 'AURUM'",
            "GOLD");
    public Clue DoubleClue8 = new Clue("CHEMISTRY", 1600,
            "THIS IS A NAME FOR A SUBSTANCE THAT SPEEDS UP\nA CHEMICAL REACTION",
            "CATALYST");
    public Clue DoubleClue9 = new Clue("CHEMISTRY", 2000,
            "THIS IS THE NAME FOR THE PROCESS OF TURNING\nDIRECTLY FROM A SOLID TO A GAS",
            "SUBLIMATION");
    public Clue DoubleClue10 = new Clue("DR SEUSS", 400,
            "A FELINE WITH HEADWEAR SHOWS UP TO\nENTERTAIN CHILDREN IN THIS BOOK",
            "THE CAT IN THE HAT");
    public Clue DoubleClue11 = new Clue("DR SEUSS", 800,
            "THIS CHARACTER TRIES TO STEAL CHRISTMAS\nBUT THEN HE LITERALLY HAS A CHANGE OF HEART",
            "THE GRINCH");
    public Clue DoubleClue12 = new Clue("DR SEUSS", 1200,
            "I WILL NOT EAT THIS DISH IN A BOX,\nWITH A FOX, IN A HOUSE, WITH A MOUSE...",
            "GREEN EGGS AND HAM");
    public Clue DoubleClue13 = new Clue("DR SEUSS", 1600,
            "'A PERSON'S A PERSON, NO MATTER HOW SMALL' IS THE\nTHEME OF THIS SEUSS BOOK FEATURING\nAN ELEPHANT",
            "HORTON HEARS A WHO");
    public Clue DoubleClue14 = new Clue("DR SEUSS", 2000,
            "THIS CREATURE SPEAKS FOR THE TREES",
            "THE LORAX");
    public Clue DoubleClue15 = new Clue("DISNEY VOICES", 400,
            "THIS CHARACTER VOICED BY TIM ALLEN\nHAS AN EXISTENTIAL CRISIS AFTER\nFINDING OUT HE'S NOT A REAL SPACE\nRANGER",
            "BUZZ LIGHTYEAR");
    public Clue DoubleClue16 = new Clue("DISNEY VOICES", 800,
            "DWAYNE 'THE ROCK' JOHNSON VOICED THIS DEMIGOD\nIN DISNEY'S MOANA. YOU'RE WELCOME.",
            "MAUI");
    public Clue DoubleClue17 = new Clue("DISNEY VOICES", 1200,
            "HE VOICED LUKE SKYWALKER'S FATHER, AS\nWELL AS SIMBA'S FATHER",
            "JAMES EARL JONES");
    public Clue DoubleClue18 = new Clue("DISNEY VOICES", 1600,
            "THIS COMEDIAN VOICED THE DRAGON MUSHU\nIN MULAN",
            "EDDIE MURPHY");
    public Clue DoubleClue19 = new Clue("DISNEY VOICES", 2000,
            "A SINGING GAZELLE WAS VOICED BY THIS\nSINGER IN THE MOVIE ZOOTOPIA",
            "SHAKIRA");
    public Clue DoubleClue20 = new Clue("CANADIANS", 400,
            "WE ALL MISS THIS LATE HOST OF JEOPARDY,\nWHO PASSED AWAY IN 2020",
            "ALEX TREBEK");
    public Clue DoubleClue21 = new Clue("CANADIANS", 800,
            "THIS HOCKEY PLAYER LENDS HIS NAME TO\nA CHAIN OF FAST FOOD RESTAURANTS THAT\nSERVE COFFEE, DONUTS AND OTHER ITEMS",
            "TIM HORTON");
    public Clue DoubleClue22 = new Clue("CANADIANS", 1200,
            "RICKY, JULIAN AND BUBBLES COME UP WITH\nVARIOUS AND OFTEN ILLEGAL SCHEMES ON THIS\nCANADIAN TV SHOW",
            "TRAILER PARK BOYS");
    public Clue DoubleClue23 = new Clue("CANADIANS", 1600,
            "THE CURRENT PRIME MINISTER OF CANADA",
            "JUSTIN TRUDEAU");
    public Clue DoubleClue24 = new Clue("CANADIANS", 2000,
            "YOU'LL IMPRESS ME MUCH IF YOU KNOW\nTHIS CANADIAN SINGER-SONGWRITER\nWHOSE HITS INCLUDE 'YOU'RE STILL THE ONE'\nAND 'MAN! I FEEL LIKE A WOMAN'",
            "SHANIA TWAIN");
    public Clue DoubleClue25 = new Clue("'EH'", 400,
            "COWBOY EXCLAMATION",
            "YEEHAW");
    public Clue DoubleClue26 = new Clue("'EH'", 800,
            "TO MAKE A MOUNTAIN OUT OF ONE OF THESE\nIS TO BLOW THINGS OUT OF PROPORTION",
            "MOLEHILL");
    public Clue DoubleClue27 = new Clue("'EH'", 1200,
            "LARGE BUILDING FOR STORING INVENTORY",
            "WAREHOUSE");
    public Clue DoubleClue28 = new Clue("'EH'", 1600,
            "THREE LETTER WORD EXPRESSING INDIFFERENCE",
            "MEH");
    public Clue DoubleClue29 = new Clue("'EH'", 2000,
            "SHAWNEE CHIEF WHO PROMOTED RESISTANCE\nTO UNITED STATES EXPANSION ONTO\nNATIVE AMERICAN LANDS",
            "TECUMSEH");


    protected String finalJeopardyCategory = "TECHNOLOGY";
    protected String finalJeopardyAnswer = "KEN JENNINGS MAY BE THE GREATEST HUMAN\nJEOPARDY PLAYER OF ALL TIME, BUT\nIN 2011 HE LOST AN EXHIBITION GAME TO WATSON,\nA QUESTION ANSWERING COMPUTER SYSTEM DEVELOPED\nBY THIS TECH COMPANY";
    protected String finalJeopardyCorrectResponse = "IBM";

    //Constructors
    public Game1(){
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
