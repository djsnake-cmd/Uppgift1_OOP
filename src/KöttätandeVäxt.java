public class KöttätandeVäxt extends Växt {

    private double dailyDosage = 0.1;
    private double waterToLengthRatio = 0.2;

    public KöttätandeVäxt(String name, double length, String liquidType) {
        super(name, length, liquidType);

    }

    @Override
    public double getAmountOfWater() {
        return this.amountOfWater = dailyDosage + (waterToLengthRatio * getLength());
    }

}
