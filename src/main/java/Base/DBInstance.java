/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Base;
public class DBInstance {
    public static DBConnection DatabaseBConnection;
    public static void Init(){
        DatabaseBConnection = new DBConnection();
        DatabaseBConnection.connect("jdbc:sqlserver://localhost;databaseName=banhangDB;user=sa;password=123456");
    }
}
