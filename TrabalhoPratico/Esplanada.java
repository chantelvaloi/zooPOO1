import java.io.*;

public final class Esplanada extends Restaurantes implements Serializable{
	
	private int nmrLugares;
	public static int contEsp = 0;
	
	public Esplanada(String nome, String tipo, float hTra, float lucro, int nmrLugares) {
		super(nome, tipo, hTra, lucro);
		this.nmrLugares = nmrLugares;
		contEsp++;
	}
	
	public Esplanada() {
		this("", "", 0, 0, (int)0);
	}
	
	public int getNmrLugares() {
		return nmrLugares;
	}
	
	public void setNmrLugares(int nmrLugares) {
		this.nmrLugares = nmrLugares;
	}
	
	public String toString() {
		return super.toString()+"\nEsplanada- Numero de lugares: "+nmrLugares;
	}

}
