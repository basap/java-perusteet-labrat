package viikko4.lab;
public abstract class Device {
    protected String name;
    public Device(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        this.name=name;
    }
    
    public abstract Integer batteryPercent();
}