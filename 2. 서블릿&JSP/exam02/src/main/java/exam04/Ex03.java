package exam04;

public class Ex03 {
    public static void main(String[] args) {
        Book3 b1 = new Book3("제목3","저자3","출판사3");
        System.out.printf("title=%s, author=%s, publisher=%s%n",
                b1.title(), b1.author(), b1.publisher());

        System.out.println(b1);
    }
}

