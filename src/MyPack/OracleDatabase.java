package MyPack;

/**
 * Created by makkhay on 1/15/18.
 */
public class OracleDatabase implements Database {
    @Override
    public void connect() {
        System.out.println("Oracledatabase is connecting");
    }

    @Override
    public void disconnect() {
        System.out.println("Oracledatabase is disconnected");
    }
}
