package Factory;

// Product abstract class
public abstract class Vehicle {
    private String color;
    private String productionDate;
    private String name;
    private boolean reserved = false;
    protected String type;

    public Vehicle(String color, String productionDate){
        this.color = color;
        this.productionDate = productionDate;
    }

    public void reserveVehicle(){
        this.reserved = true;
    }
    public void unreserveVehicle(){
        this.reserved = false;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public String getType(){
        return this.type;
    }
}
