package exercise;

import java.util.Map;

// BEGIN
class App {

    public static void swapKeyValue(KeyValueStorage map) {
        Map<String, String> map1 = map.toMap();

        for (Map.Entry<String, String> entry : map1.entrySet()) {
            map.set(entry.getValue(), entry.getKey());
            map.unset(entry.getKey());
        }
    }
}
// END