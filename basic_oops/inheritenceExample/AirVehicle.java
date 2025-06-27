package basic_oops.inheritenceExample;

public class AirVehicle extends Vehicle {
    public  void travelOnAir(){
        System.out.println("these vehicles run on AIR");
        super.colour="red";
    }

    @Override
    public void start(){
        System.out.println("Air Vehicle starting with OVERRIDING NOW");
    }
}
