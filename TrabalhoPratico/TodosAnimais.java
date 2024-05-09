/*Atributos gerais de Animais:
 * >>Codigo; INT
 * >>Nome; STRING
 * >>Especie; STRING
 * >>Peso; FLOAT
 * >>Idade; INT
 * >>Sexo; CHAR
 * 
 * Os mamíferos são caracterizados pelo numero de patas BYTE
 * 
 * as aves são caracterizadas pelo tempo máximo de voo FLOAT
 * 
 * os aquáticos (String loca) podem-se subdividir em três: reptéis, peixes e anfíbios. Os peixes são caracterizados  pela cor STRING, 
 * os répteis pela forma de locumução STRING, os anfíbios pelo tipo de pele STRING
 *  
 */
import java.io.*;
import java.util.*;

public class TodosAnimais {
	private Vector vc;
	
	public TodosAnimais() {
		vc = new Vector();
	}
	
	public void lerDFicheiroAni() {
		int codigo, idade;
		String nome, especie, ambiente, cor, locum, tpPele, umaLinha;
		float peso, tempoVoo;
		char sexo, criterio1, criterio2, criterioG;
		byte nmrPatas;
		StringTokenizer str;
		
		try {
			BufferedReader bf = new BufferedReader(new FileReader("TodosDados.txt"));
			umaLinha = bf.readLine();
			
			while(umaLinha != null) {
				str = new StringTokenizer(umaLinha, ";");
				criterioG = (str.nextToken()).charAt(0);
				if(criterioG == 'A' || criterioG == 'a') {
					codigo = Integer.parseInt(str.nextToken());
					nome = str.nextToken();
					especie = str.nextToken();
					ambiente = str.nextToken();
					peso = Float.parseFloat(str.nextToken());
					idade = Integer.parseInt(str.nextToken());
					sexo = (str.nextToken()).charAt(0);
					criterio1 = (str.nextToken()).charAt(0); 		//M-Mamiferos 		A-Aves		Q-Aquaticos
					
					if(criterio1 == 'M' || criterio1 == 'm') {
						nmrPatas = Byte.parseByte(str.nextToken());
						criarObjMamiferos(codigo, nome, especie, ambiente, peso, idade, sexo, nmrPatas);
					}else {
						if(criterio1 == 'V' || criterio1 == 'v') {
							tempoVoo = Float.parseFloat(str.nextToken());
							criarObjAves(codigo, nome, especie, ambiente, peso, idade, sexo, tempoVoo);
						}else {
							if(criterio1 == 'Q' || criterio1 == 'q') {
								//local = str.nextToken();
								criterio2 = (str.nextToken()).charAt(0);
								
								if(criterio2 == 'R' || criterio2 == 'r') {
									locum = str.nextToken();
									criarObjRepteis(codigo, nome, especie, ambiente, peso, idade, sexo, locum);
								}else {
									if(criterio2 == 'P' || criterio2 == 'p') {
										cor = str.nextToken();
										criarObjPeixes(codigo, nome, especie, ambiente, peso, idade, sexo, cor);
									}else {
										if(criterio2 == 'N' || criterio2 == 'n') {
											tpPele = str.nextToken();
											criarObjAnfibios(codigo, nome, especie, ambiente, peso, idade, sexo, tpPele);
										}
									}
								}
							}
						}
					}
				}
				umaLinha = bf.readLine();
			}
			bf.close();
		}catch(FileNotFoundException f) {
			System.out.println("Ficheiro nao encontrado!");
		}catch(NumberFormatException n) {
			System.out.println(n.getMessage());
		}catch(IOException i) {
			i.printStackTrace();
		}
	}
	
	public void criarObjMamiferos(int co, String no, String es, String am, float pe, int id, char se, byte nm) {
		Mamiferos m = new Mamiferos();
		m.setCodigo(co);
		m.setNomeAni(no);
		m.setEspecie(es);
		m.setAmbiente(am);
		m.setPeso(pe);
		m.setIdade(id);
		m.setSexo(se);
		m.setNmrPatas(nm);
		vc.addElement(m);
		vc.trimToSize();
	}
	
	public void criarObjAves(int co, String no, String es, String am, float pe, int id, char se, float tv) {
		Aves a = new Aves();
		a.setCodigo(co);
		a.setNomeAni(no);
		a.setEspecie(es);
		a.setAmbiente(am);
		a.setPeso(pe);
		a.setIdade(id);
		a.setSexo(se);
		a.setTempoVoo(tv);
		vc.addElement(a);
		vc.trimToSize();
	}
	
	public void criarObjRepteis(int co, String no, String es, String am, float pe, int id, char se, String lo) {
		Repteis r =  new Repteis();
		r.setCodigo(co);
		r.setNomeAni(no);
		r.setEspecie(es);
		r.setAmbiente(am);
		r.setPeso(pe);
		r.setIdade(id);
		r.setSexo(se);
		r.setLocum(lo);
		vc.addElement(r);
		vc.trimToSize();
	}
	
	public void criarObjPeixes(int co, String no, String es, String am, float pe, int id, char se, String cor) {
		Peixes p = new Peixes();
		p.setCodigo(co);
		p.setNomeAni(no);
		p.setEspecie(es);
		p.setAmbiente(am);
		p.setPeso(pe);
		p.setIdade(id);
		p.setSexo(se);
		p.setCor(cor);
		vc.addElement(p);
		vc.trimToSize();
	}
	
	public void criarObjAnfibios(int co, String no, String es, String am, float pe, int id, char se, String te) {
		Anfibios n = new Anfibios();
		n.setCodigo(co);
		n.setNomeAni(no);
		n.setEspecie(es);
		n.setAmbiente(am);
		n.setPeso(pe);
		n.setIdade(id);
		n.setSexo(se);
		n.setTipoPele(te);
		vc.addElement(n);
		vc.trimToSize();
	}
	
	//adaptador para visualizar quantidade de animais e cada especie
	public void adaptQtdEspAni() {
		int contAni = Animais.contAnimais;
		int contAves = Aves.contA;
		int contMam = Mamiferos.contM;
		int contPei = Peixes.contP;
		int contRep = Repteis.contR;
		int contAnf = Anfibios.contAn;
		VisualizacoesGeral va = new VisualizacoesGeral();
		va.visuQtdAnimais(contAves, contMam, contPei, contRep, contAnf, contAni);
	}
	
	//adaptador de visualizacao dos dados
	public void adaptVisu() {
		VisualizacoesGeral va = new VisualizacoesGeral();
		va.visuAnimal(vc);
	}
	
	public void adaptFichTexto(Vector vs) {
		float va,vm, vaq;
		Calculos ca = new Calculos();
		va = ca.valAves(vs, vc); // calcular o valor total das aves
		vm = ca.valMamifero(vs, vc); // calcular o valor total dos mamiferos
		vaq = ca.valAquaticos(vs, vc); //calcular o valor total de todos aquaticos

		FicheiroTexto ft = new FicheiroTexto();
		ft.escrFichTexto(va, vm, vaq);
	}
	
	public Vector getVa() {
		return vc;
	}

	//adaptador de visualizacao dos dados separados em especie
	public void adaptVisuSeparadoAnimal() {
		VisualizacoesGeral va = new VisualizacoesGeral();
		va.visuSeparadaAnimal(vc);
	}
	
	//adaptador do animal mais antigo
	public void adaptAnimalAntigo() {
		VisualizacoesGeral vg = new VisualizacoesGeral();
		vg.visuAnimalAntigo(vc);
	}
	
	//adaptador para escrever no ficheiro de objecto
	public void adaptEscFichAni() {
		FicheiroObjecto fo = new FicheiroObjecto();
		fo.escreverFichObj(vc);
	}
		
	//adaptador para ler no ficheiro de objecto
	public void adaptLerFichAni() {
		FicheiroObjecto fo = new FicheiroObjecto();
		fo.lerFichObj(vc);
	}

}
