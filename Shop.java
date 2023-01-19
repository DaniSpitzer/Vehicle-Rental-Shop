public class Shop {

    private String name;

    private Vehicle[] shopVehicles = new Vehicle[100];
    private Customer[] customers = new Customer[100];
    public Shop(String name) {
        this.name = name;
    }
    public void showVehiclesOptions() {  //achar forma de filtrar somente os disponiveis
        System.out.println("\nAvailable vehicles for rental:");
        ListOfVehicles[] vehiclesOptions = ListOfVehicles.values();
        for (ListOfVehicles vehicleOption : vehiclesOptions) {
            System.out.println(vehicleOption.toString());
        }
    }
    public void rentVehicle(int vehicleCode, Customer customer) {
        if(!customer.getShopAccount()){
            System.out.println("Please, pick a shop and create an account.");
            return;
        }
        for(int i = 0; i < customers.length; i++) {
            if (customer == customers[i] && customer.customerVehicle == null) {
                customer.customerVehicle = pickVehicleByCode(vehicleCode);
                customer.customerVehicle.setFreeToRental(false);
                System.out.println("The vehicle is successfully rented. Enjoy your trip!");
                return;
            }
            if (customer == customers[i] && customer.customerVehicle != null) {
                System.out.println("You already rent a vehicle. We can't rent more than one vehicle per customer.");
            }
        }
    }
    public void addNewCustomer(Customer customer) {
        if (customer.isLicenceToDrive() && !customer.getShopAccount() ) {
            customer.setShopAccount(true);
            for (int i = 0; i < customers.length; i++) {
                if (customers[i] == null) {
                    customers[i] = customer;
                    System.out.println("Thank you, we have just created your account, you can choose your vehicle.");
                    return;
                }
            }
        } System.out.println("Sorry, you can't rental a vehicle, you already have an account or you don't have a drive licence.");
    }
    public void getACar(String carModel, int gasConsumption, boolean freeToRental, int rentalPrice, int vehicleCode) {
        Car car = new Car(carModel, gasConsumption, freeToRental, rentalPrice, vehicleCode);
        for(int i = 0; i < shopVehicles.length; i++){
            if(shopVehicles[i] == null){
                shopVehicles[i] = car;
                break;
            }
        }
    }
    public void getAMotorcycle(String motoModel, int gasConsumption, boolean freeToRental, int rentalPrice, int vehicleCode){
       Motorcycle moto = new Motorcycle(motoModel, gasConsumption,freeToRental,rentalPrice,vehicleCode);
        for(int i = 0; i < shopVehicles.length; i++){
            if(shopVehicles[i] == null){
                shopVehicles[i] = moto;
                break;
            }
        }
    }
    public void checkReturnedCar(Vehicle vehicle) {
        if (vehicle.getGasLevel() < 20) {
            double priceMissingGas = ((20 - vehicle.getGasLevel()) * 2.5);
            System.out.println("The vehicle has less than 20L of fuel, you should pay " + priceMissingGas + "€");
            vehicle.setFreeToRental(true);
        } else {
            vehicle.setFreeToRental(true);
            System.out.println("The return of the vehicle is done.");
        }
    }
    public Vehicle pickVehicleByCode(int code){
        for (int i = 0; i < shopVehicles.length; i++) {
            if (shopVehicles[i].getVehicleCode() == code){
                if(shopVehicles[i].getFreeToRental()){
                    shopVehicles[i].setFreeToRental(false);
                    return shopVehicles[i];
                }else{
                    System.out.println("This car is not available, please choose another one.");
                }
            }
        }
        return null;
    }

}
