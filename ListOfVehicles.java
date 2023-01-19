public enum ListOfVehicles {
    PUNTO("Car","Punto",10,21, 80),
    TESLA("Car","Tesla",8,13, 1000),
    OPEL("Car","Opel",9,60, 75),
    C3("Car","C3",9,17,80),
    HONDA_CB("Moto", "CB", 2, 8, 30);


    private String vehicleModel;
    private int gasConsumption;
    private String type;
    private int rentalPrice;
    private int vehicleCode;


    ListOfVehicles(String type,String vehicleModel, int gasConsumption, int vehicleCode, int rentalPrice) {
        this.type = type;
        this.vehicleModel = vehicleModel;
        this.gasConsumption = gasConsumption;
        this.vehicleCode = vehicleCode;
        this.rentalPrice = rentalPrice;
    }

    @Override
    public String toString() {
        return
                " Type: " + type + "" +
                " Vehicle Model: " + vehicleModel + " " +
                " Gas Consumption: " + gasConsumption + "Km/L" + "" +
                " Rental Price: " + rentalPrice + "€" + "" +
                " Vehicle Code: " + vehicleCode + "" +
                '}';
    }
}
