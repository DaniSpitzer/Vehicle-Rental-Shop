import javax.swing.table.TableRowSorter;

public class Main {

    public static void main(String[] args) {

        Shop europcar = new Shop("Europcar");
        Customer customer1 = new Customer("Pablo", 20,true);
        Customer customer2 = new Customer("Gustavo", 17,false);
        Customer customer3 = new Customer("Joana", 28,true);
        Customer customer4 = new Customer("Filipa", 22,true);


        europcar.getACar("Punto",10,true,80,21);
        europcar.getACar("Tesla",8,true,1000,13);
        europcar.getACar("Opel",9,true,75,60);
        europcar.getACar("C3",9,true,80,17);
        europcar.getAMotorcycle("Honda CB",2, true,30,8);


       customer1.createAccountOnShop(europcar);
       customer1.createAccountOnShop(europcar);
       customer1.requestVehiclesOptions(europcar);
       customer1.askToRental(europcar,8);
       customer1.customerVehicle.drive(5,1);
       System.out.println(customer1.customerVehicle.getGasLevel());
       customer1.customerVehicle.drive(20,1);
       System.out.println(customer1.customerVehicle.getGasLevel());
       customer1.customerVehicle.refuel(10);
       System.out.println(customer1.customerVehicle.getGasLevel());
       customer1.customerVehicle.drive(46,4);
       System.out.println(customer1.customerVehicle.getGasLevel());
       customer1.customerVehicle.drive(1,4);
       customer1.returnCarToShop(europcar);
       customer2.askToRental(europcar,8);

    }
}
