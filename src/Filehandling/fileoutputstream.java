package Filehandling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class fileoutputstream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos=new FileOutputStream("C:\\codegnanfilehandling\\java1.txt");
        int n=10;
        String name="";
        Scanner sc=new Scanner(System.in);
        for (int i=0;i<=10;i++){
            System.out.println("enter the line "+i);
            name=sc.nextLine();
            fos.write(name.toUpperCase().getBytes());
            fos.write("\n".getBytes());
        }


    }
}
