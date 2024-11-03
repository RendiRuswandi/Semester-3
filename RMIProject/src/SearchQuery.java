import java.rmi.*;
import java.rmi.server.*;

public class SearchQuery extends UnicastRemoteObject implements Search {
    SearchQuery() throws RemoteException {
        super();
    }

    public String query(String search) throws RemoteException {
        String result;
        if (search.equals("Pemrograman Terdistribusi dengan Java"))
            result = "ditemukan";
        else
            result = "tidak ditemukan";

        return result;
    }
}
