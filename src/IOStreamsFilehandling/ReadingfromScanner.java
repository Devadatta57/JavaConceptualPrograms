package IOStreamsFilehandling;
import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
//reading from scanner

public class ReadingfromScanner {
    public static void main(String[] args)throws FileNotFoundException {
        File f=new File("C:\\codegnanfilehandling\\fw1");
        Scanner sc=new Scanner(f);
        while(sc.hasNext()){
            System.out.print(sc.nextLine());
        }
    }
}
