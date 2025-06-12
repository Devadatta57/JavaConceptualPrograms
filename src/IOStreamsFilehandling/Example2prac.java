package IOStreamsFilehandling;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Example2prac {
    public static void main(String[] args) throws  IOException {
        FileInputStream fis=new FileInputStream("C:\\codegnanfilehandling\\file11");
        DataInputStream dis=new DataInputStream(fis);
        String n="";
        while((n=dis.readLine())!=null){
            System.out.print(n+" ");
        }

    }
}
