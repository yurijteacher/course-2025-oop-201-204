package ua.com.kneu.groupe_202;

import java.util.HashMap;
import java.util.Map;

public class MyMap {

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();

        map.put(1, "Java");
        map.put(2, "Python");
        map.put(3, "C#");

        System.out.println(map.get(0));

        map.remove(2);
        System.out.println(map);

        for (Map.Entry<Integer, String> el : map.entrySet()) {
            System.out.println(el.getKey() + " " + el.getValue());
        }




    }

}
