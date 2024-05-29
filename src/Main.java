public class Main {
    public static void main(String[] args) {
        Vehicle newTruck = new Truck("Autobot", 2004, "Optimus Prime", 400);
        newTruck.setTimeTravelled(1);
        newTruck.setVelocity(60);
        System.out.println(newTruck.calculateDistanceTravelled());
        newTruck.setFuelUsed(50);
        System.out.println(newTruck.calculateFuelEfficiency());
        System.out.println(newTruck.calculateMaximumSpeed());

        Vehicle newCar = new Car("Dodge Charger", 2004, "BumbleBee", 250);
        newCar.setTimeTravelled(1);
        newCar.setVelocity(80);
        System.out.println(newCar.calculateDistanceTravelled());
        newCar.setFuelUsed(40);
        System.out.println(newCar.calculateFuelEfficiency());
        System.out.println(newCar.calculateMaximumSpeed());
    }
}