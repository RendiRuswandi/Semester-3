import java.rmi.*;

public class ClientRequest {
    public static void main(String args[]) {
        String answer, value = "Pemrograman Terdistribusi dengan Java";
        try {
            Search access = (Search) Naming.lookup("rmi://localhost:2019/sister2019");
            answer = access.query(value);
            System.out.println("Artikel mengenai " + value + " " + answer + " pada server Sister2019.");
        } catch (Exception ae) {
            System.out.println(ae);
        }
    }
}