package az.coders.chapter1.lesson23;

import java.sql.*;

public class FirstProblem {
    public static void main(String[] args) {
        int a = 1000;
        int b = 2000;
        String url = "jdbc:postgresql://localhost:5432/postgres";
        String username = "postgres";
        String password = "niko1234";
        try(
                Connection connection = DriverManager.getConnection(url, username, password);
                CallableStatement statement = connection.prepareCall("{? = call  get_count(?,?)}");
                CallableStatement statementProcedure = connection.prepareCall("call swap(?,?,?,?)");


        ) {
            //first
            statement.registerOutParameter(1, Types.INTEGER);
            statement.setInt(2,a);
            statement.setInt(3,b);
            //            ResultSet rs = statement.executeQuery();
            //            int res = rs.getInt(1);
            //            System.out.println(res);
            statement.execute();
            System.out.println("Employees those salaries are between " + a + " and " + b + " is : "+statement.getInt(1));

            //second

            statementProcedure.setInt(1,10);
            statementProcedure.setInt(2,20);
            statementProcedure.registerOutParameter(3,Types.INTEGER);
            statementProcedure.registerOutParameter(4,Types.INTEGER);
            statementProcedure.execute();
            System.out.println(statementProcedure.getInt(3) + " and " + statementProcedure.getInt(4));



        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}