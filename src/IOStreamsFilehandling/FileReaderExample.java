package IOStreamsFilehandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
    public static void main(String[] args) throws FileNotFoundException , IOException {
        FileReader fir=new FileReader("C:\\codegnanfilehandling\\fileh2.txt");
        int ch=0;
        while((ch=fir.read())!=-1){
            System.out.print((char)ch);
        }

    }
}
