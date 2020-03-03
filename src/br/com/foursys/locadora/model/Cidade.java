/**
 * 
 */
package br.com.foursys.locadora.model;

/**
 * @author amendes
 *
 */
public class Cidade {

	private String nome;

	public Cidade() {
		
	}

	public Cidade(String nome) {
		super();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
        @Override
	public String toString(){
            return nome;
        }
	
}
