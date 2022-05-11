package day23;

import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPtest03 {
    @Test
    public void client() {
        Socket socket = null;
        OutputStream outputStream = null;
        FileInputStream inputStream = null;
        try {
            InetAddress inetAddress = InetAddress.getByName("127.0.0.1");
            socket = new Socket(inetAddress,8899);
            outputStream = socket.getOutputStream();
            inputStream = new FileInputStream(new File("D:\\JavaStudio\\Code\\JavaDay30\\src\\day21\\img1.png"));
            byte[] cbuf = new byte[5];
            int len;
            while((len = inputStream.read(cbuf)) != -1){
                outputStream.write(cbuf,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
    @Test
    public  void server()  {
        Socket socket = null;
        InputStream inputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            ServerSocket serverSocket = new ServerSocket(8899);
            socket = serverSocket.accept();
            inputStream = socket.getInputStream();
            fileOutputStream = new FileOutputStream(new File("D:\\JavaStudio\\Code\\JavaDay30\\src\\day23\\img1.png"));
            byte[] cbuf = new byte[5];
            int len;
            while ((len = inputStream.read(cbuf)) != -1){
                fileOutputStream.write(cbuf, 0, len);
            }
            System.out.println("发送成功");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
