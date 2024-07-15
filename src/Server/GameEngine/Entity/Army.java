package Server.GameEngine.Entity;

import java.util.HashMap;
import java.util.Map;

public class Army {
    public HashMap<Position, Unit> map;
    public String ownerUsername;
    public String generalType;
    public boolean isAliveGeneral = false;
    public boolean isBuffed = false;

    public Army(String owner){
        this.ownerUsername = owner;
        map = new HashMap<>();
    }

    public void setOwner(String owner){
        this.ownerUsername = owner;
    }
    public String getOwner(){
        return ownerUsername;
    }

    public void addUnit(Position position, Unit unit){map.put(position,unit);}
    public Unit getUnit(Position position){
        return map.get(position);
    }

    public HashMap<Position, Unit> getUnits(){ return map; }
    public void killUnit(Position position) { map.remove(position); }
    public boolean isAliveGeneral(){
        isAliveGeneral = false;
        for(Map.Entry<Position,Unit> tmp : map.entrySet()){
            if(map.get(tmp.getKey()).isGeneral()){
                generalType = map.get(tmp.getKey()).getType();
                isAliveGeneral = true;
                break;
            }
        }
        if(isAliveGeneral){
            if(!isBuffed) {
                for (Map.Entry<Position, Unit> unit : map.entrySet()) {
                    map.get(unit.getKey()).applyBuff(map.get(unit.getKey()), generalType);
                }
            }
            isBuffed = true;
        }
        else if(isBuffed){
            for(Map.Entry<Position,Unit> unit : map.entrySet()){
                map.get(unit.getKey()).removeBuff(map.get(unit.getKey()), generalType);
            }
            isBuffed = false;
        }
        return isAliveGeneral;
    }

}
