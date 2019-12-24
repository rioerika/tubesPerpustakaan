/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ac.psi.model.pojo;

/**
 *
 * @author RioErika
 */
public class Anggota {
    private String nama;
    private String nrp;
    private String email;
    private String jurusan;
    
    public Anggota(){
        
    }
    
    public Anggota ( String nrp, String nama, String email, String jurusan){
        this.nama = nama;
        this.nrp = nrp;
        this.email= email;
        this.jurusan = jurusan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNrp() {
        return nrp;
    }

    public void setNrp(String nrp) {
        this.nrp = nrp;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }
}
