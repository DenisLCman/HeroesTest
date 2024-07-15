package Server.GameEngine;

import Server.GameEngine.Managers.FileManager;
import Server.GameEngine.Managers.GameManager;

public class Game {
    static boolean gameLoop = true;
    static boolean placementLoop = true;
    public GameManager gameEvents;
    Board baseBoard;
    public Game(){
        this.gameEvents = new GameManager("move","placement","chooseGeneral");
        baseBoard = new Board();
    }
    public void execute(String typeStep){
        gameEvents.notify(typeStep,baseBoard);
    }
}
