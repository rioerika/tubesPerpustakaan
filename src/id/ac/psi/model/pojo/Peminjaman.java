/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ac.psi.model.pojo;

import java.sql.Date;

/**
 *
 * @author RioErika
 */
public class Peminjaman {
    private int id;
    private Anggota anggota;
    private Buku buku;
    private Date tglPinjam;
    private Date tglKembali;
    private boolean status;

    
    
    public Peminjaman(){
        
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Anggota getAnggota() {
        return anggota;
    }

    public void setAnggota(Anggota anggota) {
        this.anggota = anggota;
    }

    public Buku getBuku() {
        return buku;
    }

    public void setBuku(Buku buku) {
        this.buku = buku;
    }

    public Date getTglPinjam() {
        return tglPinjam;
    }

    public void setTglPinjam(Date tglPinjam) {
        this.tglPinjam = tglPinjam;
    }

    public Date getTglKembali() {
        return tglKembali;
    }

    public void setTglKembali(Date tglKembali) {
        this.tglKembali = tglKembali;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
    
}
