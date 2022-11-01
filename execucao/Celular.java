package execucao;

//1) Crie dentro de uma Classe a abstração de um celular com todos os seus atributos e exiba os seus atributos.

public class Celular {
	
	int tela = 6;
	String modelo = "Samsung galaxy s21";
	int anoFabricacao = 2022;
	String sistema = "ios";
	String marca = "Samsung";
	
	
	public static void main(String[] args) {
		Celular modelo1 = new Celular();
		
		System.out.println("modelo: " + modelo1.tela);
		System.out.println("tela: " + modelo1.modelo);
		System.out.println("ano de fabricação: " + modelo1.anoFabricacao);
		System.out.println("sistema: " + modelo1.sistema);
		System.out.println("marca: " + modelo1.marca);

	}

}
