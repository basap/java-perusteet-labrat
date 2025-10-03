package viikko4.lab;

public class Car extends Vehicle {
    private Double avgSpeedKmh;

    public Car(String name, Double s) {
        super(name);
        if (s == null || s <= 0) {
            throw new IllegalArgumentException("Speed cannot be null or negative");
        }
        this.avgSpeedKmh = s;
    }

    public Double travelTimeHours(Double km) {
        if (km == null || km <= 0) {
            throw new IllegalArgumentException("Distance (km) cannot be null or negative");
        }
        return km / avgSpeedKmh;
    }
}