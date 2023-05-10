package networking.socket_programming;

import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        //Socket socket = new Socket("www.google.com", 80); //to connect to non-local server
        Socket socket = new Socket("localhost", 6565);

        //sending message:
        PrintWriter writer = new PrintWriter(socket.getOutputStream());
        writer.println("is it working");
        writer.flush();

        //Reading message:
        InputStreamReader reader = new InputStreamReader(socket.getInputStream());
        BufferedReader bufferedReader = new BufferedReader(reader);

        String str = bufferedReader.readLine();
        System.out.println("server: " + str);
    }
}
