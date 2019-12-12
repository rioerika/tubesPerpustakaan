/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ac.psi.utilities;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author RioErika
 */
public class ConnectionDB {
     public static Connection getConnection() {
        return getConnection("jdbc:mysql://localhost/db_perpustakaan", "root", "");
    }
     
      private static Connection getConnection(String url, String user, String pass) {
        Connection con = null;
          try {
             Class.forName("com.mysql.jdbc.Driver");
             con = DriverManager.getConnection(url, user, pass); 
          } catch (Exception e) {
              System.err.println(e.getMessage());
          }
          return con;
      }
}
