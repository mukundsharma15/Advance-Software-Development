package bad_OCP;

class Apartment {
    public int bedroom;
    public int washroom;
    public int apartment_floor;
}


class IndependentHouse {
    public int bedroom;
    public int washroom;
    public int basement_rooms;
    public int car_parking;
}

class HousePriceCalculator {
    public int calculateApartmentPrice(Apartment apartment){
        //simple logic to calculate house price
        return ((apartment.bedroom + apartment.washroom + apartment.apartment_floor) * 1000 +12323);
    }

    public int calculateIndependentHousePrice(IndependentHouse ind){
        //simple logic to calculate house price
        return ((ind.bedroom + ind.washroom + ind.basement_rooms * ind.car_parking) * 1000 +20000);
    }
}

