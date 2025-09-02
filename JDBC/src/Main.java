import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class Main {

    // OUR FIRST CONNECTION

    static String userName = "root";
    static String password = "samed6583";
    static String dbUrl = "jdbc:mysql://localhost:3306/world";
    public static void main(String[] args) throws SQLException {
        Connection connection = null;

        try{
            connection = DriverManager.getConnection(dbUrl,userName,password);
            System.out.println("Connection established.");
        } catch(SQLException exception){
            System.out.println(exception.getMessage());
        }
        finally {
            connection.close();
        }
    }
}