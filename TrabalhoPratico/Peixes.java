import java.io.*;

//Os peixes são caracterizados  pela cor
public final class Peixes extends Aquaticos implements Serializable{
	private String cor;
	public static int contP = 0;
	
	public Peixes(int codigo, String nome, String especie, String ambiente, float peso, int idade, char sexo, String cor) {
		super(codigo, nome, especie, ambiente, peso, idade, sexo);
		this.cor = cor;
		contP++;
	}
	
	public Peixes() {
		this((int)0, "", "", "", 0, (int)0, ' ', "");
	}
	
	public String getCor() {
		return cor;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public String toString() {
		return super.toString()+"\nCor: "+cor;
	}

}
