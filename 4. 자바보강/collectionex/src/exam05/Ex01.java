package exam05;

import java.util.Arrays;
import java.util.List;

public class Ex01 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("이름1", "이름2", "이름3");
        // names.add("이름4"); -> List<>에는 값 추가가 되지 않음. List<>는 static이기 때문
        System.out.println(names);

        int[] nums = new int[10];
        Arrays.fill(nums,1); //배열의 모든 요소를 지정된 값으로 채우는 메서드
        System.out.println(Arrays.toString(nums));
    }
}
