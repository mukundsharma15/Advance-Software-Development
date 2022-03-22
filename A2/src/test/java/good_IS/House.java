package good_IS;

import org.junit.Assert;
import org.junit.Test;

public class House {
    avenue_house idp_house = new avenue_house();

    @Test
    public void area_of_basementTest(){
        //test to validate the interface segregation principle
        Assert.assertEquals(true, idp_house.area_of_basement());
    }

    @Test
    public void area_of_kitchenTest(){
        //test to validate the interface segregation principle
        Assert.assertEquals(true, idp_house.area_of_kitchen());
    }

    @Test
    public void area_of_roomsTest(){
        //test to validate the interface segregation principle
        Assert.assertEquals(true, idp_house.area_of_rooms());
    }
}

