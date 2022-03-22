package good_LSP;

public abstract class House {
    int noOfKitchen = 0;
    int noOfRoom = 0;

    public abstract int kitchen(int i);
    public abstract boolean rooms();
}

abstract class WithBasement extends House{

    @Override
    public boolean rooms(){
        System.out.println("Hey.. I am a part of house with basement");
        return true;
    }

    @Override
    public int kitchen(int i){
        System.out.println("Hey.. I am a part of house with basement");
        return 0;
    }

    public void car_parking(){
        System.out.println("Hi.. i can park your car in a basement");
    }

    public void basement(){
        System.out.println("Hey.. I am a part of house with basement");
        car_parking();
    }

}

class WithoutBasement extends House{

    @Override
    public boolean rooms(){
        System.out.println("Hey.. I am a part of house with basement");
        return true;
    }

    @Override
    public int kitchen(int i){
        System.out.println("Hey.. I am a part of house with basement");
        return 0;
    }

    public boolean elevator_lift (){
        System.out.println("Hey.. I am a part of house without basement");
        return true;
    }
}


