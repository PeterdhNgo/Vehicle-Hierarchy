public class Car extends Vehicle{
    public Car(String mo, int y, String mt, double ma) {
        super(mo, y, mt, ma);
    }

    @Override
    public String calculateDistanceTravelled() {
        distanceTravelled = this.timeTravelled * this.velocity;
        return this.modelType + ": Distance travelled = Time travelled: " + this.timeTravelled + "(Hr) *" + " Velocity: " + this.velocity + "(km/Hr) = " + distanceTravelled + "(km)";
    }

    public String calculateFuelEfficiency() {
        double fuelEfficiency = this.distanceTravelled / this.fuelUsed;
        return this.modelType + ": Fuel efficiency = Distance travelled: " + this.distanceTravelled + "(km) /" + " Fuel used: " + this.fuelUsed + "(L) = " + fuelEfficiency + "(km/L)";
    }

    public String calculateMaximumSpeed() {
        double maximumSpeed = (this.distanceTravelled / this.timeTravelled) + (this.mass - this.fuelUsed);
        return this.modelType + ": Maximum speed = (Distance travelled: " + this.distanceTravelled + "(km) /" + " Time travelled: " + this.timeTravelled + "(Hr)) + (Vehicle mass: " + this.mass + "(kg) - Fuel used: " + this.fuelUsed + "(L)) = " + maximumSpeed + "(km/Hr) (max)";
    }
}
