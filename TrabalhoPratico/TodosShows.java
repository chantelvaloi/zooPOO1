/*Atributos:
 * >>Codigo do show; int
 * >>Codigo do animal; int
 * >>Nome do show; String
 * >>Nome do animal; String
 * >>Hora do show; float
 * >>Valor; float
 * 
 */
import java.io.*;
import java.text.DecimalFormat;
import java.util.*;

public class TodosShows {

	private Vector vc;
	
	public TodosShows() {
		vc = new Vector();
	}
	
	public void lerFicheiroShow() {
		int codeShow, codeAni;
		String nomeShow, nomeAni, umaLinha;
		float hShow, valor;
		char criterioG;
		StringTokenizer str;
	
		try {
			BufferedReader bf = new BufferedReader(new FileReader("TodosDados.txt"));
			umaLinha = bf.readLine();
			
			while(umaLinha != null) {
				str = new StringTokenizer(umaLinha, ";");
				criterioG = (str.nextToken()).charAt(0);
				if(criterioG == 'S' || criterioG == 's') {
					codeShow = Integer.parseInt(str.nextToken());
					codeAni = Integer.parseInt(str.nextToken());
					nomeShow = str.nextToken();
					nomeAni = str.nextToken();
					hShow = Float.parseFloat(str.nextToken());
					valor = Float.parseFloat(str.nextToken());
					
					Shows s = new Shows();
					s.setCodeShow(codeShow);
					s.setCodeAni(codeAni);
					s.setNomeShow(nomeShow);
					s.setNomeAni(nomeAni);
					s.setHShow(hShow);
					s.setValor(valor);
					vc.addElement(s);
					vc.trimToSize();
				}
				
				umaLinha = bf.readLine();
			}
			bf.close();
		}catch(FileNotFoundException f) {
			System.out.println("Ficheiro nao encotrado#.");
		}catch(NumberFormatException n) {
			System.out.println(n.getMessage());
		}catch(IOException i) {
			i.printStackTrace();
		}
	}
	
	//visualizacao de todos os dados
	public void visuShows() {
		VisualizacoesGeral vg = new VisualizacoesGeral();
		vg.visuShows(vc);
	}
	
	/*pesquisar Show consoante o codigo ou nome
	public void adaptPesquisaShow(int codeShow, String nomeShow) {
		PesquisarShow ps = new PesquisarShow();
		ps.pesquisarShow(vc, codeShow, nomeShow);
	}
	
	pesquisar Show
	 * public void adaptPesquisarBilheteCodigo(String cod) 
	{
		Pesquisas p = new Pesquisas();
		int i = p.pesquisarBilhetePorCodigo(bilhetes, cod);
		
		if(i>=0)
			System.out.println(bilhetes.elementAt(i));
		else
			System.out.println("Bilhete nao foi encontrado!");
	}
	 */
	public void adaptPesquisarShows(int codeShow, String nomeShow) {
		PesquisarShow ps = new PesquisarShow();
		int ind = ps.pesquisarShows(vc, codeShow, nomeShow);
		
		if(ind >= 0) {
			System.out.println(vc.elementAt(ind));
		}else {
			System.out.println("Show nao encontrado");
		}
	}
	
	//adaptador do calculo do valor total obtido pelos shows
	public void adaptValorTotalShow() {
		Calculos c = new Calculos();
		DecimalFormat df = new DecimalFormat("###,###,##0.00 MT");
		
		float val =  c.valorTotalShows(vc);
		System.out.println("O valor total obtido pelos shows: "+df.format(val));
	}
	
	//adaptador para visualizar o animal que mais rendeu
	public void adaptAnimalProfit() {
		VisualizacoesGeral vg = new VisualizacoesGeral();
		vg.visuAnimalProfit(vc);
	}
	
	//adaptador para alteracao
	public void adaptAlteracao(int codeShow, String nomeShow, int codeAni, String nomeAni) {
		Alteracoes a = new Alteracoes();
		a.alterarCodigo(vc, codeShow, nomeShow, nomeAni, codeAni);
	}
	
	//adaptador para escrever no ficheiro de objecto
	public void adaptEscFichShow() {
		FicheiroObjecto fo = new FicheiroObjecto();
		fo.escreverFichObj(vc);
	}
		
	//adaptador para ler no ficheiro de objecto
	public void adaptLerFichShow() {
		FicheiroObjecto fo = new FicheiroObjecto();
		fo.lerFichObj(vc);
	}

	public Vector getVs() {
		return vc;
	}	
}
