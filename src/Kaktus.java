public class Kaktus extends Växt {
    private double dailyDosage = 0.01;

    public Kaktus(String name, double length, String typeOfWater) {
        super(name, length, typeOfWater);
    }

    @Override
    public double getAmountOfWater() {
        return this.amountOfWater = dailyDosage;
    }

}
