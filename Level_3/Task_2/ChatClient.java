package Level_3.Task_2;
import java.net.*;
import java.io.*;
import java.util.*;
public class ChatClient {
    public static void main(String[] args) throws IOException
    {
        //ဒီ line က Client ကို Server နဲ့ ချိတ်ပေးတာပါ။
        Socket socket= new Socket("localhost",5000);
       OutputStream output= socket.getOutputStream();

       PrintWriter writer= new PrintWriter(output, true);
       Scanner scanner=new Scanner(System.in);

         Thread receiveThread= new Thread(new Runnable()
    {
        @Override 
        public void run()
        {
            try{
                InputStream input= socket.getInputStream();
                BufferedReader reader= new BufferedReader(new InputStreamReader(input));
                String message;
                while((message=reader.readLine())!=null)
                {
                    System.out.println("Received message from server:"+ message);

                }
            }catch(IOException e)
            {
                e.printStackTrace();
            }

        }

    });

        receiveThread.start();

       while(true)
        {
            String message=scanner.nextLine();
            writer.println(message);
        }
       
      
    }
}
