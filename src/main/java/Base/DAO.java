package Base;

import java.sql.Connection;
import java.sql.DriverManager;

public class DAO {
    public Connection con;

    public DAO() {
        if (con == null){
            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                String url ="jdbc:sqlserver://localhost;databaseName=MusicDB;user=sa;password=123456";
                con = DriverManager.getConnection(url);
                System.out.println("connect thanh cong");

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
