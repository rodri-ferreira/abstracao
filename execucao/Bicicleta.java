package execucao;

public class Bicicleta {
	
	String modelo = "bmx";
	int aro = 10;
	String cor = "red";
	String TamanhoQuadro = "52 cm";
	float peso = 1.52f;
	int ano = 2019;
	String marca = "caloi";
		
	
	
	public static void main(String[] args) {
		
		Bicicleta bike = new Bicicleta();
		
		System.out.println(bike.ano);
		System.out.println(bike.aro);
		System.out.println(bike.cor);
		System.out.println(bike.marca);
		System.out.println(bike.modelo);
		System.out.println(bike.peso);
		System.out.println(bike.TamanhoQuadro);
			
	}

}
