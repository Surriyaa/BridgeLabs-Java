package designpatterns.creation;

interface Socket{
    void plugin();
}
// Adaptee class (existing old socket)
class OldSocket{
    
    public void connect(){
        System.out.println("Connecting using 2 pin adapter");
    }
}
// Adapter class that makes OldSocket compatible with the Socket interface
class SocketAdapter implements Socket{
   private OldSocket oldSocket;
   public SocketAdapter(OldSocket oldSocket) {
        this.oldSocket=oldSocket;  
   }
   @Override
   public void plugin(){
    oldSocket.connect();
   }
}
class ModernAppliances {
    private Socket socket;
    public ModernAppliances(Socket socket){
        this.socket=socket;
    }

    void  use(){
        System.out.println("Using the Appliance....");
        socket.plugin();
    }
}
public class Main{
    public static void main(String[] args) {
    // Existing OldSocket instance
    OldSocket oldSocket=new OldSocket();
    // Adapter to make OldSocket compatible with ModernAppliance
    Socket adapter =new SocketAdapter(oldSocket);
     // Modern appliance uses the adapter
    ModernAppliances appliance=new ModernAppliances(adapter);
        appliance.use();
        System.out.println("OldSocket created: " + oldSocket);
        System.out.println("Adapter created: " + adapter);
        System.out.println("ModernAppliance created: " + appliance);

    }
}
