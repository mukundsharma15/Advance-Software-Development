package good_LSP;

import good_LSP.basementNotSupportedException;
import good_LSP.*;

public class IndependentHouse extends WithBasement {

    @Override
    public int kitchen(int i) {
        super.noOfKitchen = 2;
        System.out.println("This House have " + noOfKitchen + " Kitchen");
        return 2;
        // business logic
    }

    @Override
    public boolean rooms() {
        super.noOfRoom = 5;
        System.out.println("This House have " + noOfRoom + " Room");
        // business logic
        return true;
    }

    @Override
    public void basement() {
        boolean a = true;
        if (a){
            car_parking();
        }
        else
            throw new basementNotSupportedException();
    }
}
