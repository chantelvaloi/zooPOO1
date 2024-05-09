//os anfíbios pelo tipo de pele
public class Anfibios extends Aquaticos{
	private String tpPele;
	public static int contAn = 0;
	
	public Anfibios(int codigo, String nome, String especie, String ambiente, float peso, int idade, char sexo, String tpPele) {
		super(codigo, nome, especie, ambiente, peso, idade, sexo);
		this.tpPele = tpPele;
		contAn++;
	}
	
	public Anfibios() {
		this((int)0, "", "", "", 0, (int)0, ' ', "");
	}
	
	public String getTipoPele() {
		return tpPele;
	}
	
	public void setTipoPele(String tpPele) {
		this.tpPele = tpPele;
	}
	
	public String toString() {
		return super.toString()+"\nTipo de pele: "+tpPele;
	}

}
