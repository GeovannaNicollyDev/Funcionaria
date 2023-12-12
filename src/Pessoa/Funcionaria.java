package Pessoa;

public class Funcionaria {
	private String nome;
	private String profissao;
	private String cargo;
	

	//construtor
	public Funcionaria(String nome, String profissao, String idade) {
		this.nome = nome;
		this.profissao = profissao;
		this.cargo = idade;
	}

	//getters e setters
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getProfissao() {
		return profissao;
	}


	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	
	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}


	
}
