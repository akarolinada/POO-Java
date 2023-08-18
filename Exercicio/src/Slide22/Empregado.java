package Slide22;

public class Empregado {
	String nome;
	String sobrenome;
	double salario;
	
	public Empregado (String nome, String sobrenome, double salario) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.salario = salario;	
	}
	
	public void exibeSalario() {
		System.out.println(this.salario);
	}
	
	public void aumento() {
		salario+=(salario*0.1);
		System.out.println("Salario com aumento: " + this.salario);;
	}
	

}
