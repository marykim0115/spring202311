package exam05;

import java.util.Arrays;

public class Ex04 {
    public static void main(String[] args) {
        int[] nums1 = {10,20,30,40,50};
        int[] nums2 = {10,20,30,40,60};
        int index = Arrays.mismatch(nums1,nums2); //어느 지점에서 값이 다른지
        System.out.println(index);
    }
}
