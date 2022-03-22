package bad_IS;

public interface House {

    void area_of_kitchen();
    void area_of_basement();
    void area_of_lift();
    void area_of_rooms();
}

class Apartment implements House{

    @Override
    public void area_of_kitchen(){
        // logic to cal area of kitchen
    }

    @Override
    // Apartment is never going to use area of basement func
    public void area_of_basement(){}

    @Override
    public void area_of_lift(){
        // logic to calculate area of lift
    }

    @Override
    public void area_of_rooms(){
        // logic to cal area of rooms
    }
}
