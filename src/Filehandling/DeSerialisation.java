package Filehandling;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerialisation {
    public static void main(String[] args)throws IOException,ClassNotFoundException {

        FileInputStream fis=new FileInputStream("C:\\codegnanfilehandling\\pracatm.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
        ATMCard card=(ATMCard) ois.readObject();
        System.out.print(card);

    }
}
