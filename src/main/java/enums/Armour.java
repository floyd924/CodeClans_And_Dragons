package enums;

public enum Armour {
    CHAINMAIL(5),
    PLATEMAIL(10),
    RINGMAIL(3),
    LEATHER(1);

    private final int value;

    Armour(int value){
        this.value = value;
    }

    public int getValue(){
        return this.value;
    }
}
