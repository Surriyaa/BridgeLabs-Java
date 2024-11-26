package designpatterns.singletonpattern;

interface Transport{
    void delivery();
}

class Truck implements Transport{
    @Override
    public void delivery(){
        System.out.println("Using the truck by Road to delivery");
    }
}

class Ship implements Transport{
    @Override
    public void delivery(){
        System.out.println("Using the ship to delivery by sea way");
    }
}

abstract class Logistics{

    public abstract Transport createTransport();

    public void planDelivery(){
        Transport transport=createTransport();
        transport.delivery();
    }
}

class RoadLogistics extends Logistics{
    @Override
        public Transport createTransport(){
            return new Truck() ;
        }
}

class SeaLogistics extends Logistics{
    @Override
    public Transport createTransport(){
        return new Ship();
    }
}

public class FormatFactory {
    public static void main(String[] args) {
    Logistics logistics;

    //for road logistics calling
    logistics=new RoadLogistics();
    logistics.planDelivery();
        System.out.println();
    //for Sea logistics
    logistics=new SeaLogistics();
    logistics.planDelivery();
}
}