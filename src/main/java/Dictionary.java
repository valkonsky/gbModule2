import java.util.*;

public class Dictionary {

    public static Map<String,Integer> getUniqueValues(List<String> words){
        Map<String,Integer> values = new HashMap();
        for (int i=0;i<words.size();i++){
            values.put((String) words.get(i),0);
        }return values;
    }

    public static Map<String,Integer> getCountOfValues(List<String> words){
        Map<String,Integer> values = new HashMap();
        for (int i=0;i<words.size();i++){
            Integer count = values.getOrDefault(words.get(i),0);
            values.put(words.get(i),++count);
        }return values;
    }
}
