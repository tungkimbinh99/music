package Base;

import java.sql.Connection;
import java.sql.DriverManager;

public class DAO {
    public Connection con;

    public DAO() {
        if (con == null){
            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//                Class.forName("com.mysql.jdbc.Driver");--bo
//                Class.forName("com.mysql.cj.jdbc.Driver");

                String url ="jdbc:sqlserver://localhost;databaseName=MusicDB;user=sa;password=123456";
//                String url ="jdbc:mysql://45.122.220.169:3306/apphostv_appme";
                System.out.println("oke");
                con = DriverManager.getConnection(url);
//                con = DriverManager.getConnection(url,"apphostv_admin","1qazXSW@#edc");

                System.out.println("connect thanh cong");

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
