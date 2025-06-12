package IOStreamsFilehandling;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Example2 {
    public static void main(String[] args)  throws FileNotFoundException, IOException {
        String file1="C:\\codegnanfilehandling\\fileh2.txt";
        FileOutputStream fos=new FileOutputStream(file1);
        DataOutputStream dos=new DataOutputStream(fos);
        String data="python is a good programming language";
        dos.write(data.getBytes());
    }
}
