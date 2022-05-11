package day23;

import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
//socket可以使一个应用从网络中读取和写入数据，
//不同计算机上的两个应用可以通过连接发送和接受字节流，
//当发送消息时，你需要知道对方的ip和端口，在java中，
// socket指的是java.net.Socket类。
//ServerSocket与Socket不同，ServerSocket是等待客户端的请求，一旦获得一个连接请求，就创建一个Socket示例来与客户端进行通信。
public class TCPtest01 {
    @Test
    public void client() {
        Socket socket = null;
        OutputStream os = null;
        OutputStreamWriter osw = null;
        try {
            InetAddress inetAddress = InetAddress.getByName("127.0.0.1");//定义IP地址
            socket = new Socket(inetAddress, 8899);//定义套接字
            os = socket.getOutputStream();//通过套接字获取输出流
            osw = new OutputStreamWriter(os);//转化流，防止出现乱码
            osw.write("朱文武1413");//给出输出内容
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                osw.close();//关闭输出流
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                socket.close();//关闭套接字
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void server() {

        Socket socket = null;//处理这次连接
        InputStreamReader isr = null;
        try {
            ServerSocket serverSocket = new ServerSocket(8899);//定义监视线程
            socket = serverSocket.accept();
            InputStream is = socket.getInputStream();//通过套接字获取输入流
            isr = new InputStreamReader(is);
            char[] cbuf = new char[5];
            int len;
            while ((len = isr.read(cbuf)) != -1) {
                String str = new String(cbuf, 0, len);
                System.out.print(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                isr.close();
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
//执行先开启服务器端监听，然后开启客户端。