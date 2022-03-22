package good_LSP;

import good_LSP.WithoutBasement;

public class Apartment extends WithoutBasement {
    @Override
    public int kitchen(int i) {
        super.noOfKitchen = 1;
        System.out.println("This Apartment have " + noOfKitchen + " Kitchen");
        return noOfKitchen;
        // business logic
    }

    @Override
    public boolean rooms() {
        super.noOfRoom = 5;
        System.out.println("This Apartment have " + noOfRoom + " Room");
        // business logic
        return true;
    }

    @Override
    public boolean elevator_lift() {
        System.out.println("This Apartment have elevator lifts");
        return true;
    }

}
