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



            String sql = "delete from city where id = ?";
            statement = connection.prepareStatement(sql);
            statement.setInt(1,4082);

            int result = statement.executeUpdate();
            System.out.println("Query deleted");


        } catch (SQLException exception) {
            helper.showErrorMessage(exception);
        } finally {
            statement.close();
            connection.close();
        }

    }
}