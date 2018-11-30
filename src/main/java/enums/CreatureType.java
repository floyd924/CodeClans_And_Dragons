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

    public static CreatureType getRandom(){
        int number = (int)(Math.random() * 5 + 1);
        if (number == 1) {
            return CreatureType.GOBLIN;
        }
        if (number == 2) {
            return CreatureType.GREMLIN;
        }
        if (number == 3) {
            return CreatureType.MIDGIE;
        }
        if (number == 4) {
            return CreatureType.MIDGIESWARM;
        }
        else return CreatureType.MINION;
    }
}
