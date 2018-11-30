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

    public static Armour getRandom(){
        int number = (int)(Math.random() * 4 + 1);
        if (number == 1) {
            return Armour.CHAINMAIL;
        }
        if (number == 2) {
            return Armour.LEATHER;
        }
        if (number == 3) {
            return Armour.PLATEMAIL;
        }
        else return Armour.RINGMAIL;
    }
}
