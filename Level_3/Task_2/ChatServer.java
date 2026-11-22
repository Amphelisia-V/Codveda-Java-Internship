package Level_3.Task_2;
import java.net.*;//ServerSocket,Socket
import java.io.*;//Input/output stream
import java.util.*;//ArrayList
public class ChatServer {
     static ArrayList<ClientHandler> clientHandlers=new ArrayList<>();//store all client handlers
    public static void main(String[] args) throws IOException
    {
        // start server socket
        ServerSocket serverSocket= new ServerSocket(5000);//client ဝင်လာတာကို စောင့်တဲ့ server
        System.out.println("Server is running and waiting for client connection...");
        while(true)
        {
        // accept client connection
        Socket clientSocket= serverSocket.accept();
        System.out.println("Client connected:"+ clientSocket.getInetAddress().getCanonicalHostName());

        ClientHandler clientHandler= new ClientHandler(clientSocket);
        clientHandlers.add(clientHandler);
        clientHandler.start();//start() method က run() method ကို call လုပ်ပေး
        }

       
    }
    public static void broadcastMessage(String message)
    {
        for(ClientHandler clientHandler: clientHandlers)
        {
            try{
                clientHandler.sendMessage(message);
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
