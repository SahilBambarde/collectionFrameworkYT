package HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapBasics {
    public static void main(String[] args){
        //no order
        //no indexing
        //key value pair format
        //no duplicate key

        HashMap<String, String> captialMap = new HashMap<>();

        captialMap.put("India","New Delhi");
        captialMap.put("USA","Washington DC");
        captialMap.put("UK","London");
        captialMap.put("UK","London11");
        captialMap.put(null,"Berlin");
        captialMap.put(null,"LA");
        captialMap.put("Russia",null);
        captialMap.put("France",null);


        System.out.println(captialMap.get("USA"));
        //Washington


        System.out.println(captialMap.get("Germany"));
        //null


        System.out.println(captialMap.get("UK"));
        //London11


        System.out.println(captialMap.get(null));



        // HashMap can store only one null key value




        System.out.println(captialMap.get("France"));



        //HashMap is not thread-safe


        // Iterator over the keys
        Iterator<String> it = captialMap.keySet().iterator();
        while(it.hasNext()){
            String key = it.next();
            String value = captialMap.get(key);
            System.out.println(key+" : "+value);
        }



        Iterator<Map.Entry<String,String>> it1 = captialMap.entrySet().iterator();
        while(it1.hasNext()){
            Map.Entry<String,String> entry =it1.next();
            System.out.println(entry.getKey() +" : "+entry.getValue());
        }



        captialMap.remove("France");




        //Iterator HashMap ...using forEach lambda
        captialMap.forEach((k,v)->System.out.println(k+" "+v));






    }
}
