package ua.com.kneu.groupe_204.unit1;

import java.util.HashMap;
import java.util.Map;

public class MyMap {

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap();

        map.put(1, "C#");
        map.put(2, "Java");
        map.put(3, "Python");
        map.put(4, "C++");

        for (Map.Entry<Integer, String> el : map.entrySet()) {
            System.out.println(el.getKey() + " " + el.getValue());
        }

        System.out.println(map.get(3));

        map.remove(3);




    }


}
