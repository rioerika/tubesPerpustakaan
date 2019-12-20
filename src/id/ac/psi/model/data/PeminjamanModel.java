/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ac.psi.model.data;

import id.ac.psi.model.pojo.Buku;
import id.ac.psi.model.pojo.Peminjaman;
import id.ac.psi.utilities.ConnectionDB;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author RioErika
 */
public class PeminjamanModel {
    public List<Peminjaman> loadPeminjaman() throws SQLException{
        List<Peminjaman> listPeminjaman;
        Connection con = ConnectionDB.getConnection();
        
        try {
          Statement state = con.createStatement();
          ResultSet rs = state.executeQuery("SELECT * FROM tbl_peminjaman");
          listPeminjaman = new ArrayList<>();
            while (rs.next()) {
                Peminjaman pinjam = new Peminjaman();
                pinjam.setId(rs.getInt("idPinjam"));
//                pinjam.setAnggota();
//                pinjam.setTahunTerbit(rs.getDate("tahunTerbit"));
                
                listPeminjaman.add(pinjam);
                
            }
        } finally{
            if (con !=null){
                con.close();
            }
        } 
       return listPeminjaman;
    }
}
