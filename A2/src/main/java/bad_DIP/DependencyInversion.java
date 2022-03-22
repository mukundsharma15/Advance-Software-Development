package bad_DIP;

class Apartment{
    public void elevator_lift(){
    }
}

class IndependentHouse{
    public void basement(){
    }
}

class House {
    Apartment a1 = new Apartment();
    IndependentHouse i1 = new IndependentHouse();

    public void house_price(){
        a1.elevator_lift();
        i1.basement();
    }
}
