/*O Jardim Zoologico de Maputo pretende um sistema para fazer a gestão dos seus animais, restaurantes e shows que existem no recinto. 
 * Cada restaurante é caracterizado pelo nome, tipo, horário de trabalho, e o lucro  obtido. Pode-se encontrar dois tipos de 
 * Restaurantes:  Bar  e  Esplanada.  O  bar  é  caracterizado   pela bebida especial, e a Esplanada pelo número de lugares. No que se 
 * refere aos animais, existe um conjunto de características  comuns  a  todos  os animais:  código,  nome,  espécie,  ambiente,  peso,
 * idade e sexo. Nas espécies, podemos encontrar mamíferos, aves e aquáticos. Os mamíferos são caracterizados pelo numero de patas, as 
 * aves são caracterizadas pelo tempo máximo de voo, e os aquáticos podem-se subdividir em três: reptéis, peixes e anfíbios. Os peixes 
 * são caracterizados  pela cor, os répteis pela forma de locumução, os anfíbios pelo tipo de pele. Os shows são caracterizados por ter
 * o código do show,código do animal, o nome do show, nome do animal, a hora do show, e o valor total obtido na venda de bilhetes.
 * Faça um programa que leia do ficheiro de texto, com mínimo de 20 linhas, dados sobre animais, restaurantes e shows, armazenando em 
 * um ou mais vectores, e em seguida, através de um menu amigável, apresente o seguinte:
 * 
 * >Calcular a quantidade de animais, por espécie, e a quantidade total de animais; tick
 * >Lucro  total  obtido  pelos  restaurantes,  e  o  lucro  separado  por  cada  tipo  de restaurante; TICK
 * >Visualizar todos os dados de animais, restaurantes, e shows, e separadamente por espécie, pelos diferentes tipos existentes. TICK
 * >Visualizar separadamente também os tipos de restaurante; TICK
 * >Recebendo o código do show ou o nome do show, visualizar que animal faz parte do show (nome e espécie), visualizar também o horário
 *  do show; Tick
 * >Calcular o valor total obtido pelos shows; TICK
 * >Remover um Restaurante pelo nome; TICK
 * >Alterar o código do animal e o nome do animal, recebendo o código do show.
 * >Implemente a interface Calculo contendo a taxa de IVA 17%, que será aplicado ao preço. O cálculo do valor do IVA e do valor Final 
 *  que só é aplicado aos Shows e aos Restaurantes. O cálculo do valor final para os Restaurantes deverá ser o lucro obtido menos o 
 *  valor do IVA, e o cálculo do valor final do show deverá ser o valor total obtido pela venda dos bilhetes mais o valor do IVA. TICK
 * >Visualizar qual o animal que mais rendeu em termos monetários no show; TICK
 * >Visualize o animal mais antigo do jardim zoológico; TICK
 * >Escrever os dados num ficheiro de objectos, e ler do ficheiro de Objectos;
 * >Escrever no ficheiro de texto, espécie animal e valor total obtido por espécie no show.
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
