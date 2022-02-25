import java.util.*;

public class Dictionary {

    List<String> words;

    Dictionary(List<String> words){
        this.words = words;
    }

    public Set getUniqueValues(){
        Set values = new HashSet(words);
        return values;
    }

    public Map<String,Integer> getCountOfValues(){
        Map<String,Integer> values = new HashMap();

        for (int i=0;i<words.size();i++){
            Integer count = values.getOrDefault(words.get(i),0);
            values.put(words.get(i),++count);
        }return values;
    }
}
