package viikko4.lab;
public class Phone extends Device implements Rechargeable {
    private int battery;
    public Phone(String name,Integer b) {
        super(name);
        if (b == null || b < 0 || b > 100) {
            throw new IllegalArgumentException("Battery must be between 0 and 100");
        }
        this.battery = b;
    }

    public void use(Integer minutes) {
        if (minutes == null || minutes < 0) {
            throw new IllegalArgumentException("Minutes cannot be null or negative");
        }
        int decrease = minutes / 5;
        battery -= decrease;
        if (battery < 0) {
            battery = 0;
        }
    }

    @Override
    public void recharge(Integer minutes) {
        if (minutes == null || minutes < 0) {
            throw new IllegalArgumentException("Minutes cannot be null or negative");
        }
        int increase = minutes / 2;
        battery += increase;
        if (battery > 100) {
            battery = 100;
        }
    }
    
    @Override
    public Integer batteryPercent() {
        return battery;
    }
}