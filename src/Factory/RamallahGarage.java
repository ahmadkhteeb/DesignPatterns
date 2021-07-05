package Factory;

// Ramallah garage contains only vehicles from car type
public class RamallahGarage extends CarRental {

    @Override
    public Vehicle createVehicle() {
        return new Car();
    }
}
