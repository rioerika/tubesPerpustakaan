/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ac.psi.model.data;

import id.ac.psi.model.pojo.Buku;
import java.sql.Date;
import java.sql.SQLException;
import id.ac.psi.utilities.ConnectionDB;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.Date;
import java.sql.PreparedStatement;

/**
 *
 * @author RioErika
 */
public class BukuModel {
    public List<Buku> loadBuku() throws SQLException{
        List<Buku> listBuku;
        Connection con = ConnectionDB.getConnection();
        
        try {
          Statement state = con.createStatement();
          ResultSet rs = state.executeQuery("SELECT * FROM tbl_buku");
          listBuku = new ArrayList<>();
            while (rs.next()) {
                Buku buku = new Buku();
                buku.setId(rs.getInt("idBuku"));
                buku.setJudulBuku(rs.getString("judulBuku"));
                buku.setNamaPengarang(rs.getString("namaPengarang"));
                buku.setTahunTerbit(rs.getDate("tahunTerbit"));
                buku.setJumlahBuku(rs.getInt("jumlahBuku"));
                
                listBuku.add(buku);
                
            }
        } finally{
            if (con !=null){
                con.close();
            }
        } 
       return listBuku;
    }
    
      public int update(Buku buku) throws SQLException {
         Connection con = ConnectionDB.getConnection();
        try{
            PreparedStatement stat = con.prepareStatement("UPDATE mahasiswa SET judulBuku = ?, namaPengarang = ? WHERE idBuku = ?");
            stat.setString(1, buku.getJudulBuku());
            stat.setString(2, buku.getNamaPengarang());
            stat.setInt(3, buku.getId());
            return stat.executeUpdate();
        }finally{
            if (con !=null){
                con.close();
            }
            
        }
    }
        public static void main(String[] args) throws SQLException {
            BukuModel b = new BukuModel();
            List<Buku> listBuku = b.loadBuku();
            
            for(Buku bu  : listBuku) {
                Object[] row = new Object[4];
                System.out.println(row[0] = bu.getId());
                System.out.println(row[1] = bu.getJudulBuku());
                System.out.println(row[2] = bu.getNamaPengarang());
//                System.out.println(row[3] = bu.getTahunTerbit());
                System.out.println(row[3] = bu.getJumlahBuku());
                
                
                
            }
            
             
             
    }
    }
   

