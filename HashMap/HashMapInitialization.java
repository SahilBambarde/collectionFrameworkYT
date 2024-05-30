package HashMap;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HashMapInitialization {
    public static Map<String,Integer> marksMap;
    static{
        marksMap = new HashMap<>();
        marksMap.put("A",100);
        marksMap.put("B",200);
    }
    public static void main(String[] args){
        // using hashmap class
        HashMap<String,String> map1= new HashMap<>();

        //using map inteface- top casting
        Map<String,String> map2 = new HashMap<>();

        //2 static hashmap
        System.out.println(HashMapInitialization.marksMap.get("A"));
        //100




        //3 immutable map with only one single entry
        Map<String, Integer> map3=Collections.singletonMap("test",100);
        System.out.println(map3.get("test"));
        //100
//        map2.put("Abc",200);
        //java.lang.UnsupportedOperationException




        //4 JDK 1.8
        // creating a 2d array of strings using stream and collecting the form map
        Map<String,String> map4 = Stream.of(new String[][]{
                {"Tom","A Grade"},
                {"Naveen","A+ Grade"}
        }).collect(Collectors.toMap(data->data[0],data->data[1]));
        System.out.println(map4.get("Tom"));
        map4.put("Lisa","A++ Grade");
        System.out.println(map4.get("Lisa"));



        //using simpleEntry
        Map<String,String> map5 = Stream.of(
                new AbstractMap.SimpleEntry<>("Naveen","Java"),
                new AbstractMap.SimpleEntry<>("Tom","Python")
        ).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
        System.out.println(map5.get("Naveen"));
        map5.put("Lisa","C#");
        System.out.println(map5.get("Lisa"));



        //JDK 1.9
        //Empty map:
        Map<String,String> emptyMap = Map.of();
//        emptyMap.put("Tom","Python");
        System.out.println(emptyMap.get("Tom"));
        //java.lang.UnsupportedOperationException


        Map<String,String> singleonMap = Map.of("k1","v1");
        System.out.println(singleonMap.get("k1"));
//        singleonMap.put("k2","v2");
        //java.lang.UnsupportedOperationException



        //multi value map:
        //maximum 10 pairs only
        Map<String,String> multiMap =Map.of("k1","v1","k2","v2","k3","v3");
        System.out.println(multiMap.get("k3"));
        //v3




        //ofEntries method:
        // no limitation of pairs(key-value)
        Map<String,Integer> map7 = Map.ofEntries(
                new AbstractMap.SimpleEntry<>("A",100),
                new AbstractMap.SimpleEntry<>("B",200),
                new AbstractMap.SimpleEntry<>("C",300)
        );
        System.out.println(map7.get("C"));
//        map7.put("D",400);
        //java.lang.UnsupportedOperationException




    }
}
