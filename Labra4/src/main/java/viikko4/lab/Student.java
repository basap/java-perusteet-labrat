package viikko4.lab;
public class Student {
    private String name;
    private Integer credits;

    public Student(String n,Integer c) {
        if (n == null || n.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        } else if (c == null || c < 0) {
            throw new IllegalArgumentException("Credits cannot be null or negative");
        }
        this.name=n;
        this.credits=c;
    }

    public String getName() {
        return name;
    }

    public Integer getCredits() {
        return credits;
    }
}