package practice;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class test {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            throwEx();
        } catch (Exception e) {
            e.printStackTrace();
        }
        RandomAccessFile raf = new RandomAccessFile("1.txt","rw");
    }
    static void throwEx() throws Exception {

    }
}
