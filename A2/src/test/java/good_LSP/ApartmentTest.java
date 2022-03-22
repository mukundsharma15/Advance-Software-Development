package good_LSP;

import good_LSP.*;
import org.junit.Assert;
import org.junit.Test;


public class ApartmentTest {

    Apartment house = new Apartment();
    IndependentHouse id = new IndependentHouse();

    @Test
    public void apartmentObjTest() {
        Assert.assertEquals(house.kitchen(1), 1);
    }

    @Test
    public void elevatorLift() {
        Assert.assertEquals(true, house.elevator_lift());
    }

    @Test
    public void IndHouseTestTest() {
        Assert.assertEquals(true, id.rooms());
    }
}
