package dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class DataBase {
    private static DataBase instance = new DataBase();
    String emailV;
    String senhaV;

    public static DataBase getInstance() {
        return instance;
    }

    public Connection initDb(){
       try{
        return DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/cinemaisdb","root","1234");
       }catch (SQLException e) {
        throw new RuntimeException(e);
        }
    }    
}

