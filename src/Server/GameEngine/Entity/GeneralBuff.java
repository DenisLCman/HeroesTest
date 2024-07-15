package Server.GameEngine.Entity;

public interface GeneralBuff {
    enum Buffs{
        ARMOR(3),DAMAGE(3),ACCURACY(3);
        private int value;
        Buffs(int value){
            this.value = value;
        }
        public int getValue(){
            return value;
        }
    }
    public default void applyBuff(Unit unit, String typeBuff){
            switch (typeBuff) {
                case "Knight":
                    unit.setArmor(unit.getArmor() + Buffs.ARMOR.getValue());
                    break;
                case "Mage":
                    unit.setDamage(unit.getDamage() + Buffs.DAMAGE.getValue());
                    break;
                case "Archer":
                    unit.setAccuracy(unit.getAccuracy() + Buffs.ACCURACY.getValue());
                    break;
            }
    }
    public default void removeBuff(Unit unit, String typeBuff) {
        switch (typeBuff) {
            case "Knight":
                unit.setArmor(unit.getArmor() - Buffs.ARMOR.getValue());
                break;
            case "Mage":
                unit.setDamage(unit.getDamage() - Buffs.DAMAGE.getValue());
                break;
            case "Archer":
                unit.setAccuracy(unit.getAccuracy() - Buffs.ACCURACY.getValue());
                break;
        }
    }
}
