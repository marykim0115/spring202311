package exam04;

public abstract class Calculator { //abstract - 추상 클래스
    int num = 10;
    public abstract int add (int num1, int num2); //추상 메서드 (abstract 선언해야함)

    public void commonMethod() {
        System.out.println("하위 클래스의 공통 기능");
    }
}
