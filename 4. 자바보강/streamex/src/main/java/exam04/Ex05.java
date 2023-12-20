package exam04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex05 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("이름1", "이름2", "이름3", "이름4", "이름5");

        Set<String> names2 = names.stream().collect(Collectors.toSet());
        System.out.println("names2 = " + names2);

        ArrayList<String> names3 = names.stream().collect(Collectors.toCollection(ArrayList::new));
    }
}
