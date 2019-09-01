package TCPClientt;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

    public class TCPClient {

        public static void pathNameAndPortName() throws IOException {
            Scanner sc = new Scanner(System.in);
            System.out.println("Zəhmət olmasa göndərmək istədiyiniz faylın yerləşdiyi keçidi qeyd edin:");
            String text = sc.nextLine();
            System.out.println("Bu şəkli göndərmək istədiyiniz şəxsin(serverin) ip və portunu daxil edin:");
            String ipAndPort = sc.nextLine();
            String arr[] = ipAndPort.split(":");
            String ip = arr[0];
            String portS = arr[1];
            int port = Integer.parseInt(portS);
            socket(text, ip, port);
        }

        public static void socket(String pathName, String ip,int port) throws IOException {

            Socket clientSocket = new Socket(ip, port);
            DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());
            byte[] bytes = readFromFile(pathName);
            outToServer.write(bytes);
            clientSocket.close();
        }

        public static  byte[] readFromFile(String filePath){
            byte[]  bytesArr = null;

            try(FileInputStream fileInputStream = new FileInputStream(filePath);) {
                File file = new File(filePath);
                bytesArr = new byte[(int) file.length()];
                fileInputStream.read(bytesArr);
            }catch(IOException e){
                e.getStackTrace();
            }
            return bytesArr;
        }
    }


