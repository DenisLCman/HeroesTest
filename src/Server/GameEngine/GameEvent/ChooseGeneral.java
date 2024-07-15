package Server.GameEngine.GameEvent;

import Server.GameEngine.Board;
import Server.GameEngine.Entity.Knight;

public class ChooseGeneral implements GameListener{

    @Override
    public void checkRequest() {

    }

    @Override
    public void update(String eventType, Board board) {
        board.unitList[2][3].setGeneral(true);
    }
}
