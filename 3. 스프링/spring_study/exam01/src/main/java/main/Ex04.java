package main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ex04 { //FileNotFoundException 발생시키는 예제
    public static void main(String[] args) {
        //컴파일시 체크되는 예외 -> 예외처리가 없으면 컴파일 안됨

        FileInputStream fis = new FileInputStream("abc.txt");

    }
}
