public class Customer {

    private String name;
    private int age;
    private boolean licenceToDrive;
    private boolean shopAccount;
    public Vehicle customerVehicle;

    public Customer(String name, int age, boolean licenceToDrive) {
        this.name = name;
        this.age = age;
        this.licenceToDrive = licenceToDrive;
        this.shopAccount = false;
    }
    public void requestVehiclesOptions(Shop shop){
        shop.showVehiclesOptions();
    }
    public void askToRental(Shop shop,int vehicleCode){
        shop.rentVehicle(vehicleCode,this);
    }
    public void createAccountOnShop(Shop shop) {
        shop.addNewCustomer(this);
    }
    public void returnCarToShop(Shop shop){
        shop.checkReturnedCar(this.customerVehicle);
        this.customerVehicle = null;
    }
    public int getAge() {
        return age;
    }
    public boolean isLicenceToDrive() {
        return licenceToDrive;
    }
    public boolean getShopAccount() {
        return shopAccount;
    }

    public void setShopAccount(boolean shopAccount) {
        this.shopAccount = shopAccount;
    }
}
