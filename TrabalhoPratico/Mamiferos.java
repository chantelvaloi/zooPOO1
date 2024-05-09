import java.io.*;

//Os mamíferos são caracterizados pelo numero de patas
public final class Mamiferos extends Animais implements Serializable{
	private byte nmrPatas;
	public static int contM = 0;
	
	public Mamiferos(int codigo, String nome, String especie, String ambiente, float peso, int idade, char sexo, byte nmrPatas) {
		super(codigo, nome, especie, ambiente, peso, idade, sexo);
		this.nmrPatas = nmrPatas;
		contM++;
	}
	
	public Mamiferos() {
		this((int)0, "", "","", 0, (int)0, ' ', (byte)0);
	}
	
	public byte getNmrPatas() {
		return nmrPatas;
	}
	
	public void setNmrPatas(byte nmrPatas) {
		this.nmrPatas = nmrPatas;
	}
	
	public String toString() {
		return super.toString()+"\nMamiferos- Numero de patas: "+nmrPatas;
	}
}
