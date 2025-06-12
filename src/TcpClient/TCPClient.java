package TcpClient;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TCPClient {
    public static void main(String args[])throws IOException {
        if(args.length<2){
            System.out.print("port number and ip address required");
            System.exit(0);
        }
        String ipaddress=args[0];
        int number=Integer.parseInt(args[1]);
        Socket socket=new Socket(ipaddress,number);

        InputStream read= socket.getInputStream();
        OutputStream write=socket.getOutputStream();

        write.write(5);
        int fact=read.read();
        System.out.print("output from server "+fact);


    }
}
