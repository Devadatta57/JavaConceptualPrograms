package TcpClient;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TcpclientExample {
    public static void main(String[] args)throws IOException {
        if(args.length<2){
            System.out.print("ip address adn port");
            System.exit(0);
        }
        String ipaddress=args[0];
        int port=Integer.parseInt(args[1]);

        Socket socket=new Socket(ipaddress,port);
        OutputStream write=socket.getOutputStream();
        write.write(5);
        InputStream is=socket.getInputStream();
        int output=is.read();
        System.out.print("data form server "+output);
    }
}
