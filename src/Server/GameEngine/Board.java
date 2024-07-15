package Server.GameEngine;

import Server.GameEngine.Entity.Army;
import Server.GameEngine.Entity.Unit;

public class Board {
    static final int widthBoard = 3;
    static final int heightBoard = 4;
    public Unit[][] unitList = new Unit[widthBoard][heightBoard];
    static boolean isFull = false;

    public static void uploadBoard(){

    }
}
