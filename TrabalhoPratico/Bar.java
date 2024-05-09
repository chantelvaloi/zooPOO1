import java.io.*;

public final class Bar extends Restaurantes implements Serializable{
	
	private String bebida;
	public static int contBar = 0;
	
	public Bar(String nome, String tipo, float hTra, float lucro, String bebida) {
		super(nome, tipo, hTra, lucro);
		this.bebida = bebida;
		contBar++;
	}
	
	public Bar() {
		this("", "", 0, 0, "");
	}
	
	public String getBebida() {
		return bebida;
	}
	
	public void setBebida(String bebida) {
		this.bebida = bebida;
	}
	
	public String toString() {
		return super.toString()+"\nBar: Bebida especial: "+bebida;
	}

}
