import java.sql.*;
import java.util.ArrayList;

public class Main {


    public static void main(String[] args) throws SQLException {
        Connection connection = null;
        DbHelper helper = new DbHelper();
        PreparedStatement statement = null;
        ResultSet resultSet;
        try{
            connection = helper.getConnection();
            statement = connection.prepareStatement
                    ("insert into city (Name,CountryCode,District,Population) values ('Düzce', 'TUR', 'Düzce', 5000)");

            int result = statement.executeUpdate();
            System.out.println("Query added");


        } catch(SQLException exception){
            helper.showErrorMessage(exception);
        }
        finally {
            statement.close();
            connection.close();
        }

        userBasedInsert(); // We added this method to check our method's behaviour.
    }

    public static void userBasedInsert() throws SQLException{
        Connection connection = null;
        DbHelper helper = new DbHelper();
        PreparedStatement statement = null;
        ResultSet resultSet;
        try{
            connection = helper.getConnection();
            // ? means it will be entered by user
            // ? represents columns
            String sql = "insert into city (Name,CountryCode,District,Population) values (?,?,?,?)";
            statement = connection.prepareStatement(sql);

            // user based answers.
            // numbers represent the ? locations.
            statement.setString(1,"Düzce 2");
            statement.setString(2,"TUR");
            statement.setString(3,"Türkiye");
            statement.setInt(4,7000);

            int result = statement.executeUpdate();
            System.out.println("Query added");


        } catch(SQLException exception){
            helper.showErrorMessage(exception);
        }
        finally {
            statement.close();
            connection.close();
        }

    }
}