package ua.com.kneu.groupe_201.example1;

import java.util.HashMap;
import java.util.Map;

public class MyMap {

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();

        map.put(1, "C#");
        map.put(2, "Java");
        map.put(3, "Python");
        map.put(4, "C++");
        System.out.println(map);

        System.out.println(map.get(2));

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        map.remove(3);
        System.out.println(map);


    }


}
