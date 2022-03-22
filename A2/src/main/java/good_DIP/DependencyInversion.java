package good_DIP;

interface house_price {
    boolean calculation();
}

class Apartment implements house_price{

    @Override
    public boolean calculation(){
        elevator_lift();
        return true;
    }

    public boolean elevator_lift(){
        return true;
    }
}

class IndependentHouse implements house_price{

    @Override
    public boolean calculation(){
        basement();
        return true;
    }

    public boolean basement(){
        return true;
    }
}

class House {
    public void price(house_price hp){
        hp.calculation();
    }
}
