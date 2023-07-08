package az.coders.chapter1.lesson22;

import java.sql.*;

public class FirstProblem {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/postgres";
        String username = "postgres";
        String password = "niko1234";

        try (
                Connection connection = DriverManager.getConnection(url, username, password);
                PreparedStatement preparedStatement = connection.prepareStatement("" +
                        "CREATE TABLE students (" +
                        "  id SERIAL PRIMARY KEY,\n" +
                        "  first_name VARCHAR(50),\n" +
                        "  last_name VARCHAR(50),\n" +
                        "  profession VARCHAR(50)\n" +
                        ");");
                PreparedStatement psUpdate = connection.prepareStatement("insert into students(first_name,last_name,profession) values(?,?,?)");
                PreparedStatement psDelete = connection.prepareStatement("delete from students where id = ?");
                PreparedStatement psSelect = connection.prepareStatement("SELECT * from students")
        ) {




            psUpdate.setString(1,"Nihat");
            psUpdate.setString(2,"Babayev");
            psUpdate.setString(3,"Java developer");
            psUpdate.executeUpdate();

            psUpdate.setString(1,"Murad");
            psUpdate.setString(2,"Baghirli");
            psUpdate.setString(3,"ML engineer");
            psUpdate.executeUpdate();


            ResultSet resultSet = psSelect.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("first_name");
                String surname = resultSet.getString("last_name");
                String profession = resultSet.getString("profession");

                System.out.println("ID: " + id + ", Name: " + name+ ", surname: " + surname+ ", profession: " + profession);
            }

            psDelete.setInt(1,2);
            int resultDelete = psDelete.executeUpdate();
            System.out.println(resultDelete);


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
