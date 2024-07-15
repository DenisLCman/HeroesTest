package Server.GameEngine.FileEvent;

import Server.GameEngine.Board;

import java.io.File;

public class Mapper implements FileListener{
    private File jsonFile;
    public Mapper(File jsonFile){
        this.jsonFile = jsonFile;
    }
    @Override
    public void update(String eventType, Board board) {
        //Переработали файл из json в board
    }
}
