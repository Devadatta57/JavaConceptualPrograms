package Filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReadingfromScanner {
    public static void main(String[] args)throws IOException {
        File f=new File("C:\\codegnanfilehandling\\java4.txt");
        f.createNewFile();
        FileWriter fw=new FileWriter(f);
        fw.write("thxgsd sdhsd hasdsd zhjzsx ");
        fw.write("\n"+"sd hsczx cddxc shcxbsdf");
        fw.flush();
        Scanner sc=new Scanner(f);
        while(sc.hasNext()){
            System.out.print(sc.nextLine());
        }
    }
}
