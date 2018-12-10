
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Comunica {
    
    public Comunica(){
        
    }
    
    public void enviarMensagem(String ip_str, int porta, String msg_str){
        
        try {
        
            DatagramSocket conexao = new DatagramSocket();
            DatagramPacket pacote_envio;
            
            byte[] msg_envio = new byte[255]; 
            InetAddress ip = InetAddress.getByName(ip_str);
            msg_envio = msg_str.getBytes();
            pacote_envio = new DatagramPacket(msg_envio, msg_envio.length, ip, porta);
            
            conexao.send(pacote_envio);
            System.out.println("Enviando.........."+new String(pacote_envio.getData())+"  IP..."+pacote_envio.getAddress().toString()+"  Porta........."+porta);
            
            
        } catch (Exception e) {}
        
    }
}
