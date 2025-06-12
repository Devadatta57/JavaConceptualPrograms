package TcpServer;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    public static void main(String[] args)throws IOException {
        if(args.length<1){
            System.out.print("port number should be required");
            System.exit(0);
        }
        int port=Integer.parseInt(args[0]);
        ServerSocket serversocket=new ServerSocket(port);
        Socket socket=serversocket.accept();

        InputStream read=socket.getInputStream();
        int number=read.read();
        OutputStream write=socket.getOutputStream();
        int fact=1;
        for(int i=1;i<=number;i++){
            fact=fact*i;
        }
      write.write(fact);
    }
}
