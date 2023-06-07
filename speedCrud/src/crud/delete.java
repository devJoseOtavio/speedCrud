package crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class delete {

    private static Connection conn = null;

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] ars) throws SQLException {
        String username = "root";
        String password = "root";
        String url = "jdbc:mysql://localhost:3306/test";

        conn = DriverManager.getConnection(url, username, password);

        System.out.println("Digite o ID a ser excluido: ");
        int id = scan.nextInt();

        deleteData(id);
    }

    private static void deleteData(int id) throws SQLException {
        String query = "DELETE FROM test.nameemail where id = '"+id+"'";

        Statement stm = conn.createStatement();
        stm.executeUpdate(query);
        stm.close();
    }
}
