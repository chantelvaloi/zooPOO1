//os répteis pela forma de locumução
public final class Repteis extends Aquaticos{
	private String locum;
	public static int contR = 0;
	
	public Repteis(int codigo, String nome, String especie, String ambiente, float peso, int idade, char sexo, String locum) {
		super(codigo, nome, especie, ambiente, peso, idade, sexo);
		this.locum = locum;
		contR++;
	}
	
	public Repteis() {
		this((int)0, "", "", "", 0, (int)0, ' ',"");
	}
	
	public String getLocum() {
		return locum;
	}
	
	public void setLocum(String locum) {
		this.locum = locum;
	}
	
	public String toString() {
		return super.toString()+"\nLocumucao: "+locum;
	}

}
