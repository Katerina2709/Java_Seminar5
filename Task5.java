package gb.javaproject;

import java.util.ArrayList;

public class Task5 {
    public static void main(String[] args) {
        PhoneBook myContacts = new PhoneBook();
        ArrayList<String> phoneNumbers = new ArrayList<>();
        myContacts.add("Антонов", "916-15-67");
        myContacts.add("Борисов", "939-15-85");
        myContacts.add("Васильева", "921-55-31");
        myContacts.add("Груздев", "921-90-53");
        myContacts.add("Долматова", "092-78-15");
        myContacts.add("Васильева", "985-46-02");
        myContacts.add("Груздев", "410-51-99");
        myContacts.add("Васильева", "320-43-24");
        phoneNumbers = myContacts.get("Груздев");
        System.out.println(phoneNumbers);
        phoneNumbers = myContacts.get("Борисов");
        System.out.println(phoneNumbers);
        phoneNumbers = myContacts.get("Васильева");
        System.out.println(phoneNumbers);


    }
}

