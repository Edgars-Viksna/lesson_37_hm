import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("--------- Task 1 ----------------");
        Map testMap = new HashMap<>();
        testMap.put("jack", 10);
        testMap.put("john", 5);

        task1(testMap, "jack", "john");
        System.out.println(testMap);

        System.out.println("--------- Task 2 ----------------");
        Map forTask2 = new HashMap<>();
        forTask2.put("jack", "qwer13");
        forTask2.put("john", "zxc45");
        System.out.println(mapToString(forTask2));


    }

    public static void task1(Map<String, Integer> map, String key1, String key2) {
        if (map.containsKey(key1) && map.containsKey(key2)) {
            String keyResult = key1 + "_" + key2;
            Integer valueResult = map.get(key1) + map.get(key2);
            map.put(keyResult, valueResult);
        }
    }

    public static List<String> mapToString(Map<String, String> map) {
        List<String> result = new ArrayList<>();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            result.add(new StringBuilder().append(entry.getKey()).append(":").append(entry.getValue()).toString());
        }
        return result;
    }
}