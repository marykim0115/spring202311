import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex02_FileInputStream {
    public static void main(String[] args) {
        try(FileInputStream fis = new FileInputStream("test1.txt")) {
            while(fis.available() > 0) {
                System.out.println("fis.read() = " + (char)fis.read());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
