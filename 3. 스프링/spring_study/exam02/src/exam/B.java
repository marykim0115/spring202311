package exam;

public class B extends A{
    int numB= 20;
    public B(){
        super(); // = A의 기본 생성자 메서드 -> super()로 상속이 가능하게 됨. 없으면 동작하지 않음
        System.out.println("B 생성자");
    }
}
