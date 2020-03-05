/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.foursys.locadora;

import br.com.foursys.locadora.view.ClienteView;
import br.com.foursys.locadora.view.MenuView;
import br.com.foursys.locadora.view.VendedorView;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author amendes
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
    for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
        if ("Nimbus".equals(info.getName())) {
            UIManager.setLookAndFeel(info.getClassName());
            break;
        }
    }
} catch (UnsupportedLookAndFeelException e) {
    // handle exception
} catch (ClassNotFoundException e) {
    // handle exception
} catch (InstantiationException e) {
    // handle exception
} catch (IllegalAccessException e) {
    // handle exception
}
        // TODO code application logic here
        //new ClienteView();
        //new VendedorView();
        new MenuView();
    }
    
}
