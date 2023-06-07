package crud;

import java.sql.*;

public class read {

    private static Connection conn = null;

    public static void main(String[] args) throws SQLException {
        try {
            String username = "root";
            String password = "root";
            String url = "jdbc:mysql://localhost:3306/test";

            conn = DriverManager.getConnection(url, username, password);

            Statement stm = conn.createStatement();
            ResultSet rst;

            rst = stm.executeQuery("SELECT id, name, email FROM test.nameemail");

            while (rst.next()) {
                int id = rst.getInt("id");
                String name = rst.getString("name");
                String email = rst.getString("email");
                System.out.println(id + " " + name + " " + email);
            }

            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
