package IOStreamsFilehandling;

import java.io.DataInputStream;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("C:\\codegnanfilehandling\\govinda.txt");
        String data = "sri krishna govinda hare murari";
      //  char[] ch = data.toCharArray();

        fw.write(data);

       fw.flush();
       fw.close();
    }
}
