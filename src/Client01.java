import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class Client01 {
    public static void main(String[] args) {
        Socket socket=null;
        OutputStream outputStream =null;
        try {
            InetAddress SERVERId = InetAddress.getByName("139.9.119.150");
            int port = 10000;
            socket = new Socket(SERVERId,port);
            outputStream = socket.getOutputStream();
            outputStream.write("你好".getBytes());

        } catch (Exception e) {
            e.printStackTrace();
        }
        if (outputStream != null){
            try {
                outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (socket != null){
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}