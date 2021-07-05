package Factory;

// Nablus garage contains only a vehicles from motor type
public class NablusGarage extends CarRental {
    @Override
    public Vehicle createVehicle() {
        return new Motor();
    }
}
