package javaSockets;
import java.io.*;
import java.net.*;

public class Client {
	public static void main(String[] args) throws IOException {
	Socket s=new Socket("localhost" ,6666);
	DataInputStream din=new DataInputStream (s.getInputStream());
	DataOutputStream dout=new DataOutputStream(s.getOutputStream());
	
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

	String msgin="",msgout="";
	
	while(!msgin.equals("end")) {
		 msgout=br.readLine();
	     dout.writeUTF(msgout);
		 msgin=din.readUTF();
		 System.out.println(msgin); 
	}
	
	s.close();
 }
}
