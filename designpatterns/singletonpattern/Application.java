package designpatterns.singletonpattern;

class Database{
    private static Database instance;
    private Database(){
        System.out.println("Connecting to the DataBase.....");
    }

    public static Database getInstance(){
        if (instance==null) {
            synchronized(Database.class){
                if(instance==null){
                    instance=new Database();
                }
            }
            
        }
        return instance;
    }
    public void queries(String sql){
        System.out.println("Executing the Query "+sql);
    }
}
public class Application{
    public static void main(String[] args) {
        Database orders=Database.getInstance();
        orders.queries("SELECT * FROM ORDERS");

        Database payment=Database.getInstance();
        payment.queries("SELECT * FROM PAYMENT");

    }
}
