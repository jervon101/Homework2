package com.company;

public class MapSymbols {





    final private static String blocks = "[ ]";
    final private static String tunnels = "===";
    final private static String stairs = "|";
    final private static String enemy = ">";
    final private static String player = "X";
    final private static String forSpace = " ";
    private static String dummyMap = "";
    public MapSymbols() {
    }

    Player firstplayer = new Player();


    public static void insertBlock() {
        dummyMap += blocks;
    }
    public static void insertTunnels() {
        dummyMap += tunnels;
    }
    public static void insertStairs() {
        dummyMap += stairs;
    }
    public static void insertEnemy() {
        dummyMap += enemy;
    }
    public static void insertPlayer( ) {
        dummyMap += player;
    }
    public static void insertSpace( ) {
        dummyMap += forSpace;
    }
    public static void createFloor(int length) {
        insertBlock();
        for (int i = 0; i < length; i++) {
            insertTunnels();
            insertBlock();
        }
        dummyMap += "\n";
    }
    //length was 10 when calculated
    public static void createStairs(int length, int step) {
        insertSpace();
        for (int j = 0; j < length; j++) {
            if (j % step == 0) {
                insertStairs();
            } else {
                insertSpace();
            }
            for (int k = 0; k <= 4; k++) {
                insertSpace();
            }
        }
        dummyMap += "\n";
    }



    public  void createMap( int levels, int length, int steps) {
        createFloor(length);
        for (int i = 1; i < levels; i++) {
            createStairs(length, steps);
            createFloor(length);
        }
        Motion.addPlayer(firstplayer,getDumMap());



    }
    public static String getDumMap(){
        return dummyMap;
    }



    }

