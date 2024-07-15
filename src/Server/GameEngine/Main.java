package Server.GameEngine;

import Server.GameEngine.FileEvent.DTOcontrol;
import Server.GameEngine.FileEvent.Mapper;
import Server.GameEngine.GameEvent.ChooseGeneral;
import Server.GameEngine.GameEvent.Move;
import Server.GameEngine.GameEvent.Placement;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        File DTO = new File("ddd");
        Game game = new Game();
        RequestController requestController = new RequestController();
        requestController.fileEvents.subscribe("dtoControl", new DTOcontrol(DTO));
        requestController.fileEvents.subscribe("mapper", new Mapper(DTO));
        game.gameEvents.subscribe("move", new Move());
        game.gameEvents.subscribe("placement", new Placement());
        game.gameEvents.subscribe("chooseGeneral", new ChooseGeneral());

        try{
            requestController.dtoControl(new Board());
            requestController.mappedFile(new Board());
            game.execute(new String("move"));
            requestController.mappedFile(game.baseBoard);
        }
        catch (Exception e){
        }
    }
}