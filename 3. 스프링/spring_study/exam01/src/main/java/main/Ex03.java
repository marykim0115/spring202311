package main;

import java.util.Arrays;

public class Ex03 {
    public static void main(String[] args) {
        int result = add(10,20);
        int result2 = add(10,20,30,40);
        System.out.println(result);
        System.out.println(result2);
    }
    public static int add(int...  nums){
        /*
        int total = 0;
        for(int num : nums){
            total += total;
        }
        return total;
         */
        int total = Arrays.stream(nums).sum();
        return total;
    }


}
