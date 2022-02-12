import java.util.*;

public class PhoneBook {

    Map<String,ArrayList<String>> book;

    PhoneBook(){
        book = new HashMap<>();
    }

     void add(String name, String phone){
        if (book.containsKey(name)){
            ArrayList <String> values = book.get(name);
            values.add(phone);
            book.put(name,values);
        }else{
            book.put(name, new ArrayList<>(Arrays.asList(phone)));
        }
    }

    ArrayList<String> get(String name){
        ArrayList answer = new ArrayList();
        if (book.containsKey(name)){
           answer = book.get(name);
        }else{
            System.out.println("");
        }return answer;
    }
}
