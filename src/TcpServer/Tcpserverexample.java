package TcpServer;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Tcpserverexample {
    public static void main(String[] args)throws IOException {
        if(args.length<1){
            System.out.print("port number required");
            System.exit(0);
        }
        int port=Integer.parseInt(args[0]);
        ServerSocket serversocket=new ServerSocket(port);
        Socket s=serversocket.accept();
        InputStream is=s.getInputStream();
        int number=is.read();
        OutputStream os=s.getOutputStream();
        int fact=1;
        for(int i=1;i<=number;i++){
            fact=fact*i;
        }
        os.write(fact);
        System.out.print("output given to client");

    }
}
