package enums;

public enum Weapon {
    SWORD(6),
    BATTLEAXE(8),
    WARHAMMER(7),
    ARROWS(6),
    SLINGSHOT(2),
    SPEAR(9);

    private int value;

    Weapon(int value){
        this.value = value;
    }

    public int getValue(){
        return this.value;
    }

    public static Weapon getRandom(){
        int number = (int)(Math.random() * 6 + 1);
        if (number == 1) {
            return Weapon.SLINGSHOT;
        }
        if (number == 2) {
            return Weapon.SPEAR;
        }
        if (number == 3) {
            return Weapon.ARROWS;
        }
        if (number == 4) {
            return Weapon.SWORD;
        }
        if (number == 5) {
            return Weapon.WARHAMMER;
        }
        else return Weapon.BATTLEAXE;
    }
}
