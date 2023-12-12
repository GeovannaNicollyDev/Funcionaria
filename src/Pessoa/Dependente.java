package Pessoa;

public class Dependente {
		private String nomeDependente;
		private String parentesco;
	
		
	public Dependente(String nome, String parentesco) {
		this.nomeDependente = nome;
		this.parentesco = parentesco;
	}
	
	public String getNomeDependente() {
		return nomeDependente;
	}

	public void setNomeDependente(String nomeDependente) {
		this.nomeDependente = nomeDependente;
	}

	public String getParentesco() {
		return parentesco;
	}

	public void setParentesco(String parentesco) {
		this.parentesco = parentesco;
	}
	
	
	
}

