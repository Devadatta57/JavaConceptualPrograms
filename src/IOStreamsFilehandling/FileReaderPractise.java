package IOStreamsFilehandling;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderPractise {
    public static void main(String[] args) throws IOException {
        FileReader fr=new FileReader("C:\\codegnanfilehandling\\fw1");
         int  ch=0;
        while((ch=fr.read())!=-1){
            System.out.print((char)ch);
        }

    }
}
