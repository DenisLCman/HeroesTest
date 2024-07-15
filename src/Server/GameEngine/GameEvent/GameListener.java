package Server.GameEngine.GameEvent;

import Server.GameEngine.Board;

public interface GameListener {

    /*
     * Интерфейс реализует проверку на корректность действий игрока исходя из правил игры,
     * А также изменяет состояние текущей доски baseBoard
     */
    boolean isDone = false;
    public void checkRequest();
    public void update(String eventType, Board board);
}
