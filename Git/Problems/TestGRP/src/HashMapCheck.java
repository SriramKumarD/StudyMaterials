import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class HashMapCheck {
    static Map<String, Boolean> map;
    static Map<String, Boolean> map2;
    static List<Map<String, Boolean>> objMap;

    public static void main(String[] args) {

        map = new HashMap<>();
        map.put("1", true);
        map.put("2", false);

        map2 = new HashMap<>();
        map2.put("4", true);
        map2.put("5", true);
        objMap = new ArrayList<>();
        objMap.add(map);
        objMap.add(map2);
        
        List<String> list = new ArrayList<String>();
        list.add("dd");
        list.add("dd");
        Map<String, Boolean> result = objMap.stream().flatMap(x -> x.entrySet().stream()).filter(Map.Entry::getValue).
                collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        
        System.out.println(result);
        
        
        Student s1 = new Student(12,"tt");
        Student s2 = new Student(13,"tt1");
        Student s3 = new Student(14,"tt2");
        
        
        List<Student> sList = new ArrayList<Student>();
        
        sList.add(s1);
        sList.add(s2);
        sList.add(s3);
        

        		
        		
        int st1 = 	sList.stream().filter(st -> "tt1".equals(st.getName())).findAny().get().getId();
        System.out.println(st1);



    }
}