public class Växt implements Water {

    //inkapslar variablen length och liquidType.
    private double length;
    String name;
    double amountOfWater;
    private String liquidType;

    public Växt(String name, double length, String liquidType) {
        this.name = name;
        this.length = length;
        this.liquidType = liquidType;
    }

    @Override
    public double getAmountOfWater() {
        return 0;
    }

    //Gör det möjligt att hämta den inkapslade variabeln i subklasser.
    public double getLength() {
        return length;
    }

    public String getLiquidType() {
        return this.liquidType;
    }

}
