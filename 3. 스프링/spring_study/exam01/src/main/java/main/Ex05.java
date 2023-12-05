package main;
//예외처리 목적 : 서비스 중단을 막기 위한 처리
//실행이 되려면 컴파일이 필요함. RuntimeException은 예외처리를 하지 않아도 컴파일은 된다.
public class Ex05 { //ArithmeticException -> RuntimeException : 실행 중 체크되는 예외
    public static void main(String[] args) {
        try{
        int num1 = 10;
        int num2 = 0;
        int result = num1/num2; //throw new ArithmeticException();

        } catch (ArithmeticException e) { // =new ArithmeticException();
            e.printStackTrace();
            System.out.println("예외처리");
        }
        System.out.println("매우 중요한 코드");
    }
}
