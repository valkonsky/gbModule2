import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>(Arrays.asList("cat","dog","lion",
                                                            "elephant","gepard","fish",
                                                            "fish","cat","dog","dog"));

       //System.out.println(Dictionary.getUniqueValues(words).keySet());
       //System.out.println(Dictionary.getCountOfValues(words));

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("olga", "89233443344");
        phoneBook.add("alice", "89339853344");
        phoneBook.add("alice", "893392345378344");

        System.out.println(phoneBook.get("alice"));
    }


}
