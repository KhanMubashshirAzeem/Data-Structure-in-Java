package HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapClass {
    // Syntax
    static void HashMapMethods() {
        Map<String, Integer> map = new HashMap<>();
        //Adding Element
        map.put("Akash", 24);
        map.put("Khan", 20);
        map.put("Uzeir", 18);
        map.put("Asim", 18);

        System.out.println(map.get("Khan"));
        System.out.println(map.get("Akas"));

        map.put("Akash", 25);
        System.out.println(map.get("Akash"));

        System.out.println(map.remove("Khan"));
        System.out.println(map.remove("Nazim"));

        System.out.println(map.containsKey("Khan"));
        System.out.println(map.containsKey("Asim"));

        if (!map.containsKey("Khan")) {
            map.put("Khan", 21);
            System.out.println(map.values());
        }

        map.putIfAbsent("mubashshir", 30);
        map.putIfAbsent("Khan", 20);

        // return only key
        System.out.println(map.keySet());
        // return only values
        System.out.println(map.values());
        // return key and values
        System.out.println(map.entrySet());

        System.out.println();
        for (String key : map.keySet()) {
            // %s and %d only support if you use printf
            System.out.printf("Age of %s is %d\n", key, map.get(key));      // Output code (1)
        }

        System.out.println();
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.printf("Age of %s is %d\n",e.getKey(), e.getValue());    // Output code (1)
        }

        System.out.println();
        for (var e : map.entrySet()){
            System.out.printf("Age of %s is %d\n",e.getKey(), e.getValue());    // Output code (1)
        }

    }

    public static void main(String[] args) {
        HashMapMethods();
    }
}
