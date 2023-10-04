import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class VäxtTest {

    Växt laura = new Palm("laura", 5, Liquids.Kranvatten.liquidType);
    Växt olof = new Palm("olof", 1, Liquids.Mineralvatten.liquidType);
    Växt meatloaf = new KöttätandeVäxt("meatloaf", 0.7, Liquids.Proteindryck.liquidType);
    Växt igge = new Kaktus("igge", 0.2, Liquids.Mineralvatten.liquidType);

    @Test
    void testMethodGetAmountOfWaterLaura() {
        double expectedAmount = 2.5;
        double actualAmount = laura.getAmountOfWater();
        Assertions.assertEquals(expectedAmount, actualAmount);
    }

    @Test
    void testMethodGetAmountOfWaterOlof() {
        double expectedAmount = 0.5;
        double actualAmount = olof.getAmountOfWater();
        Assertions.assertEquals(expectedAmount, actualAmount);
    }

    @Test
    void testMethodGetAmountOfWaterIgge() {
        double expectedAmount = 0.02;
        double actualAmount = igge.getAmountOfWater();
        Assertions.assertEquals(expectedAmount, actualAmount);
    }

    @Test
    void testMethodGetAmountOfWaterMeatloaf() {
        double expectedAmount = 0.24;
        double actualAmount = meatloaf.getAmountOfWater();
        Assertions.assertEquals(expectedAmount, actualAmount);
    }
}