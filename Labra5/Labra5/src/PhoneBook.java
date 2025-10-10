import java.util.HashMap;

public class PhoneBook {
    private HashMap<String,String> entries;
    public PhoneBook() {
        entries = new HashMap<>();
    }

    public void add(String name, String number) {
        entries.put(name,number);
    }

    public String find(String name) {
        return entries.get(name);
    }

    public int size() {
        return entries.size();
    }
}
