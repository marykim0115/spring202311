package exam02;

public class Outer {
    Calculator method(int num3) {
        return new Calculator() { //익명 내부 클래스
            public int add(int num1, int num2) {
               return num1 + num2 + num3;
            }
        };
    }

    /*
    void method() {
        class Inner { //메서드 안의 클래스
            void innerMethod() { //지역 내부 클래스
                System.out.println("지역 내부 클래스!!");
            }
        }

        Inner in = new Inner();
        in.innerMethod();
    } */
}
