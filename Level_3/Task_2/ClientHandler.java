package Level_3.Task_2;

import java.net.*;
import java.io.*;

public class ClientHandler extends Thread {

     private Socket socket;
    private PrintWriter writer;

    // this mean Server က:Client connect, Socket object,Send to ClientHandlerဖြစ်မယ်။
    //Constructor
    public  ClientHandler(Socket socket) throws IOException
    {
        this.socket=socket;
        this.writer= new PrintWriter(socket.getOutputStream(), true);
    } 
    //thread run method 
    @Override 
    public void run()
    {
        try
        {
            InputStream inputStream= socket.getInputStream();
        //Convert to Text reader
        BufferedReader reader= new BufferedReader(new InputStreamReader(inputStream));
        while(true)
        {
        //read message from client
        String message=reader.readLine();//readline() method က client ကပို့တဲ့ message ကိုဖတ်ပြီး string အနေနဲ့ return ပြန်ပေးတယ်
       
        if(message==null)
        {
            break;
        }

         System.out.println("Received message from client: " + message);
       ChatServer.broadcastMessage(message);
        
        }
        }
        catch(IOException e)
        {
            e.printStackTrace();

        }

    }
    public void sendMessage(String message)
    {
        writer.println(message);
    }
}
