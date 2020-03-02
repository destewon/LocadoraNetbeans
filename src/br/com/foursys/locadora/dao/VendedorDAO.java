package br.com.foursys.locadora.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Connection;


import br.com.foursys.locadora.model.Cidade;
import br.com.foursys.locadora.model.Cliente;
import br.com.foursys.locadora.model.Estado;
import br.com.foursys.locadora.model.Vendedor;

public class VendedorDAO {
	private Connection bd;

	public VendedorDAO(Connection bd) {
		this.bd = bd;
	}


	public void inserir(Vendedor vendedor) throws SQLException {

		String sql = "INSERT INTO vendedor(nome, area_venda, cidade, estado,  sexo, idade,salario) VALUES(?,?,?,?,?,?,?)";

		PreparedStatement comando = bd.prepareStatement(sql);
		
		comando.setString(1, vendedor.getNome());
		comando.setString(2, vendedor.getAreaVenda());
		comando.setString(3, vendedor.getCidade().getNome());
		comando.setString(4, vendedor.getEstado().getNome()+" - "+vendedor.getEstado().getUf());	
		comando.setString(5, vendedor.getSexo()+"");		
		comando.setInt(6, vendedor.getIdade());
		comando.setDouble(7, vendedor.getSalario());
		comando.execute();
	}

	public List<Vendedor> buscarTodos() throws SQLException {

		String sql = "SELECT * FROM vendedor ORDER BY nome";
		PreparedStatement comando = bd.prepareStatement(sql);
		ResultSet cursor = comando.executeQuery();
		List<Vendedor> listVendedor = new ArrayList<Vendedor>();

		while (cursor.next()) {
			Cidade cidade = new Cidade();
			Vendedor vendedor = new Vendedor();
			Estado estado = new Estado();
			//filme.setNome(cursor.getString("nome"));
			//filme.setUf(cursor.getString("uf"));
			vendedor.setNome(cursor.getString("nome"));
			vendedor.setAreaVenda(cursor.getString("area_venda"));
			
			cidade.setNome(cursor.getString("cidade"));
			vendedor.setCidade(cidade);
			estado.setNome(cursor.getString("estado"));
			String estado2[] = estado.getNome().trim().split("-");
			estado.setNome(estado2[0]);
			estado.setUf(estado2[1]);
			vendedor.setEstado(estado);
			vendedor.setSexo(cursor.getString("sexo").charAt(0));
			
			vendedor.setIdade(cursor.getInt("idade"));
			vendedor.setSalario(cursor.getDouble("salario"));
					
			
			listVendedor.add(vendedor);
			
		}

		return listVendedor;

	}
	
	public void alterar(Vendedor vendedor) throws SQLException {

		String sql = "UPDATE vendedor SET cidade=?, estado=?, area_venda=?,salario=? WHERE nome=?";

		PreparedStatement comando = bd.prepareStatement(sql);

		comando.setString(1, vendedor.getCidade().getNome());
		comando.setString(2, vendedor.getEstado().getNome());
		comando.setString(3, vendedor.getAreaVenda());
		comando.setDouble(4, vendedor.getSalario());
		comando.setString(5, vendedor.getNome());
		comando.execute();
	}
	
	public void excluir(Vendedor vendedor) throws SQLException {

		String sql = "DELETE FROM vendedor WHERE nome=?";

		PreparedStatement comando = bd.prepareStatement(sql);

		comando.setString(1, vendedor.getNome());

		comando.execute();
	}
}
