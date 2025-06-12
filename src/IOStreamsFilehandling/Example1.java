package IOStreamsFilehandling;

import java.io.*;

public class Example1 {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        FileInputStream fis=new FileInputStream("C:\\codegnanfilehandling\\fileh1.txt");
        DataInputStream dos=new DataInputStream(fis);
        String data="";
        while((data=dos.readLine())!=null){
            System.out.println(data);
        }


    }
}
