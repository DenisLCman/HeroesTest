package Server.GameEngine.FileEvent;

import Server.GameEngine.Board;

import java.io.File;

public class DTOcontrol implements FileListener{
    private File jsonFile;
    public DTOcontrol(File jsonFile){
        this.jsonFile = jsonFile;
    }
    @Override
    public void update(String eventType, Board board) {
        //Проверили файл на корректность ввода
    }
}
