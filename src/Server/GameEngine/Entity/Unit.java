package Server.GameEngine.Entity;

public abstract class Unit implements GeneralBuff{
    protected int maxHP, nowHP, damage, accuracy, armor;
    protected String type;
    protected boolean isGeneral = false;


    //Сеттеры
    protected void setType(String type) {
        this.type = type;
    }
    protected void setMaxHP(int health) {
        this.maxHP = health;
    }
    protected void setNowHP(int health) {
        this.nowHP = health;
        if (this.nowHP < 0)
            this.nowHP = 0;
        if (this.nowHP > maxHP){
            this.nowHP = maxHP;
        }
    }
    protected void setDamage(int damage) {
        this.damage = damage;
    }
    protected void setAccuracy(int accuracy) {
        this.accuracy = accuracy;
    }
    protected void setArmor(int armor) {
        this.armor = armor;
    }
    public void setGeneral(boolean isGeneral){
        this.isGeneral = isGeneral;
    }

    //Геттеры
    public String getType() {
        return type;
    }
    public int getMaxHP() {
        return maxHP;
    }
    public int getNowHP() {
        return nowHP;
    }
    public int getDamage() {
        return damage;
    }
    public int getAccuracy() {
        return accuracy;
    }
    public int getArmor() {
        return armor;
    }
    public boolean isAlive() {
        return nowHP > 0;
    }
    public boolean isGeneral(){
         return isGeneral;
    }


    //Методы для реализации в дочерних классах
    public abstract void playMove(Unit targetUnit);

}
