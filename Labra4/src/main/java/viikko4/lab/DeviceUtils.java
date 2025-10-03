package viikko4.lab;
public class DeviceUtils {
    private DeviceUtils(){}
    public static int averageBattery(Device[] ds) {
        if (ds == null || ds.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }

        int sum = 0;
        int count = 0;

        for (Device d : ds) {
            if (d != null) {
                sum += d.batteryPercent();
                count++;
            }
        }

        if (count == 0) {
            throw new IllegalArgumentException("No devices in array");
        }

        return sum / count;
    }
}