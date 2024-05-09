import java.io.*;

//as aves são caracterizadas pelo tempo máximo de voo
public class Aves extends Animais implements Serializable{
	private float tempoVoo;
	public static int contA = 0;
	
	public Aves(int codigo, String nome, String especie, String ambiente, float peso, int idade, char sexo, float tempoVoo) {
		super(codigo, nome, especie, ambiente, peso, idade, sexo);
		this.tempoVoo = tempoVoo;
		contA++;
	}
	
	public Aves() {
		this((int)0, "", "", "", 0, (int)0, ' ', 0);
	}
	
	public float getTempoVoo() {
		return tempoVoo;
	}
	
	public void setTempoVoo(float tempoVoo) {
		this.tempoVoo = tempoVoo;
	}
	
	public String toString() {
		return super.toString()+"Aves- Tempo Maximo de voo: "+tempoVoo;
	}

}
