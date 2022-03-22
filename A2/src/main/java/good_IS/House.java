package good_IS;

interface HouseInterface {
    boolean area_of_rooms();
    boolean area_of_kitchen();
}

interface Apartment extends HouseInterface{
    void area_of_lift();
}

interface IndependentHouse extends HouseInterface{
    boolean area_of_basement();
}

class avenue_house implements IndependentHouse {

    @Override
    public boolean area_of_rooms(){
        // logic to cal area of rooms
        return true;
    }

    @Override
    public boolean area_of_kitchen(){
        // logic to cal area of kitchen
        return true;
    }

    @Override
    public boolean area_of_basement(){
        // logic to calculate area of basement, because this is a independent house.
        return true;
    }
}