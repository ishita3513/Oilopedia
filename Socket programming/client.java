import java.net.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;

public class clien{
  public static void main(){
    Socket s=new Socket("localhost",3333);
    DataInputStream din=new DataInputStream(s.getInputStream());
    DataInputStream dout=new DataOutputStream(s.getOutputStream());
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in);
    String str1="",str2="";
    while(!str1.equals("Stop")){
      str1=br.readLine();
      dout.writeUTF(str);
      dout.flush();
      str2=din.readUTF();
      System.out.println("Server says: "+str2);
    }
    dout.close();
    s.close();}}
                                         
                                         
                                         
                                     
                                         

    
                                         
                                         
