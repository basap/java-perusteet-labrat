package viikko4.lab;

public class Person {
    private String name;
    private Integer age;

    public Person(String name, Integer age) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        } else if (age == null || age < 0) {
            throw new IllegalArgumentException("Age cannot be null or negative");
        }
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }
}