import java.rmi.*;
import java.rmi.registry.*;

public class SearchServer {
    public static void main(String args[]) {
        try {
            Search obj = new SearchQuery();
            LocateRegistry.createRegistry(2019);
            Naming.rebind("rmi://localhost:2019/sister2019", obj);
            System.out.println("Server siap...");
        } catch (Exception ae) {
            System.out.println(ae);
        }
    }
}
