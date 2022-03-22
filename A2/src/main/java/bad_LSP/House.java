package bad_LSP;

public class House {

    int noOfKitchen = 0;
    int noOfRoom = 0;
    boolean basement = false;

    public void kitchen(){
        System.out.println("Hey.. I am a part of house");
    }

    public void rooms(){
        System.out.println("Hey.. I am a part of house");
    }

    public void basement(){
        System.out.println("Hey.. I am a part of house");
    }
}


class IndependentHouse extends House{

    public void car_parking(){
        System.out.println("Hi.. i can park your car in a basement");
        // business logic
    }

    @Override
    public void kitchen(){
        super.noOfKitchen = 2;
        System.out.println("This House have "+ noOfKitchen +" Kitchen");
        // business logic
    }

    @Override
    public void rooms(){
        super.noOfRoom = 5;
        System.out.println("This House have "+ noOfRoom +" Room");
        // business logic
    }

    @Override
    public void basement(){
        super.basement = true;
        car_parking();
    }
}


class Apartment extends House{

    @Override
    public void kitchen(){
        super.noOfKitchen = 1;
        System.out.println("This Apartment have "+ noOfKitchen +" Kitchen");
        // business logic
    }

    @Override
    public void rooms(){
        super.noOfRoom = 5;
        System.out.println("This Apartment have "+ noOfRoom +" Room");
        // business logic
    }

    @Override
    public void basement(){
        // I don't have a basement
        System.out.println("Sorry.. no basement facility");
    }
}

