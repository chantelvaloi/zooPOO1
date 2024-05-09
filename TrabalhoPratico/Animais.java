/*O Jardim Zoologico de Maputo pretende um sistema para fazer a gest�o dos seus animais, restaurantes e shows que existem no recinto. 
 * Cada restaurante � caracterizado pelo nome, tipo, hor�rio de trabalho, e o lucro  obtido. Pode-se encontrar dois tipos de 
 * Restaurantes:  Bar  e  Esplanada.  O  bar  �  caracterizado   pela bebida especial, e a Esplanada pelo n�mero de lugares. No que se 
 * refere aos animais, existe um conjunto de caracter�sticas  comuns  a  todos  os animais:  c�digo,  nome,  esp�cie,  ambiente,  peso,
 * idade e sexo. Nas esp�cies, podemos encontrar mam�feros, aves e aqu�ticos. Os mam�feros s�o caracterizados pelo numero de patas, as 
 * aves s�o caracterizadas pelo tempo m�ximo de voo, e os aqu�ticos podem-se subdividir em tr�s: rept�is, peixes e anf�bios. Os peixes 
 * s�o caracterizados  pela cor, os r�pteis pela forma de locumu��o, os anf�bios pelo tipo de pele. Os shows s�o caracterizados por ter
 * o c�digo do show,c�digo do animal, o nome do show, nome do animal, a hora do show, e o valor total obtido na venda de bilhetes.
 * Fa�a um programa que leia do ficheiro de texto, com m�nimo de 20 linhas, dados sobre animais, restaurantes e shows, armazenando em 
 * um ou mais vectores, e em seguida, atrav�s de um menu amig�vel, apresente o seguinte:
 * 
 * >Calcular a quantidade de animais, por esp�cie, e a quantidade total de animais; tick
 * >Lucro  total  obtido  pelos  restaurantes,  e  o  lucro  separado  por  cada  tipo  de restaurante; TICK
 * >Visualizar todos os dados de animais, restaurantes, e shows, e separadamente por esp�cie, pelos diferentes tipos existentes. TICK
 * >Visualizar separadamente tamb�m os tipos de restaurante; TICK
 * >Recebendo o c�digo do show ou o nome do show, visualizar que animal faz parte do show (nome e esp�cie), visualizar tamb�m o hor�rio
 *  do show; Tick
 * >Calcular o valor total obtido pelos shows; TICK
 * >Remover um Restaurante pelo nome; TICK
 * >Alterar o c�digo do animal e o nome do animal, recebendo o c�digo do show.
 * >Implemente a interface Calculo contendo a taxa de IVA 17%, que ser� aplicado ao pre�o. O c�lculo do valor do IVA e do valor Final 
 *  que s� � aplicado aos Shows e aos Restaurantes. O c�lculo do valor final para os Restaurantes dever� ser o lucro obtido menos o 
 *  valor do IVA, e o c�lculo do valor final do show dever� ser o valor total obtido pela venda dos bilhetes mais o valor do IVA. TICK
 * >Visualizar qual o animal que mais rendeu em termos monet�rios no show; TICK
 * >Visualize o animal mais antigo do jardim zool�gico; TICK
 * >Escrever os dados num ficheiro de objectos, e ler do ficheiro de Objectos;
 * >Escrever no ficheiro de texto, esp�cie animal e valor total obtido por esp�cie no show.
 * 
 * 
 * Atributos gerais de Animais:
 * >>Codigo;
 * >>Nome;
 * >>Especie;
 * >>Peso;
 * >>Idade;
 * >>Sexo
 * 
 */
public class Animais {
	
	protected int codigo, idade;
	protected String nome, especie, ambiente;
	protected float peso;
	protected char sexo;
	public static int contAnimais = 0;
	
	public Animais(int codigo, String nome, String especie, String ambiente, float peso, int idade, char sexo) {
		this.codigo = codigo;
		this.nome = nome;
		this.especie = especie;
		this.ambiente = ambiente;
		this.peso = peso;
		this.idade = idade;
		this.sexo = sexo;
		contAnimais++;
	}
	
	public Animais() {
		this((int)0, "", "", "", 0, (int)0, ' ');
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public String getNomeAni() {
		return nome;
	}
	
	public void setNomeAni(String nome) {
		this.nome = nome;
	}
	
	public String getEspecie() {
		return especie;
	}
	
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	
	public String getAmbiente() {
		return ambiente;
	}
	
	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}
	
	public float getPeso() {
		return peso;
	}
	
	public void setPeso(float peso) {
		this.peso = peso;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public char getSexo() {
		return sexo;
	}
	
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
	public String toString() {
		return "Animal- Codigo: "+codigo+"\tNome: "+nome+"\tEspecie: "+especie+"\tAmbiente: "+ambiente+"; \tPeso: "+peso+"\tIdade: "+idade+"\tSexo: "+sexo;
	}
}
