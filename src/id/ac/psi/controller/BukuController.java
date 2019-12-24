/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ac.psi.controller;

import id.ac.psi.model.data.AnggotaModel;
import id.ac.psi.model.data.BukuModel;
import id.ac.psi.model.pojo.Buku;
import java.sql.SQLException;

/**
 *
 * @author RioErika
 */
public class BukuController {
     public int insert (Buku buku) throws SQLException {
        BukuModel model = new BukuModel();
        return model.save(buku);
    }
}
