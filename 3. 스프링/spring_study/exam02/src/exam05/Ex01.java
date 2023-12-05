package exam05;

import exam05.Calculator;

public class Ex01 {
    public static void main(String[] args) {
        SimpleCalculator cal = new SimpleCalculator();
        int result = cal.add(10,20);
        System.out.println(result);

        System.out.println(Calculator.num);

        int result2 = cal.minus(20,10);
        System.out.println(result2);

    }
}
