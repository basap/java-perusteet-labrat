package viikko4.lab;

public class Thermometer implements Measurable {
    private Double celsius;

    public Thermometer(Double c) {
        if (c == null) {
            throw new IllegalArgumentException("Celsius cannot be null");
        }
        this.celsius=c;
    }

    public Double measure() {
        return celsius; 
    }
}