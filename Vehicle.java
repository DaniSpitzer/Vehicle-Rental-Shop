public abstract class Vehicle {

    private String modelName;
    private int gasConsumption;
    private int gasLevel;
    private boolean freeToRental = true;
    private int vehicleCode;
    private int rentalPrice;


    public Vehicle(String modelName, int gasConsumption, boolean freeToRental, int rentalPrice, int vehicleCode) {
        this.modelName = modelName;
        this.gasConsumption = gasConsumption;
        this.freeToRental = freeToRental;
        this.rentalPrice = rentalPrice;
        this.vehicleCode = vehicleCode;
        this.gasLevel = 25;
    }

    public void drive(int distance, int tripDuration){

    }
    public void refuel(int refuelQuantity){
        this.gasLevel = this.gasLevel + refuelQuantity;
    }
    public int getGasConsumption() {
        return this.gasConsumption;
    }
    public int getGasLevel() {
        return gasLevel;
    }
    public void setGasLevel(int gasLevel) {
        this.gasLevel = gasLevel;
    }
    public int getVehicleCode() {
        return vehicleCode;
    }
    public void setVehicleCode(int vehicleCode) {
        this.vehicleCode = vehicleCode;
    }
    public boolean getFreeToRental() {
        return freeToRental;
    }
    public void setFreeToRental(boolean freeToRental) {
        this.freeToRental = freeToRental;
    }
}
