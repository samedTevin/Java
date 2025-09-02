import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

    public static void main(String args[]) throws SQLException {
        Connection connection = null;
        DbHelper helper = new DbHelper();
        PreparedStatement statement = null;
        ResultSet resultSet;
        try {
            connection = helper.getConnection();
            // Normal one:
            //String sql = "update city set population = 80000,district='Düzce' where id = 4082";

            //User based :

            // ? means it will be entered by user
            String sql = "update city set population = 100000,district='Turkey' where id = ?";
            // Also we can use used based decisions on parameters like population = ? and district = ? etc.
            statement = connection.prepareStatement(sql);
            statement.setInt(1,4082);

            int result = statement.executeUpdate();
            System.out.println("Query updated");


        } catch (SQLException exception) {
            helper.showErrorMessage(exception);
        } finally {
            statement.close();
            connection.close();
        }

    }
}