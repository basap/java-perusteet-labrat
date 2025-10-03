package viikko4.lab;
public abstract class Vehicle {
    protected String name;

    public Vehicle(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        this.name=name;
    } 

    public abstract Double travelTimeHours(Double km);
}