public class Car extends Vehicle{

    int maxSpeed = 120;


    public Car(String modelName, int gasConsumption,  boolean freeToRental, int rentalPrice, int vehicleCode) {
        super(modelName, gasConsumption, freeToRental, rentalPrice, vehicleCode);
    }

    @Override
    public void drive(int distance, int tripDuration) {
        int fuelConsumption = distance / getGasConsumption();
        int neededTimeForTrip = distance / tripDuration;
        if(fuelConsumption > this.getGasLevel()){
            System.out.println("The fuel level is not enough for your trip. Please, refuel the car.");
            return;
        }
        if(neededTimeForTrip > maxSpeed){
            System.out.println("Respecting the maximum speed of the car, your travelling time isn't enough to complete the distance");
            return;
        }
        if(this.getGasLevel() > 0) {
            this.setGasLevel(this.getGasLevel() - fuelConsumption);
            System.out.println("Vrum... Vrum.... .... .... ");
            return;
        }
        System.out.println("Refuel your car");
    }
}
