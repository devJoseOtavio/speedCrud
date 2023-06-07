package crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class create {

    private static Connection conn = null;

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws SQLException {
        String username = "root";
        String password = "root";
        String url = "jdbc:mysql://localhost:3306/test";

        conn = DriverManager.getConnection(url, username, password);

        System.out.println("Digite o nome que deseja adicionar: ");
        String name = scan.next();

        System.out.println("Digite o email que deseja adicionar: ");
        String email = scan.next();

        addData(name, email);
    }

    private static void addData(String name, String email) throws SQLException {
        String query = "INSERT INTO nameemail VALUES (NULL, '"+name+"','"+email+"')";

        Statement stm = null;
        stm = conn.createStatement();
        stm.executeUpdate(query);
        stm.close();
    }
}