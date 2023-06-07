package crud;

import java.sql.*;
import java.util.Scanner;

public class update {

    private static Connection conn = null;

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws SQLException {
        String username = "root";
        String password = "root";
        String url = "jdbc:mysql://localhost:3306/test";

        conn = DriverManager.getConnection(url, username, password);

        System.out.println("Digite o Id da pessoa que deseja alterar: ");
        int id = scan.nextInt();

        System.out.println("Digite um novo nome: ");
        String name = scan.next();

        System.out.println("Digite um novo email: ");
        String email = scan.next();

        updateData(id, name, email);
    }

    public static void updateData(int id, String name, String email) throws SQLException {
        String query = "UPDATE test.nameemail SET name = '"+name+"', email = '"+email+"' WHERE id = '"+id+"';";
        Statement stm = conn.createStatement();
        stm.executeUpdate(query);
        stm.close();
    }
}
