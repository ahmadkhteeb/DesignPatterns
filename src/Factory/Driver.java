package Factory;

public class Driver {
    public static void main(String[] args) {
        CarRental ramallahCompany = new RamallahGarage();
        CarRental nablusCompany = new NablusGarage();
        Vehicle ahmadVehicle = ramallahCompany.rentCar("Ahmad");
        Vehicle ramiVehicle = nablusCompany.rentCar("Rami");

        System.out.println(ahmadVehicle.getName() + " have rented a vehicle from type " + ahmadVehicle.getType());
        System.out.println(ramiVehicle.getName() + " have rented a vehicle from type " + ramiVehicle.getType());
    }
}
