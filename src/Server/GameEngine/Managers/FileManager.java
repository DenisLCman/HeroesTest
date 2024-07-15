package Server.GameEngine.Managers;

import Server.GameEngine.Board;
import Server.GameEngine.FileEvent.FileListener;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FileManager {

    HashMap<String, List<FileListener>> listeners = new HashMap<>();
    public FileManager(String... operations) {
        for (String operation : operations) {
            this.listeners.put(operation, new ArrayList<>());
        }
    }
    public void subscribe(String eventType, FileListener listener) {
        List<FileListener> users = listeners.get(eventType);
        users.add(listener);
    }

    public void unsubscribe(String eventType, FileListener listener) {
        List<FileListener> users = listeners.get(eventType);
        users.remove(listener);
    }

    public void notify(String eventType, Board file) {
        List<FileListener> users = listeners.get(eventType);
        for (FileListener listener : users) {
            listener.update(eventType, file);
        }
    }
}
