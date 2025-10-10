import java.util.ArrayList;
import java.util.List;

public class TaskUtils {
    public static List<Task> filterBy(List<Task> tasks, Difficulty d) {
        List<Task> filtered = new ArrayList<>();

        for (int i = 0; i < tasks.size(); i++) {
            Task t = tasks.get(i);
            if (t.getDifficulty() == d) {
                filtered.add(t);
            }
        }
        return filtered;
    }
}
