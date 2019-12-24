/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ac.psi.main;

import id.ac.psi.view.MainMenuFrame;
import java.sql.SQLException;

/**
 *
 * @author RioErika
 */
public class Main {

    public static void main(String[] args) throws SQLException {
        new MainMenuFrame().setVisible(true);
    }
}
