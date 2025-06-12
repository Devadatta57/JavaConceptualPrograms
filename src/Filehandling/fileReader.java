package Filehandling;

import java.io.FileReader;
import java.io.IOException;

public class fileReader {
    public static void main(String[] args) throws IOException {
        FileReader fr=new FileReader("C:\\codegnanfilehandling\\java2.txt");
        int ch=0;
        while((ch=fr.read())!=-1){
            System.out.print((char)ch+" ");
            System.out.println();
        }
    }
}
