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

public class ClienteDAO {
	private Connection bd;

	public ClienteDAO(Connection bd) {
		this.bd = bd;
	}


	public void inserir(Cliente cliente) throws SQLException {

		String sql = "INSERT INTO cliente(nome, logradouro, numero_logradouro, bairro, cidade, estado, telefone, cpf, rg, sexo, data_nascimento, idade) VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";

		PreparedStatement comando = bd.prepareStatement(sql);
		
		comando.setString(1, cliente.getNome());
		comando.setString(2, cliente.getLogradouro());
		comando.setInt(3, cliente.getNumeroLogradouro());
		comando.setString(4, cliente.getBairro());
		comando.setString(5, cliente.getCidade().getNome());
		comando.setString(6, cliente.getEstado().getNome()+" - "+cliente.getEstado().getUf());		
		comando.setString(7, cliente.getTelefone());
		comando.setString(8, cliente.getCpf());
		comando.setString(9, cliente.getRg());
		comando.setString(10, cliente.getSexo()+"");
		comando.setString(11, cliente.getDataNascimento());
		comando.setInt(12, cliente.getIdade());
		
		comando.execute();
	}

	public List<Cliente> buscarTodos() throws SQLException {

		String sql = "SELECT * FROM cliente ORDER BY nome";
		PreparedStatement comando = bd.prepareStatement(sql);
		ResultSet cursor = comando.executeQuery();
		List<Cliente> listCliente = new ArrayList<Cliente>();

		while (cursor.next()) {
			Cidade cidade = new Cidade();
			Cliente cliente = new Cliente();
			Estado estado = new Estado();
			//filme.setNome(cursor.getString("nome"));
			//filme.setUf(cursor.getString("uf"));
			cliente.setNome(cursor.getString("nome"));
			cliente.setLogradouro(cursor.getString("logradouro"));
			cliente.setNumeroLogradouro(cursor.getInt("numero_logradouro"));
			
			cliente.setBairro(cursor.getString("bairro"));
			//String cidade2 = cidade.getNome();
			cidade.setNome(cursor.getString("cidade"));
			cliente.setCidade(cidade);
			estado.setNome(cursor.getString("estado"));
			String estado2[] = estado.getNome().trim().split("-");
			estado.setNome(estado2[0]);
			estado.setUf(estado2[1]);
			cliente.setEstado(estado);
			cliente.setTelefone(cursor.getString("telefone"));
			cliente.setCpf(cursor.getString("cpf"));
			cliente.setRg(cursor.getString("rg"));
			cliente.setSexo(cursor.getString("sexo").charAt(0));
			cliente.setDataNascimento(cursor.getString("data_nascimento"));
			cliente.setIdade(cursor.getInt("idade"));
			
					
			
			listCliente.add(cliente);
			
		}

		return listCliente;

	}
	
	public void alterar(Cliente cliente) throws SQLException {

		String sql = "UPDATE cliente SET logradouro=?,numero_logradouro=?,bairro=?,cidade=?, estado=?, telefone=? WHERE cpf=?";

		PreparedStatement comando = bd.prepareStatement(sql);

		
		
		comando.setString(1, cliente.getLogradouro());
		comando.setInt(2, cliente.getNumeroLogradouro());
		comando.setString(3, cliente.getBairro());
		comando.setString(4, cliente.getCidade().getNome());
		comando.setString(5, cliente.getEstado().getNome());
		comando.setString(6, cliente.getTelefone());
		comando.setString(7, cliente.getCpf());
		
		
	
		comando.execute();
	}
	
	public void excluir(Cliente cliente) throws SQLException {

		String sql = "DELETE FROM cliente WHERE cpf=?";

		PreparedStatement comando = bd.prepareStatement(sql);

		comando.setString(1, cliente.getCpf());

		comando.execute();
	}
}
