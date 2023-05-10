package networking.socket_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(6565);

        //waits until a client connects
        //this socket is connected to the client socket
        Socket socket = serverSocket.accept();
        //on this server, there are now two sockets
        System.out.println("client connected");

        //Reading message:
        InputStreamReader reader = new InputStreamReader(socket.getInputStream());
        BufferedReader bufferedReader = new BufferedReader(reader);

        String str = bufferedReader.readLine();
        System.out.println("client: " + str);

        //Writing message
        PrintWriter writer = new PrintWriter(socket.getOutputStream());
        writer.println("yes");
        writer.flush();

    }
}
