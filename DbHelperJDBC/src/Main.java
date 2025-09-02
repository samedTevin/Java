import java.sql.Connection;
import java.sql.SQLException;

public class Main {


    public static void main(String[] args) throws SQLException {
        Connection connection = null;
        DbHelper helper = new DbHelper();
        try{
            connection = helper.getConnection();
            System.out.println("Connection established.");
        } catch(SQLException exception){
            helper.showErrorMessage(exception);
        }
        finally {
            connection.close();
        }
    }
}