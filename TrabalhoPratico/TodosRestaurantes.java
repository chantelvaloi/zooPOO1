
/*Atributos gerais:
 * >>Nome; String
 * >>Tipo; String
 * >>Horario de trabalho; float
 * >>Lucro; float
 * 
 *  O  bar  é  caracterizado   pela bebida especial STRING, e a Esplanada pelo número de lugares INT.
 */
import java.io.*;
import java.text.DecimalFormat;
import java.util.*;

public class TodosRestaurantes {

	private Vector vc;

	public TodosRestaurantes() {
		vc = new Vector();
	}

	public void lerFicheiroRes() {
		String nome, tipoRes, bebida, umaLinha;
		float hTra, lucro;
		int nmrLugares;
		char criterio, criterioG;
		StringTokenizer str;

		try {
			BufferedReader bf = new BufferedReader(new FileReader("TodosDados.txt"));
			umaLinha = bf.readLine();

			while (umaLinha != null) {
				str = new StringTokenizer(umaLinha, ";");
				criterioG = (str.nextToken()).charAt(0);
				if (criterioG == 'R' || criterioG == 'r') {
					nome = str.nextToken();
					tipoRes = str.nextToken();
					hTra = Float.parseFloat(str.nextToken());
					lucro = Float.parseFloat(str.nextToken());
					criterio = (str.nextToken()).charAt(0);
					if (criterio == 'B' || criterio == 'b') {
						bebida = str.nextToken();
						criarObjBar(nome, tipoRes, hTra, lucro, bebida);
					} else {
						if (criterio == 'E' || criterio == 'e') {
							nmrLugares = Integer.parseInt(str.nextToken());
							criarObjEsplanada(nome, tipoRes, hTra, lucro, nmrLugares);
						}
					}
				}
				umaLinha = bf.readLine();
			}
			bf.close();
		} catch (FileNotFoundException f) {
			System.out.println("Ficheiro nao encontrado.");
		} catch (NumberFormatException n) {
			System.out.println(n.getMessage());
		} catch (IOException i) {
			i.printStackTrace();
		}
	}

	public void criarObjBar(String no, String tr, float ht, float lu, String bb) {
		Bar b = new Bar();
		b.setNomeRes(no);
		b.setTipo(tr);
		b.setHtra(ht);
		b.setLucro(lu);
		b.setBebida(bb);
		vc.addElement(b);
		vc.trimToSize();
	}

	public void criarObjEsplanada(String no, String tr, float ht, float lu, int nl) {
		Esplanada e = new Esplanada();
		e.setNomeRes(no);
		e.setTipo(tr);
		e.setHtra(ht);
		e.setLucro(lu);
		e.setNmrLugares(nl);
		vc.addElement(e);
		vc.trimToSize();
	}


	// lucro total obtido pelo bar
	public float adaptLucroBar() {
		Calculos c = new Calculos();
		return c.valorBar(vc);
	}

	// lucro total obtido pela esplanada
	public float adaptLucroEsplanada() {
		Calculos c = new Calculos();
		return c.valorEsplanada(vc);
	}

	// visualizacao de todos os dados de restaurantes
	public void visuRestaurante() {
		VisualizacoesGeral vg = new VisualizacoesGeral();
		vg.visuRestaurantes(vc);
	}

	// visualizacao de dados separados por tipo de restaurante
	public void visuSeparadoRes() {
		VisualizacoesGeral vg = new VisualizacoesGeral();
		vg.visuSeparadaRestaurante(vc);
	}

	// adaptador para remover restaurante consoante o nome
	public void adaptRemoverRes(String nome) {
		RemoverRestaurante rr = new RemoverRestaurante();
		rr.removeRestaurante(vc, nome);
	}

	// visualizacao dos dados depois da remocao
	public void visuResRemocao() {
		VisualizacoesGeral vg = new VisualizacoesGeral();
		vg.visuRestaurantes(vc);
	}

	// adaptador para escrever no ficheiro de objecto
	public void adaptEscFichRes() {
		FicheiroObjecto fo = new FicheiroObjecto();
		fo.escreverFichObj(vc);
	}

	// adaptador para ler no ficheiro de objecto
	public void adaptLerFichRes() {
		FicheiroObjecto fo = new FicheiroObjecto();
		fo.lerFichObj(vc);
	}

	public void adaptLucros() {
		DecimalFormat df = new DecimalFormat("###,###,##0.00 MT");

		float valBar = adaptLucroBar(), valEsp = adaptLucroEsplanada();
		float valRest = valBar + valEsp;

		System.out.println("O lucro total obtido pelos restaurantes: " + df.format(valRest));
		System.out.println("O lucro total obtido pelos bares: " + df.format(valBar));
		System.out.println("O lucro total obtido pelas esplanadas: " + df.format(valEsp));

	}
}
