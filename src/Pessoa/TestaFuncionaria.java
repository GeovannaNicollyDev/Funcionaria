package Pessoa;

import java.util.Scanner;

public class TestaFuncionaria {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o nome da funcionaria: ");
		String nome = scanner.nextLine();
		
		System.out.println("Digite a profissao da funcionaria: ");
		String profissao = scanner.nextLine();
		
		System.out.println("Digite o cargo da funcionaria: ");
		String cargo = scanner.nextLine();
		
		Funcionaria funcionaria = new Funcionaria(nome, profissao, cargo);
		
		System.out.println("Dados:");
		System.out.println("Nome: " + funcionaria.getNome());
		System.out.println("Profissao: " + funcionaria.getProfissao());
		System.out.println("idade: " + funcionaria.getCargo());
		
		System.out.println("Digite o nome da dependente: ");
		String nomeDependente = scanner.nextLine();
		
		System.out.println("Digite o parentesco da dependente: ");
		String parentesco = scanner.nextLine();
		
		Dependente dependente = new Dependente(nomeDependente, parentesco);
		System.out.println("Dados:");
		System.out.println("Nome dependente: " + dependente.getNomeDependente());
		System.out.println("Parentesco: " + dependente.getParentesco());
		
		
	}

}
