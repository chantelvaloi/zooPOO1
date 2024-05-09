import java.util.Vector;

public class Alteracoes {

	private PesquisarShow ps;
	
	public Alteracoes() {
		ps = new PesquisarShow();
	}
	
	// >Alterar o código do animal e o nome do animal, recebendo o código do show.
	/*public void alterarMilhas(Vector v, String cod, long milhas) 
	{
		int i = p.pesquisarBilhetePorCodigo(v, cod);
		
		if(i>=0) 
		{
			Bilhete b;
			b = (Bilhete) v.elementAt(i);
			
			if(b instanceof Aereo) 
			{
				Aereo a = (Aereo) b;
				a.setQtdMilhas(milhas);
				System.out.println("Alteracao feita com sucesso");
			}
			else
				System.out.println("O bilhete nao e aereo");
		}
		else
			System.out.println("Bilhete nao foi encontrado!");
	}
	 * 
	 */
	public void alterarCodigo(Vector vc, int codeS, String nomeS, String nomeA, int codeA) {
		int i = ps.pesquisarShows(vc, codeS, nomeS);
		
		if(i >= 0) {
			Shows s = (Shows)vc.elementAt(i);
			s.setCodeAni(codeA);
			s.setNomeAni(nomeA);
			System.out.println("Alteracao feita com sucesso.");
		}else {
			System.out.println("O codigo do animal ou nome do animal nao foi encontrado!");
		}
	}
}
