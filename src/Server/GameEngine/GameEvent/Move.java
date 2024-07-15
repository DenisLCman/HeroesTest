package Server.GameEngine.GameEvent;

import Server.GameEngine.Board;

public class Move implements GameListener {

    @Override
    public void checkRequest() {

    }

    @Override
    public void update(String eventType, Board board) {
        board.unitList[2][3].playMove(board.unitList[1][2]);
    }


    /*
     * Класс реализует исполнение хода игрока одним юнитом исходя из заложенных правил игрового процесса
     */

}
