package day23;

import com.sun.jmx.snmp.InetAddressAcl;
import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPtest02 {
    @Test
    public void client(){
        Socket socket = null;
        OutputStreamWriter outputStreamWriter = null;
        try {
            InetAddress inetAddress = InetAddress.getByName("127.0.0.1");
            socket = new Socket(inetAddress,8899);
            OutputStream OutputStream = socket.getOutputStream();
            outputStreamWriter = new OutputStreamWriter(OutputStream);
            outputStreamWriter.write("天青色等烟雨，而我在等你");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                outputStreamWriter.close();
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
    public  void server(){
        Socket socket = null;
        InputStream inputStream = null;
        FileWriter fileWriter = null;
        try {
            ServerSocket serverSocket = new ServerSocket(8899);
            socket = serverSocket.accept();
            inputStream = socket.getInputStream();
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            fileWriter = new FileWriter("D:\\JavaStudio\\Code\\JavaDay30\\src\\day23\\file1.txt");
            char[] cbuf = new char[5];
            int len;
            while((len = inputStreamReader.read(cbuf)) != -1){
                fileWriter.write(cbuf, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }



    }
}
//注意客户端socket关闭应在流关闭之后