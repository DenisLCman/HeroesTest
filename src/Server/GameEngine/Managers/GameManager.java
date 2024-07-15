package Server.GameEngine.Managers;

import Server.GameEngine.Board;
import Server.GameEngine.GameEvent.GameListener;

import java.util.*;
import java.io.File;
import java.util.HashMap;

public class GameManager {
    HashMap<String, List<GameListener>> listeners = new HashMap<>();
    public GameManager(String... operations) {
        for (String operation : operations) {
            this.listeners.put(operation, new ArrayList<>());
        }
    }
    public void subscribe(String eventType, GameListener listener) {
        List<GameListener> users = listeners.get(eventType);
        users.add(listener);
    }

    public void unsubscribe(String eventType, GameListener listener) {
        List<GameListener> users = listeners.get(eventType);
        users.remove(listener);
    }

    public void notify(String eventType, Board file) {
        List<GameListener> users = listeners.get(eventType);
        for (GameListener listener : users) {
            listener.update(eventType, file);
        }
    }
}
