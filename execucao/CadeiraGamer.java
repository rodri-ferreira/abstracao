package execucao;

public class CadeiraGamer {

	String marca = "topper";
	String modelo = "gamer";
	String materialEstofado = "couro";
	float alturaEncosto = 0.54f;
	float largura = 0.59f;
	float peso = 10f;

	public static void main(String[] args) {

		CadeiraGamer cadeira = new CadeiraGamer();

		System.out.println(cadeira.alturaEncosto);
		System.out.println(cadeira.largura);
		System.out.println(cadeira.marca);
		System.out.println(cadeira.materialEstofado);
		System.out.println(cadeira.modelo);
		System.out.println(cadeira.peso);

	}

}
