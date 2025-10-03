package viikko4.lab;

public class Book {
    private String title, author;
    private Integer year;

    public Book(String t, String a, Integer y) {
        if (t == null || t.trim().isEmpty()) {
            throw new IllegalArgumentException("Title cannot be null or empty");
        } else if (a == null || a.trim().isEmpty()) {
            throw new IllegalArgumentException("Author cannot be null or empty");
        } else if (y == null || y < 0) {
            throw new IllegalArgumentException("Year cannot be null or negative");
        }
        this.title = t;
        this.author = a;
        this.year = y;
    }

    public String label() {
        return author + ": " + title + " (" + year + ")";
    }
}