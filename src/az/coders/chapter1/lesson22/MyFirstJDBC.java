package az.coders.chapter1.lesson22;

import java.sql.*;

public class MyFirstJDBC {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/postgres";
        String username = "postgres";
        String password = "niko1234";

        try (
                Connection connection = DriverManager.getConnection(url, username, password);
                PreparedStatement statement = connection.prepareStatement("SELECT * FROM customers WHERE id = ?")
        ) {

            int idParameter = 1;
            statement.setInt(1, idParameter); // Set the parameter value

            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                System.out.println("ID: " + id + ", Name: " + name);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
