package exam;

public class C extends B {
    int numC= 30;

    public C(){
        super(); // = B의 기본 생성자 메서드
        System.out.println("C 생성자");
    }
}
