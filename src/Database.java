public class Database {

    private static Database dbobj;
    private Database(){

    }

    public static Database getInstance(){
        if (dbobj == null)
        {
                dbobj = new Database();
        }
        return dbobj;

    }

    public void getConnection(){
        System.out.println("you are now connected");
    }


}
