package db;

import com.sun.corba.se.pept.transport.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBKasir {
    private static final String USERNAME="root";
    private static final String PASSWORD="";
    private static final String DB="uappbo";
    private static final String MYCONN="jdbc:mysql://localhost/"+DB;
    
    public static Connection getConnection(){
        Connection conn=null;
        try {
            conn=(Connection) DriverManager.getConnection(MYCONN, USERNAME, PASSWORD);
            System.out.println("Koneksi Berhasil");
        } catch (SQLException ex) {
            Logger.getLogger(DBKasir.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Koneksi Gagal");
        }
        return conn;
    }
}