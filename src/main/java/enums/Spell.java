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
}
