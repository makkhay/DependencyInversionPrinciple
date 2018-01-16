package MyPack;

/**
 * Created by makkhay on 1/15/18.
 *
 * Database is an interface to connect MySqlDatabase and OracleDatabase with DataBasehandler
 *
 */
public interface Database {
    void connect();
    void disconnect();



}
