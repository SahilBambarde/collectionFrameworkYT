package ArrayListConcepts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronizedArrayList {
    public static void main(String[] args){
        List<String> namesList =Collections.synchronizedList(new ArrayList<String>());

        namesList.add("java");
        namesList.add("python");
        namesList.add("ruby");


        synchronized(namesList){
            Iterator<String> it = namesList.iterator();
            while(it.hasNext()){
                System.out.println(it.next());
            }
        }



        // copyOnWriteArrayList


        CopyOnWriteArrayList<String> empList = new CopyOnWriteArrayList<String>();
        empList.add("Tom");
        empList.add("Steve");
        empList.add("Naveeb");


        Iterator<String> it = empList.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }



        // linkedHashSet





    }
}
