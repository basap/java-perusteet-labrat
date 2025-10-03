package viikko4.lab;
import java.util.LinkedList;
public class StudentRegister {
    private LinkedList<Student> students = new LinkedList<>();

    public void add(String n, Integer c) {
        Student s = new Student(n,c);
        students.add(s);
    }

    public LinkedList<Student> searchByName(String q) {
        LinkedList<Student> results = new LinkedList<>();
        if (q == null || q.trim().isEmpty()) {
            return results;
        }
        String query = q.trim().toLowerCase();
        for (Student s : students) {
            if (s.getName().toLowerCase().contains(query)) {
                results.add(s);
            }
        }
        return results;
    }

    public LinkedList<Student> searchCreditsLessThan(int x) {
        LinkedList<Student> results = new LinkedList<>();
        for (Student s : students) {
            if (s.getCredits() < x) {
                results.add(s);
            }
        }
        return results;
    }

    public LinkedList<Student> searchCreditsGreaterOrEqual(int x) {
        LinkedList<Student> results = new LinkedList<>();
        for (Student s : students) {
            if (s.getCredits() >= x) {
                results.add(s);
            }
        }
        return results;
    }
}