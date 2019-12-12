/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ac.psi.utilities;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Rio Erika Saputra
 */
public class ConnectionTest {
    public static void main(String[] args) {
        Connection con = ConnectionDB.getConnection();
        if (con != null) {
            JOptionPane.showMessageDialog(null,"Koneksi Berhasil");
        } else {
            JOptionPane.showMessageDialog(null,"Koneksi Gagal");
        }
    }
}
