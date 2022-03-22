package good_OCP;

import org.junit.Assert;
import org.junit.Test;

public class ApartmentTest {
    Apartment a1 = new Apartment();
    IndependentHouse ind = new IndependentHouse();

    @Test
    public void calculatePriceTest(){
        //test to validate the working of calculate apartment price
        Assert.assertEquals(true, a1.calculatePrice());
    }

    @Test
    public void calculatePriceInd(){
        //test to validate the working of calculate apartment price
        Assert.assertEquals(true, ind.calculatePrice());
    }
}
