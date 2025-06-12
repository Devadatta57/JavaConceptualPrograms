package Filehandling;

import java.io.*;

public class Serialisation {
    public static void main(String[] args) throws IOException {
        FileOutputStream fis=new FileOutputStream("C:\\codegnanfilehandling\\pracatm.txt");
        ATMCard card=new ATMCard(12,454,4545);
        ObjectOutputStream ois=new ObjectOutputStream(fis);
        ois.writeObject(card);

    }
}
