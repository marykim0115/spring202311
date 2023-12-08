package exam04;

public class Ex01 {
    public static void main(String[] args) {
        Student s1 = new Student(1001, "이름1", "과목1");
        System.out.println(s1);

        Student s2 = new Student(1002, "이름2", "과목2");
        System.out.println(s1);
        System.out.println(s2);

        Student s3 = s2;
        s3.id = 1003;
        s3.name = "이름3";
        s3.subject = "과목3";
        System.out.println(s2); //s3이 s2의 주소를 참조하기 때문에, s2의 값도 변경된다.
        System.out.println(s3);

        s1 = null; //주소가 비어지게됨. 즉, 참조가 끊김. 연결이 끊김. s1을 통해서 자원에 연결되지 못함.
        //참조가 끊기면 garbage collector가 끊어진 자원을 청소한다. 참조가 끊기면 더이상 필요없기때문에 치워짐.
        System.out.println(s1);

    }
}
