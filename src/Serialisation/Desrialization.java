package Serialisation;

import javax.xml.crypto.Data;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Desrialization {
    public static void main(String[] args) throws IOException {
        try {
            FileInputStream fis = new FileInputStream("C:\\codegnanfilehandling\\atm.txt");
            ObjectInputStream dis = new ObjectInputStream(fis);
            Atmcard card = (Atmcard) dis.readObject();
            System.out.println(card);
        }
        catch(ClassNotFoundException e){
            System.out.println(e);
        }
    }
}
