package koneksi;

import java.sql.Connection;
import java.sql.DriverManager;

public class Koneksi {

    private static Connection mysqlconfig;

    public static Connection configDB() {

        try {

            String url = "jdbc:mysql://localhost:3306/tutorialjava";
            String user = "root";
            String pass = "";

            Class.forName("com.mysql.cj.jdbc.Driver");

            mysqlconfig = DriverManager.getConnection(
                    url,
                    user,
                    pass
            );

            System.out.println("Koneksi Berhasil");

        } catch (Exception e) {

            System.out.println("Koneksi Gagal");
            System.out.println(e.getMessage());

        }

        return mysqlconfig;
    }
}