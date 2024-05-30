package HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapConcept {
    public static void main(String[] args){
        Map<String,Integer> marks = new HashMap<String,Integer>();
        marks.put("Nav",100);
        marks.put("Tom",200);
        marks.put("Lisa",300);
        marks.put("Peter",400);
        marks.put("Nave",600);

        marks.put(null,500);
        marks.put(null,700);
        marks.put("Nav",900);



        //hashing:
        //Object class -> hashCode() mehtod()
        //16 buckets
        //Node<Key,Value> , key , value , Node<K,V> next

        
    }
}
