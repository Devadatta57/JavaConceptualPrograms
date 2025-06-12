package Filehandling;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Locale;

public class fileinputStream {
    public static void main(String[] args)throws IOException {
        FileInputStream fis=new FileInputStream("C:\\codegnanfilehandling\\java1.txt");
        DataInputStream dos=new DataInputStream(fis);
        String n="";
        while((n=dos.readLine())!=null){
            System.out.println(n.toLowerCase()+n.length());

        }



    }
}
