/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ac.psi.model.pojo;

import java.sql.Date;
import java.time.Year;

/**
 *
 * @author RioErika
 */
public class Buku {
    private int id;
    private String judulBuku;
    private String namaPengarang;
    private Year tahunTerbit;
    private int jumlahBuku;
    
    public Buku(){
        
    }
    
    public Buku(String judulBuku, String namaPengarang, Year tahunTerbit, int jumlahBuku){
        this.judulBuku = judulBuku;
        this.namaPengarang = namaPengarang;
        this.tahunTerbit = tahunTerbit;
        this.jumlahBuku = jumlahBuku;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getJudulBuku() {
        return judulBuku;
    }

    public void setJudulBuku(String judulBuku) {
        this.judulBuku = judulBuku;
    }

    public String getNamaPengarang() {
        return namaPengarang;
    }

    public void setNamaPengarang(String namaPengarang) {
        this.namaPengarang = namaPengarang;
    }

    public Date getTahunTerbit() {
        return tahunTerbit;
    }

    public void setTahunTerbit(Date tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }

    public int getJumlahBuku() {
        return jumlahBuku;
    }

    public void setJumlahBuku(int jumlahBuku) {
        this.jumlahBuku = jumlahBuku;
    }
    
    
}
