package IOStreamsFilehandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterPractise {
    public static void main(String[] args) throws IOException {
        FileWriter fi=new FileWriter("C:\\codegnanfilehandling\\fw1");
        String data="rats dfsdf dzcdz sdzfdzx sdcdfcx ";
        fi.write(data);
        fi.flush();
        fi.close();
    }
}
