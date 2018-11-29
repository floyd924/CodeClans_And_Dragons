package enums;

public enum CreatureType {
    GREMLIN(5),
    MINION(2),
    GOBLIN(7),
    MIDGIE(1),
    MIDGIESWARM(10);

    private int value;

    CreatureType(int value){
        this.value = value;
    }

    public int getValue(){
        return this.value;
    }
}
