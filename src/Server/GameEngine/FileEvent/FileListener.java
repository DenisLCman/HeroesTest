package Server.GameEngine.FileEvent;

import Server.GameEngine.Board;

public interface FileListener {
    public void update(String eventType, Board board);
}
