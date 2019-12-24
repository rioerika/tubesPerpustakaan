/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ac.psi.model.data;

import id.ac.psi.model.pojo.Anggota;
import id.ac.psi.utilities.ConnectionDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author RioErika
 */
public class AnggotaModel {
    public int save(Anggota anggota) throws SQLException{
        Connection con = ConnectionDB.getConnection();
        try{
            PreparedStatement stat = con.prepareStatement("INSERT INTO tbl_anggota values (?,?,?,?)");
            stat.setString(1, anggota.getNrp());
            stat.setString(2, anggota.getNama());
            stat.setString(3, anggota.getEmail());
            stat.setString(4, anggota.getJurusan());
            return stat.executeUpdate();
        }finally{
            if (con !=null){
                con.close();
            }
            
        }
    }

    
    public List<Anggota> loadAnggota() throws SQLException{
    List<Anggota> anggotaList;
    Connection con = ConnectionDB.getConnection();
    try{
        Statement state = con.createStatement();
        ResultSet rs = state.executeQuery("SELECT * FROM tbl_anggota");
        anggotaList = new ArrayList<>();
        while (rs.next()){
            Anggota anggota = new Anggota();
            anggota.setNama(rs.getString("nama"));
            anggota.setNrp(rs.getString("nrp"));
            anggota.setEmail(rs.getString("email"));
        
            anggotaList.add(anggota);
        }
    
    }finally{
       if (con !=null){
        con.close();
       }
    } 
       return anggotaList;
    }
        
    
      public int update(Anggota anggota) throws SQLException {
         Connection con = ConnectionDB.getConnection();
        try{
            PreparedStatement stat = con.prepareStatement("UPDATE mahasiswa SET nama = ?, email = ?, jurusan = ? WHERE id = ?");
            stat.setString(1, anggota.getNama());
            stat.setString(2, anggota.getEmail());
            stat.setString(3, anggota.getJurusan());
//            stat.setInt(4, anggota.getId());
            return stat.executeUpdate();
        }finally{
            if (con !=null){
                con.close();
            }
            
        }
    }
    
}
