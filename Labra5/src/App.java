import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        System.out.println("=== T1: WordCounter ===");
        String text = "  Hei   maailma  ! ";
        int wordCount = WordCounter.countWords(text);
        System.out.println("Sanojen määrä: \"" + text + "\" -> " + wordCount);

        System.out.println("\n=== T2: IntStats ===");
        List<Integer> numbers = List.of(1,2,3,10,-5);
        IntStats stats = new IntStats();
        System.out.println("Min: " + stats.min(numbers));
        System.out.println("Max: " + stats.max(numbers));
        System.out.println("Avg: " + stats.avg(numbers));

        System.out.println("\n=== T3: PhoneBook ===");
        PhoneBook pb = new PhoneBook();
        pb.add("Anna", "0501234567");
        pb.add("Pertti", "0507654321");
        System.out.println("Anna: " + pb.find("Anna"));
        System.out.println("Pertti: " + pb.find("Pertti"));
        System.out.println("Koko: " + pb.size());
        pb.add("Anna", "0456666943");
        System.out.println("Anna uusi: " + pb.find("Anna"));

        System.out.println("\n=== T4: Task&TaskUtils ===");
        List<Task> tasks = List.of(
            new Task("Tehtävä 1", Difficulty.EASY),
            new Task("Tehtävä 2", Difficulty.MEDIUM),
            new Task("Tehtävä 3", Difficulty.HARD),
            new Task("Tehtävä 4", Difficulty.EASY)
        );
        List<Task> easyTasks = TaskUtils.filterBy(tasks, Difficulty.EASY);
        System.out.println("Easy tasks:");
        for (Task t : easyTasks) {
            System.out.println(t);
        }

        System.out.println("\n=== T5: LetterFrequency ===");
        String sampleText = "Hello world asd asd";
        Map<Character,Integer> freq = LetterFrequency.frequencies(sampleText);
        System.out.println("Kirjainten frekvenssi:");
        for (Map.Entry<Character,Integer> entry : freq.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
