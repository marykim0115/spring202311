import java.io.FileOutputStream;
import java.io.IOException;

public class Ex03_FileOutputStream {
    public static void main(String[] args) {
        try(FileOutputStream fos = new FileOutputStream("test2.txt")) {
            for(char ch = 'A' ; ch <= 'Z' ; ch++) {
                fos.write(ch);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
