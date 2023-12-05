package exam03;

import exam.A;

public class Human extends Animal {
    @Override
    public void move() {
        System.out.println("두 발로 직립 보행한다");
    }
    public void readBook() {
        System.out.println("책을 읽는다.");
    }

}
