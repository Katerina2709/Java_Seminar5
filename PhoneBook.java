package gb.javaproject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class PhoneBook {
    private static HashMap<String, ArrayList<String>> contacts;
    public PhoneBook() {
        contacts = new HashMap<>();
    }
    public void add(String name, String number) {
        if (contacts.containsKey(name)) {
            contacts.get(name).add(number);
        } else {
            ArrayList<String> numbers = new ArrayList<>();
            numbers.add(number);
            contacts.put(name, numbers);
        }
    }
    public ArrayList<String> get(String name) {
        return contacts.get(name);
    }
}
