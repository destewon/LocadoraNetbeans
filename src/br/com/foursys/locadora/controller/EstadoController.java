/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.foursys.locadora.controller;

import br.com.foursys.locadora.dao.EstadoDAO;
import br.com.foursys.locadora.model.Estado;
import br.com.foursys.locadora.util.ConnectionFactory;
import com.mysql.jdbc.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author amendes
 */
public class EstadoController {
    
    public List<Estado> buscarEstados(){
        Connection bd = ConnectionFactory.getConnection();		
		EstadoDAO dao = new EstadoDAO(bd);
                List<Estado> estados = null;
		try {
			estados = dao.buscarTodos();			
			bd.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Erro ao buscar o aluno!!!");
		}
                
        return estados;
    }
    
}
