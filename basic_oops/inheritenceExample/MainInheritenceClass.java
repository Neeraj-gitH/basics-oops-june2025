package basic_oops.inheritenceExample;

public class MainInheritenceClass {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.start();
        vehicle.stop();
        vehicle.fuel();

        System.out.println("----------Child WaterVehicle class-----------");
        WaterVehicle waterVehicle = new WaterVehicle();
        waterVehicle.start();
        waterVehicle.stop();
        waterVehicle.fuel();

        System.out.println("-----------Child AirVehicle class------------");
        AirVehicle airVehicle = new AirVehicle();
        airVehicle.start();
        airVehicle.stop();
        airVehicle.fuel();

        System.out.println("-----------Child RoadVehicle class-----------");
        RoadVehicle roadVehicle = new RoadVehicle();
        roadVehicle.start();
        roadVehicle.stop();
        roadVehicle.fuel();


    }
}
