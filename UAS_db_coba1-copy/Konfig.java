import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class lebah here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author ACER
 */
public class Konfig {
    
    private static Connection MySQLConfig;
    
    public static Connection configDB()throws SQLException{
        //try-catch penanganan error apabila driver tidak ditemukan statement
        try{
            String url = "jdbc:mysql://localhost:3306/uasalgo";
            String user = "root";
            String pass = "";
            
            //register driver
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            //koneksi databasenya 
            MySQLConfig = DriverManager.getConnection(url,user,pass);
        }catch(SQLException e) {
            System.out.println("Koneksi ke database gagal " + e.getMessage());
        }
        
        return MySQLConfig;
    }
    
}


