package viikko4.lab;
public final class TravelUtils {
    private TravelUtils(){}

    public static Double sumTravelTimes(Vehicle[] arr, Double km) {
        if (arr == null) {
            throw new IllegalArgumentException("Array cannot be null");
        }
        if (km == null || km <= 0) {
            throw new IllegalArgumentException("Distance (km) cannot be null, zero or negative");
        }

        double sum = 0.0;
        for (Vehicle v : arr) {
            if (v != null) {
                sum += v.travelTimeHours(km);
            }
        }
        return sum;
    }
}