/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ac.psi.controller;

import id.ac.psi.model.data.AnggotaModel;
import id.ac.psi.model.pojo.Anggota;
import java.sql.SQLException;

/**
 *
 * @author RioErika
 */
public class AnggotaController {
     public int insert (Anggota anggota) throws SQLException {
        AnggotaModel model = new AnggotaModel();
        return model.save(anggota);
    }
}
