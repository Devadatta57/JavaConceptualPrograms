package IOStreamsFilehandling;

import java.io.*;

public class Example1prac {
    public static void main(String[] args)throws FileNotFoundException, IOException {
        FileOutputStream fos=new FileOutputStream("C:\\codegnanfilehandling\\file11");
        DataOutputStream fis=new DataOutputStream(fos);
        String data="hare rama hare krishna krishna krishna hare hare";
       fos.write(data.getBytes());
       fos.flush();
       fos.close();

    }
}
