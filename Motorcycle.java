public class Motorcycle extends Vehicle{

    int maxSpeed = 80;

    public Motorcycle(String modelName, int gasConsumption, boolean freeToRental, int rentalPrice, int vehicleCode) {
        super(modelName, gasConsumption, freeToRental, rentalPrice, vehicleCode);
    }

    @Override
    public void drive(int distance, int tripDuration) {
        int fuelConsumption = distance / getGasConsumption();
        int neededTimeForTrip = distance / tripDuration;
        if(distance > 80){
            System.out.println("You can't drive more than 80km with this vehicle");
            return;
        }
        if(fuelConsumption > this.getGasLevel()){
            System.out.println("The fuel level is not enough for your trip. Please, refuel the motorcycle.");
            return;
        }
        if(neededTimeForTrip > maxSpeed){
            System.out.println("Respecting the maximum speed of the motorcycle, your travelling time isn't enough to complete th distance");
            return;
        }
        if(this.getGasLevel() > 0) {
            this.setGasLevel(this.getGasLevel() - fuelConsumption);
            System.out.println("Vrum... Vrum.... .... .... ");
            return;
        }
        System.out.println("Refuel your motorcycle");
    }
}
