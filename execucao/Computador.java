package execucao;

//2) Crie dentro de uma Classe a abstração de um computador com todos os seus atributos e exiba os seus atributos.

public class Computador {

	String processador = "i1";
	String memoriaRam = "2gb";
	String armazenamento = "500gb";
	String placaDeVideo = "rtx";
	double preco = 4578.52;
	String marca = "Samsung";
	double peso = 1.2;

	public static void main(String[] args) {

		Computador novo = new Computador();

		System.out.println(novo.processador);
		System.out.println(novo.memoriaRam);
		System.out.println(novo.armazenamento);
		System.out.println(novo.placaDeVideo);
		System.out.println(novo.preco);
		System.out.println(novo.marca);
		System.out.println(novo.peso);

	}

}
