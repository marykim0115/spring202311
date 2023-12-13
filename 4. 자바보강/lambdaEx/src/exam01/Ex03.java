package exam01;

public class Ex03 {
    public static void main(String[] args) {
        Calculator cal = n ->  n * n;

        int result = cal.square(10);
        System.out.println(result);
    }
}
