package ex_30_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Lab232_Throws {
    public static void main(String[] args) {

    }

    static void t() throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("C://a.txt");
    }
}
