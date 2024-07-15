package Server.GameEngine.GameEvent;

import Server.GameEngine.Board;
import Server.GameEngine.Entity.*;


public class Placement implements GameListener {
    @Override
    public void checkRequest() {

    }

    @Override
    public void update(String eventType, Board board) {
        board.unitList[2][3] = new Knight();
    }
    /*
     * Класс реализует исполнение расположения одного юнита исходя из заложенных правил расстановки
     */
}
