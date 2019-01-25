package designpatterns.exercises.decorator.extratask;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LowercaseFileReader {
    public static void main(String[] args) {
        int c; try {
            InputStream in =
                        new BufferedInputStream(
                                new FileInputStream("README.md"));
            while((c = in.read()) >= 0) { System.out.print((char)c);
            }
            in.close();
        } catch (IOException e) {
            e.printStackTrace(); }
    }
}
