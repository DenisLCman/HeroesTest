package Server.GameEngine;

import Server.GameEngine.Managers.FileManager;

public class RequestController {

    public FileManager fileEvents;
    public void dtoControl(Board board){
        fileEvents.notify("dtoControl", board);
    }
    public void mappedFile(Board board){
        fileEvents.notify("mapper", board);
    }

}
