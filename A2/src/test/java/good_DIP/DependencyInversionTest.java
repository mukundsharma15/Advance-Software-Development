package good_DIP;

import org.junit.Assert;
import org.junit.Test;

public class DependencyInversionTest {
    IndependentHouse i = new IndependentHouse();
    Apartment a = new Apartment();

    @Test
    public void basementTest(){
        //test to validate the dependency inversion principle
        Assert.assertEquals(true, i.basement());
    }

    @Test
    public void calculateTest(){
        //test to validate the dependency inversion principle
        Assert.assertEquals(true, i.calculation());
    }

    @Test
    public void elevator_liftTest(){
        //test to validate the dependency inversion principle
        Assert.assertEquals(true, a.elevator_lift());
    }

    @Test
    public void calculateAssignmentTest(){
        //test to validate the dependency inversion principle
        Assert.assertEquals(true, a.calculation());
    }

}
