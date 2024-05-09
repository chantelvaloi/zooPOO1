import java.text.DecimalFormat;

/*Atributos gerais:
 * >>Nome; String
 * >>Tipo; String
 * >>Horario de trabalho; float
 * >>Lucro; float
 * 
 */
public class Restaurantes implements CalculosIVAFinal{
	
	protected String nome, tipo;
	protected float hTra, lucro;
	public static int contRes = 0;
	DecimalFormat df = new DecimalFormat("###,###,##0.00 MT");
	
	public Restaurantes(String nome, String tipo, float hTra, float lucro) {
		this.nome = nome;
		this.tipo = tipo;
		this.hTra = hTra;
		this.lucro = lucro;
		contRes++;
	}
	
	public Restaurantes() {
		this("", "", 0, 0);
	}
	
	public String getNomeRes() {
		return nome;
	}
	
	public void setNomeRes(String nome) {
		this.nome = nome;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public float getHTra() {
		return hTra;
	}
	
	public void setHtra(float hTra) {
		this.hTra = hTra;
	}
	
	public float getLucro() {
		return lucro;
	}
	
	public void setLucro(float lucro) {
		this.lucro = lucro;
	}
	
	//O cálculo do valor final para os Restaurantes deverá ser o lucro obtido menos o  valor do IVA
	public float valorFinal() {
		return lucro - (lucro * IVA);
	}
	
	public String toString() {
		return "Restaurante- Nome: "+nome+"; \tTipo: "+tipo+"; \tHorario de trabalho: "+hTra+"; \tLucro: "+df.format(valorFinal());
	}

}
