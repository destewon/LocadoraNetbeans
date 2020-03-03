/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.foursys.locadora.controller;

import javax.swing.JOptionPane;

/**
 *
 * @author amendes
 */
public class MenuController {

    public void encerrar() {
        int opcao = JOptionPane.showConfirmDialog(null, "Confirma fechar o programa?", "Atenção",
                JOptionPane.YES_OPTION,
                JOptionPane.CANCEL_OPTION);
        if (opcao == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }
}
