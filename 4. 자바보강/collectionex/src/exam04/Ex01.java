package exam04;

import java.util.*;

public class Ex01 {
    public static void main(String[] args) {
        //HashMap<String, String> members = new HashMap<>();
        TreeMap<String, String> members = new TreeMap<>(Comparator.reverseOrder());
        /* TreeMap<> : 키 자료형의 Comparable 인터페이스
            대안 정렬 기준 java.util.Comparator 인터페이스 */
        members.put("user01", "김이름");
        members.put("user02", "이이름");
        members.put("user03", "박이름");

        //members.put("user02", "(수정)이이름"); //수정됨
        //members.remove("user02"); //삭제됨

        //String name = members.get("user02"); //마지막 수정 사항이 들어가게 됨
        //System.out.println(name);

        Set<Map.Entry<String, String>> entries = members.entrySet();

        for(Map.Entry<String, String> entry : entries){
            System.out.printf("key=%s, value=%s%n", entry.getKey(), entry.getValue());
        }

        Set<String> keys = members.keySet();
        Collection<String> values = members.values();

        System.out.println(keys);
        System.out.println(values);
    }
}
