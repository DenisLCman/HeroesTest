package Server.GameEngine.Entity;

public class Healer extends Unit{
    public Healer() {
        setType("Healer");
        setMaxHP(10);
        setNowHP(10);
        setDamage(5);
        setAccuracy(5);
        setArmor(12);
        setGeneral(false);
    }
    @Override
    public void playMove(Unit targetUnit) {
    }
}