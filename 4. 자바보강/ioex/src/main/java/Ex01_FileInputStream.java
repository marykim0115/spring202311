import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex01_FileInputStream {
    public static void main(String[] args) {
        /*try(FileInputStream fis = new FileInputStream("test1.txt")) {
            char ch = (char)fis.read(); //1바이트 읽기  char(2,3) / 양의 정수
            System.out.println("ch = " + ch); // 'A' 반환

            ch = (char)fis.read(); //1바이트 읽기
            System.out.println("ch = " + ch);// 'B' 반환

            ch = (char)fis.read(); //1바이트 읽기
            System.out.println("ch = " + ch);// 'C' 반환

            ch = (char)fis.read(); //1바이트 읽기. 마지막 데이터
            System.out.println("ch = " + ch);// 'D' 반환

            int ch2 = fis.read(); //1바이트 읽기. 이후 데이터 없음
            System.out.println("ch = " + ch2);//  '-1' 반환
        } catch (IOException e) {
            e.printStackTrace();
        }*/

        try(FileInputStream fis = new FileInputStream("test1.txt")) {
            int ch = 0;
            while((ch = fis.read()) != -1) {
                System.out.print((char)ch);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
