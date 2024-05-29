public class Vehicle {
    private String make;
    protected String model;
    private int year;
    protected String modelType;
    protected double distanceTravelled = 0;
    protected double fuelUsed;
    protected double timeTravelled;
    protected double velocity;
    protected double mass = 0;

    public Vehicle(String mo, int y, String mt, double ma) {
        this.model = mo;
        this.year = y;
        this.modelType = mt;
        this.mass = ma;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModelType() {
        return modelType;
    }

    public void setModelType(String modelType) {
        this.modelType = modelType;
    }

    public double getFuelUsed() {
        return fuelUsed;
    }

    public void setFuelUsed(double fuelUsed) {
        this.fuelUsed = fuelUsed;
    }

    public double getTimeTravelled() {
        return timeTravelled;
    }

    public void setTimeTravelled(double timeTravelled) {
        this.timeTravelled = timeTravelled;
    }

    public double getVelocity() {
        return velocity;
    }

    public void setVelocity(double velocity) {
        this.velocity = velocity;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public String calculateDistanceTravelled() {
        distanceTravelled = this.timeTravelled * this.velocity;
        return "Distance travelled = Time travelled: " + this.timeTravelled + "(Hr) *" + " Velocity: " + this.velocity + "(km/Hr) = " + distanceTravelled + "(km)";
    }

    public String calculateFuelEfficiency() {
        double fuelEfficiency = this.distanceTravelled / this.fuelUsed;
        return "Fuel efficiency = Distance travelled: " + this.distanceTravelled + "(km) /" + " Fuel used: " + this.fuelUsed + "(L) = " + fuelEfficiency + "(km/L)";
    }

    public String calculateMaximumSpeed() {
        double maximumSpeed = (this.distanceTravelled / this.timeTravelled) + (this.mass - this.fuelUsed);
        return "Maximum speed = (Distance travelled: " + this.distanceTravelled + "(km) /" + " Time travelled: " + this.timeTravelled + "(Hr)) + (Vehicle mass: " + this.mass + "(kg) - Fuel used: " + this.fuelUsed + "(L)) = " + maximumSpeed + "(km/Hr) (max)";
    }
}
