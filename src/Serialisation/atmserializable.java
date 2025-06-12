package Serialisation;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class atmserializable {
    public static void main(String[] args)throws IOException {
        FileOutputStream fos=new FileOutputStream("C:\\codegnanfilehandling\\atm.txt");
        Atmcard card=new Atmcard(125,4556456,678768);
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(card);

    }
}
