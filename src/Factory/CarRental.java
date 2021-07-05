package Factory;

// Factory abstract class
public abstract class CarRental {
    public Vehicle rentCar(String name){
        Vehicle car;
        car = createVehicle();
        car.reserveVehicle();
        car.setName(name);
        return car;
    }

    // Factory method
    public abstract Vehicle createVehicle();
}
