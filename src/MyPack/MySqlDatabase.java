package MyPack;

/**
 * Created by makkhay on 1/15/18.
 */
public class MySqlDatabase implements Database {
    @Override
    public void connect() {
        System.out.println("MySqldatabase is connected");
    }

    @Override
    public void disconnect() {
        System.out.println("MySqldatabase is disconnected");

    }
}
