import java.io.*;
import java.net.*;
class TCPIPServer{
    public static void main(String args[]){
        try{
            final int PORT  = 900;
            ServerSocket sskt = new ServerSocket(PORT);
            System.out.println("My Server is started successfully...");
            System.out.println("Port Number: "+ sskt.getLocalPort());
            System.out.println("Waiting for client to connect...");
            sskt.setSoTimeout(5000);
            Socket skt = sskt.accept();
            System.out.println("Client is connected: "+skt);
            BufferedReader in=new BufferedReader (new InputStreamReader (skt.getInputStream()));
            BufferedReader keyboard=new BufferedReader (new InputStreamReader (System.in));
            PrintWriter out=new PrintWriter (skt.getOutputStream(), true);
            String str=null;
            do{
                str= in.readLine();
                System.out.println("from Client. "+str);
                str=keyboard.readLine();
                out.println(str);
            }
            while (!str.equalsIgnoreCase("quit"));
        }
        catch (Exception e){
            System.out.println(e);

        }
            // String ip = "192.168.157.212";
        }
    }
}