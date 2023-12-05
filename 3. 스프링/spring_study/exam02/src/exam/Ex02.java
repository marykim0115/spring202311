package exam;

public class Ex02 {
    public static void main(String[] args) {
        C c = new C();
        A a = new D();

        if(a instanceof C){
            C c2= (C)a; //a에 D객체가 담겨서 C로 형변환이 안됨
        }
    }
}
