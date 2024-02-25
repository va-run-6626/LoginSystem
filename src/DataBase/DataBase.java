package DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBase {
    private final String url = "jdbc:mysql://localhost:3306/LOGINSYSTEM";
    private final String username = "root";
    private final String password = "varun";

    private Connection connection;

    private static DataBase database = null;

    private DataBase(){
        createConnection();
    }

    public static synchronized DataBase getInstance(){
        if(database == null){
            database = new DataBase();
        }
        return database;
    }
    private void createConnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Drivers Loaded Successfully !!");
        }catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
        try{
            this.connection = DriverManager.getConnection(url,username,password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public Connection getConnection(){
        return this.connection;
    }
}
