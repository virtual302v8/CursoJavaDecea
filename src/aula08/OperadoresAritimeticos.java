package aula08;

public class OperadoresAritimeticos {

	public static void main(String[] args) {
		int soma = 2 + 10;
		int subtracao = 15 - 5;
		int multiplicacao = 2 * 8;
		int divisao = 25/5;
		int modulo = 5 % 2;
		
		
		System.out.println(soma);
		System.out.println(subtracao);
		System.out.println(multiplicacao);
		System.out.println(divisao);
		System.out.println(modulo);
		
		int nota1 = 99;
		int nota2 = 80;
		int nota3 = 53;
		
		int totalGeral = nota1 + nota2 + nota3;
		System.out.println("Total geral: " + totalGeral);
		
		int mediaGeral = (nota1 + nota2 + nota3) / 3;
		System.out.println("Media geral: " + mediaGeral);

	}

}
