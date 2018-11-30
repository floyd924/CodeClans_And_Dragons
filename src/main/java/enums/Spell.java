package enums;

public enum Spell {
    FIREBALL(6),
    LIGHTNIGHT(4),
    FROG(10),
    ITCHYNOSE(1);

    private int value;

    Spell(int value){
        this.value = value;
    }

    public int getValue(){
        return this.value;
    }

    public static Spell getRandom(){
        int number = (int)(Math.random() * 4 + 1);
        if (number == 1) {
            return Spell.FIREBALL;
        }
        if (number == 2) {
            return Spell.FROG;
        }
        if (number == 3) {
            return Spell.LIGHTNIGHT;
        }
        else return Spell.ITCHYNOSE;
    }
}
