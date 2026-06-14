package caburrasi.marcos.perseus;

import java.io.*;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.rmi.ServerError;
import java.util.Properties;

public class Client {
    private static String id = "";

    private static Client clientSingleton;

    private String host;
    private int port;
    private PrintWriter out;
    private String readString;
    private boolean read;

    public Client() throws IOException, UnknownHostException{
        read = false;
        readString = "";

        Properties p = new Properties();
        p.load(new FileInputStream("src/main/java/client.properties"));

        host = p.getProperty("ip");
        port = Integer.parseInt(p.getProperty("port"));

        Socket socket = new Socket();
        socket.connect(new InetSocketAddress(host, port), 1000);

        out = new PrintWriter(socket.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        System.out.println("Conectado al servidor");

        listen(in);
    }

    public void listen(BufferedReader in){
        Thread listenThread = new Thread(() -> {
            try {
                String msg;
                while ((msg = in.readLine()) != null) {
                    readString = msg;
                    read = true;
                }
            } catch (IOException e) {
                System.out.println("Conexion con el servidor terminada");
            }
        });

        listenThread.setDaemon(true);
        listenThread.start();
    }

    public String writeAndRead(String s) throws InterruptedException {
        out.println(s);

        while (!read && !s.startsWith("Add") && !s.startsWith("login")){
            Thread.sleep(500);
        }

        read = false;
        return readString;
    }

    public static Client getInstance() throws IOException {
        if (clientSingleton == null){
            clientSingleton = new Client();
        }

        return clientSingleton;
    }

    public void logIn(String username){
        id = username;
    }

    public String getId() {
        return id;
    }
}
