import java.util.Scanner;

public class Slide1 {

	public static void main(String[] args) {
		/*
		 * Questão 1
		 * 
		 *
		 * int num1, num2;
		 * 
		 * Scanner scanner = new Scanner(System.in);
		 * 
		 * System.out.println("Digite dois numeros"); num1 = scanner.nextInt(); num2 =
		 * scanner.nextInt();
		 * 
		 * System.out.println(num1 + num2); System.out.println(num1 - num2);
		 * System.out.println(num1 * num2); System.out.println(num1 / num2);
		 * 
		 * Questão 2
		 * 
		 * int num1, num2, num3, media;
		 * 
		 * Scanner scanner = new Scanner(System.in);
		 * 
		 * System.out.println("Digite tres numeros"); num1 = scanner.nextInt(); num2 =
		 * scanner.nextInt(); num3 = scanner.nextInt();
		 * 
		 * media = (num1+num2+num3)/3;
		 * 
		 * System.out.println(media);
		 * 
		 * Questão 3
		 * 
		 * int a = 3;
		 * 
		 * int b = 4;
		 * 
		 * boolean b1 = (a < b) && (a++ != 3);
		 * 
		 * boolean b2 = (a < b) || (a++ != 3);
		 * 
		 * boolean b3 = (++b != 4) || !(a == 4);
		 * 
		 * System.out.println(b1);
		 * 
		 * System.out.println(b2);
		 * 
		 * System.out.println(b3);
		 * 
		 * Questao 4
		 * 
		 * int a,b,c,delta;
		 * 
		 * Scanner scanner = new Scanner(System.in);
		 * 
		 * System.out.
		 * println("Digite o primeiro coeficiente da equacao de segundo grau: "); a =
		 * scanner.nextInt(); System.out.
		 * println("Digite o segundo coeficiente da equacao de segundo grau: "); b =
		 * scanner.nextInt(); System.out.
		 * println("Digite o terceiro coeficiente da equacao de segundo grau: "); c =
		 * scanner.nextInt();
		 * 
		 * delta = (b*b)-(4*a*c);
		 * 
		 * System.out.println(delta);
		 * 
		 * Questão 5
		 * 
		 * float consumo; double valorConta;
		 * 
		 * Scanner scanner = new Scanner(System.in);
		 * 
		 * System.out.println("Qual foi o consumo do mês em kw: "); consumo=
		 * scanner.nextFloat();
		 * 
		 * valorConta = consumo * 0.71;
		 * 
		 * System.out.println("R$" + valorConta);
		 * 
		 * Questao 6
		 * 
		 * double metros, pes;
		 * 
		 * Scanner scanner = new Scanner(System.in);
		 * 
		 * System.out.println("Digite uma medida em metros: "); metros =
		 * scanner.nextDouble();
		 * 
		 * pes = (metros*100)/30.48;
		 * 
		 * System.out.println(pes);
		 * 
		 * Questao 7
		 * 
		 * double camposFutebol, area;
		 * 
		 * Scanner scanner = new Scanner(System.in);
		 * 
		 * System.out.println("Digite a area em km²: "); area = scanner.nextDouble();
		 * 
		 * camposFutebol = area / 8250;
		 * 
		 * System.out.println(camposFutebol);
		 * 
		 * Questao 8
		 * 
		 * double horas, valorPorHora, salarioMes;
		 * 
		 * Scanner scanner = new Scanner(System.in);
		 * 
		 * System.out.println("Quanto voce ganha por hora?"); valorPorHora =
		 * scanner.nextDouble();
		 * 
		 * System.out.println("Quantas horas foram trabalhadas no mes?"); horas =
		 * scanner.nextDouble();
		 * 
		 * salarioMes = horas*valorPorHora;
		 * 
		 * System.out.println(salarioMes);
		 * 
		 * Questao 9
		 * 
		 * double fahrenheit, celcius;
		 * 
		 * Scanner scanner = new Scanner(System.in);
		 * 
		 * System.out.println("Temperatura em Fahrenheit: "); fahrenheit =
		 * scanner.nextDouble();
		 * 
		 * celcius = 5 * ((fahrenheit - 32)/9);
		 * 
		 * System.out.println(celcius);
		 * 
		 * Questao 10
		 * 
		 * Scanner scanner = new Scanner(System.in);
		 * 
		 * System.out.println("Digite um valor: "); double valor = scanner.nextDouble();
		 * 
		 * int[] moedas = {100,50,25,10,5,1}; int[] quantidadeMo = new
		 * int[moedas.length];
		 * 
		 * int valorCent = (int) (valor*100);
		 * 
		 * for(int i=0;i<moedas.length;i++) { quantidadeMo[i] = valorCent/moedas[i];
		 * valorCent %= moedas[i]; }
		 * 
		 * System.out.println("Moedas de R$1,00: " + quantidadeMo[0]);
		 * System.out.println("Moedas de R$0,50: " + quantidadeMo[1]);
		 * System.out.println("Moedas de R$0,25: " + quantidadeMo[2]);
		 * System.out.println("Moedas de R$0,10: " + quantidadeMo[3]);
		 * System.out.println("Moedas de R$0,05: " + quantidadeMo[4]);
		 * System.out.println("Moedas de R$0,01: " + quantidadeMo[5]);
		 * 
		 * Questão 11
		 * 
		 * Scanner scanner = new Scanner(System.in);
		 * 
		 * System.out.println("Numero: "); int num = scanner.nextInt();
		 * 
		 * 
		 * if(num > 0) { System.out.println("Positivo"); } else if (num < 0) {
		 * System.out.println("Negativo"); } else { System.out.println("Zero"); }
		 * 
		 * Questao 12
		 * 
		 * Scanner scanner = new Scanner(System.in);
		 * 
		 * System.out.println("Digite tres notas");
		 * 
		 * double nota1 = scanner.nextDouble(); double nota2 = scanner.nextDouble();
		 * double nota3 = scanner.nextDouble();
		 * 
		 * double media = (nota1+nota2+nota3)/3;
		 * 
		 * if(media >=7) { System.out.println("Aprovado"); }else {
		 * System.out.println("Reprovado"); }
		 * 
		 * Questao 13
		 * 
		 * Scanner scanner = new Scanner(System.in);
		 * 
		 * System.out.println("Ano: ");
		 * 
		 * int ano = scanner.nextInt();
		 * 
		 * if((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
		 * System.out.println("Ano bissexto"); } else {
		 * System.out.println("Não bissexto"); }
		 * 
		 * Questao 14
		 * 
		 * Scanner scanner = new Scanner(System.in);
		 * 
		 * System.out.println("Digite as tres idades: "); int idade1 =
		 * scanner.nextInt(); int idade2 = scanner.nextInt(); int idade3 =
		 * scanner.nextInt();
		 * 
		 * if((idade1 > idade2) && (idade2 > idade3)) {
		 * System.out.println("O meis velho é o 1 e o mais novo o 3"); }
		 * 
		 * if((idade2 > idade1) && (idade1 > idade3)) {
		 * System.out.println("O meis velho é o 2 e o mais novo o 3"); }
		 * 
		 * if((idade3 > idade2) && (idade2 > idade1)) {
		 * System.out.println("O mais velho é o 3 e o mais novo o 1"); }
		 * 
		 * if((idade1 > idade3) && (idade3 > idade2)) {
		 * System.out.println("O mais velho é o 1 e o mais novo o 2"); }
		 * 
		 * if((idade2 > idade3) && (idade3 > idade1)) {
		 * System.out.println("O mais velho é o 2 e o mais novo o 1"); }
		 * 
		 * if((idade3 > idade1) && (idade1 > idade2)) {
		 * System.out.println("O mais velho é o 3 e o mais novo o 2"); }
		 * 
		 * Questao 15
		 * 
		 * Scanner scanner = new Scanner(System.in);
		 * 
		 * System.out.println("Digite 10 numeros: ");
		 * 
		 * int[] num = new int[10];
		 * 
		 * num[0] = scanner.nextInt(); num[1] = scanner.nextInt(); num[2] =
		 * scanner.nextInt(); num[3] = scanner.nextInt(); num[4] = scanner.nextInt();
		 * num[5] = scanner.nextInt(); num[6] = scanner.nextInt(); num[7] =
		 * scanner.nextInt(); num[8] = scanner.nextInt(); num[9] = scanner.nextInt();
		 * 
		 * 
		 * 
		 * for(int i = 0; i < num.length; i++) { if(num[i] % 2 == 0) {
		 * System.out.println(num[i] + " é par"); } else { System.out.println(num[i] +
		 * " é ímpar"); } }
		 * 
		 * Questao 16
		 * 
		 * Scanner scanner = new Scanner(System.in);
		 * 
		 * System.out.println("Digite um numero entre 0 e 1000: "); int num =
		 * scanner.nextInt();
		 * 
		 * if((0 < num) && (num < 1000)) { int centenas = num / 100; int dezenas = (num
		 * % 100)/10; int unidades = num % 10;
		 * 
		 * System.out.println("Centenas: " + centenas); System.out.println("Desenas: " +
		 * dezenas); System.out.println("Unidades: " + unidades); } else {
		 * System.out.println("O numero não é válido"); }
		 * 
		 * Questao 17
		

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite uma nota de 0 a 10: ");
		int nota = scanner.nextInt();

		while (nota < 0 && nota > 10) {
			System.out.println("Nota inválida!");

			System.out.println("Digite uma nota de 0 a 10: ");
			nota = scanner.nextInt();
		}
		
   Questao 18 
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		int num = scanner.nextInt();
		
		long fatorial = 1;
		
		for(int i = 1; i <= num; i++) {
			
			fatorial *= i;
		}
		
		System.out.println("O fatorial é " + fatorial);
		
  Questao 19
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int num = scanner.nextInt();
		
		int primeiro = 0, segundo = 1;
		int proximo;
		
		System.out.println("Sequencia até " + num + ": ");
		System.out.println(primeiro + " ");
		
		while(segundo <= num) {
			System.out.println(segundo + " ");
			proximo = primeiro + segundo;
			primeiro = segundo;
			segundo = proximo;
			
		}
		
   Questao 20
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um numero com três algarismos: ");
		int num = scanner.nextInt();
		
		if(num >= 100 && num <= 999) {
			int unidade = num % 10;
			int dezena = (num / 10) % 10;
			int centena = num / 100;
			
			int numeroInvertido = unidade * 100+ dezena * 10 + centena;
			
			System.out.println("Numero invertido: " + numeroInvertido);
		}else {
			System.out.println("Número invelido. Digite um numero com três algarismos.");
		}
		
   Questao 21*/
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um numero");
		int num = scanner.nextInt();
		
		boolean primo = true;
		
		if(num <= 1) {
			primo = false;
		} else {
			for (int i = 2; i <- num / 2; i++) {
				if(num % i == 0) {
					primo = false;
					break;
				}
			}
		}
		
		if(primo) {
			System.out.println(num + " é primo.");
		} else {
			System.out.println(num + " não é primo.");
		}
		
		
		
		

	}

}