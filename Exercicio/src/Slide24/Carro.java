package Slide24;

public class Carro {
	int ano;
	boolean statusMotor = false;
	boolean movimentoCarro = false;
	
	public Carro(int ano, boolean statusMotor, boolean movimentoCarro) {
		this.ano = ano;
		this.statusMotor = statusMotor;
		this.movimentoCarro = movimentoCarro;
	}
	
	public void ligarMotor() {
		if(this.statusMotor == false) {
			this.statusMotor = true;
			System.out.println("O motor estava desligado e agora está ligado");
		} else {
			System.out.println("Não é possivel ligar o motor, pois ele já está ligado.");
		}
	}
	
	public void desligarMotor() {
		if(this.statusMotor == true) {
			this.statusMotor = false;
			System.out.println("O motor estava ligado e agora está desligado");
		} else {
			System.out.println("Não é possivel desligar o motor, pois ele já está desligado.");
		}
	}
	
	public void andar() {
		if(this.movimentoCarro == false) {
			this.movimentoCarro = true;
			System.out.println("O carro estava parado e agora está andando.");
		} else {
			System.out.println("Não é possivel andar com o carro pois ele já esta andando.");
		}
	}
	
	public void parar() {
		if(this.movimentoCarro == true) {
			this.movimentoCarro = false;
			System.out.println("O carro estava andando e agora está parado.");
		} else {
			System.out.println("Não é possível parar o carro pois ele ja está parado.");
		}
	}
	

}
