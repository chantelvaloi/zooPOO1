import java.io.*;
import java.text.DecimalFormat;
/*Atributos:
 * >>Codigo do show; int
 * >>Codigo do animal; int
 * >>Nome do show; String
 * >>Nome do animal; String
 * >>Hora do show; float
 * >>Valor; float
 * 
 */
public final class Shows implements CalculosIVAFinal, Serializable{
	
	private int codeShow, codeAni;
	private String nomeShow, nomeAni;
	private float hShow, valor;
	public static int contShow = 0;
	private DecimalFormat df = new DecimalFormat("###,###,###.00 MT");
	
	public Shows(int codeShow, int codeAni, String nomeShow, String nomeAni, float hShow, float valor) {
		this.codeShow = codeShow;
		this.codeAni = codeAni;
		this.nomeShow = nomeShow;
		this.nomeAni = nomeAni;
		this.hShow = hShow;
		this.valor = valor;
		contShow++;
	}
	
	public Shows() {
		this((int)0, (int)0, "", "", 0, 0);
	}
	
	public int getCodeShow() {
		return codeShow;
	}
	
	public void setCodeShow(int codeShow) {
		this.codeShow = codeShow;
	}
	
	public int getCodeAni() {
		return codeAni;
	}
	
	public void setCodeAni(int codeAni) {
		this.codeAni = codeAni;
	}
	
	public String getNomeShow() {
		return nomeShow;
	}
	
	public void setNomeShow(String nomeShow) {
		this.nomeShow = nomeShow;
	}
	
	public String getNomeAni() {
		return nomeAni;
	}
	
	public void setNomeAni(String nomeAni) {
		this.nomeAni = nomeAni;
	}
	
	public float getHShow() {
		return hShow;
	}
	
	public void setHShow(float hShow) {
		this.hShow = hShow;
	}
	
	public float getValor() {
		return valor;
	}
	
	public void setValor(float valor) {
		this.valor = valor;
	}
	
	// e o cálculo do valor final do show deverá ser o valor total obtido pela venda dos bilhetes mais o valor do IVA.
	public float valorFinal() {
		return valor + (valor * IVA);
	}
	
	public String toString() {
		return "Show- Codigo do show: "+codeShow+"; \tCodigo do animal: "+codeAni+": \tNome do show: "+nomeShow+"; \tNome do animal: "+nomeAni+"; \tHora do show: "+hShow+"; \tValor total: "+df.format(valorFinal());
	}

}
