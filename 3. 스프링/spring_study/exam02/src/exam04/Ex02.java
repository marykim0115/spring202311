package exam04;

import java.sql.SQLOutput;

public class Ex02 {
    public static void main(String[] args) {
        // 추상 클래스 생성자 선언하자마자-> 메서드 재정의 => 객체 생성이 가능함
        Calculator cal = new Calculator() {
            @Override
            public int add(int num1, int num2) {
                return num1 + num2;
            }
        };

        int result = cal.add(10,20);
        System.out.println(result);
    }
}
