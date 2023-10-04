public class Palm extends Växt {
    private final double waterToLengthRatio = 0.5;

    public Palm(String name, double length, String liquidType) {
        super(name, length, liquidType);
    }

    @Override
    public double getAmountOfWater() {
        return this.amountOfWater = getLength() * waterToLengthRatio;
    }

}
