package Slide22;

public class EmpregadoTeste {

	public static void main(String[] args) {
		Empregado empregado1 = new Empregado("Ana Karolina", "de MElo Paiva", 2500);
		Empregado empregado2 = new Empregado("Gabriel", "Mota", 2500);
		
		empregado1.exibeSalario();
		empregado1.aumento();
		
		empregado2.exibeSalario();
		empregado2.aumento();

	}

}
