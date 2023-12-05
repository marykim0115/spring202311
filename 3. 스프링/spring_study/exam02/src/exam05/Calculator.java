package exam05;

public interface Calculator {
    int num = 10; //인터페이스에 정의된 변수는 정적 상수임. 컴파일시 public static final이 선언됨
    int add(int num1, int num2); //추상메서드
    //인터페이스는 컴파일러가 메서드에 public abstract를 자동으로 선언해줌. 즉 자동 추상메서드가 됨
    //protected 사용 불가함. 이미 public이 선언되어있는 상태임

    default int minus(int num1, int num2){
        //인터페이스의 메서드 앞에 default 붙여주면 메서드 생성 가능
        return num1-num2;
    }
}
