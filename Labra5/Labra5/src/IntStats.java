import java.util.List;

public class IntStats {
    public int min(List<Integer> luvut) {
        if (luvut == null || luvut.isEmpty()) return 0;

        int min = luvut.get(0);
        for (int i = 1; i < luvut.size(); i++) {
            if (luvut.get(i) < min) {
                min = luvut.get(i);
            }
        }
        return min;
    }

    public int max(List<Integer> luvut) {
        if (luvut == null || luvut.isEmpty()) return 0;

        int max = luvut.get(0);
        for (int i = 1; i < luvut.size(); i++) {
            if (luvut.get(i) > max) {
                max = luvut.get(i);
            }
        }
        return max;
    }

    public double avg(List<Integer> luvut) {
        if (luvut == null || luvut.isEmpty()) return 0;

        double sum = 0;
        for (int i = 0; i < luvut.size(); i++) {
            sum += luvut.get(i);
        }
        double average = sum / luvut.size();
        average = Math.round(average * 100.0) / 100.0;
        return average;
    }
}
