package Filehandling;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class filewriterExample {
    public static void main(String[] args) throws IOException {
        FileWriter fw=new FileWriter("C:\\codegnanfilehandling\\java2.txt");
        String n="";
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<3;i++){
            System.out.print("enter "+i);
            n=sc.nextLine();
            fw.write(n.toUpperCase()+"\n");
            fw.flush();

        }

    }
}
