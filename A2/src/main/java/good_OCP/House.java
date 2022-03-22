package good_OCP;

public interface House {
    // closed interface, open for extension.
    boolean calculatePrice();
}

class Apartment implements House{
    public int bedroom;
    public int washroom;
    public int apartment_floor;

    public boolean calculatePrice(){
        System.out.println(((bedroom + washroom + apartment_floor) * 1000 +12323));
        return true;
    }

}

class IndependentHouse implements House{
    public int bedroom;
    public int washroom;
    public int basement_rooms;
    public int car_parking;

    public boolean calculatePrice(){
        System.out.println(((bedroom + washroom + basement_rooms * car_parking) * 1000 +20000));
        return true;
    }

}