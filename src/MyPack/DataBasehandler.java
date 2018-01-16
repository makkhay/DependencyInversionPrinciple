package MyPack;

/**
 * Created by makkhay on 1/15/18.
 * DataBase handler is a class that handles with connecting and disconnecting.
 *
 * The constructor takes in Database class which is an interface.
 *
 */
public class DataBasehandler {

    private Database database;

    public DataBasehandler(Database database){
        this.database = database;
    }

    public void connect(){
        this.database.connect();
    }
    public void disconnect(){
        this.database.disconnect();
    }

}
