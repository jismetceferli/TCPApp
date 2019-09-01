package TCPServer;

import java.io.*;
import java.net.*;

public class TCPServer {
    public static void main(String argv[]) throws Exception {

        ServerSocket welcomeSocket = new ServerSocket(6789);
        while (true) {
            Socket connectionSocket = welcomeSocket.accept();
            InputStreamReader isr = new InputStreamReader(connectionSocket.getInputStream());

            InputStream in = connectionSocket.getInputStream();
            OutputStream output = new FileOutputStream("test.jpg");

            byte[] buffer = new byte[1024];
            int byteRead = 0;
            while((byteRead = in.read(buffer)) != -1){
                output.write(buffer,0,byteRead);
            }
            output.close();
            System.out.println("done");
        }
    }
}
