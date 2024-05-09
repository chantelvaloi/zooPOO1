/* >Recebendo o código do show ou o nome do show, visualizar que animal faz parte do show (nome e espécie), visualizar também o horário
 *  do show;
 * 
 */
import java.util.Vector;

public class PesquisarShow {
	
	public PesquisarShow() {}
	
	/*
	public void pesquisarShow(Vector vc, int codeShow, String nameShow) {
		Shows s;
		boolean found = false;
		
		for(int p = 0; p < vc.size(); p++) {
			s = (Shows)vc.elementAt(p);
			if(s.getCodeShow() == codeShow) {
				found = true;
				System.out.println(vc.elementAt(p));
			}else {
				if(s.getNomeShow().equalsIgnoreCase(nameShow)) {
					found = true;
					System.out.println(vc.elementAt(p));
				}
			}
		}
	}
	*/
	
	public int pesquisarShows(Vector vc, int codeShow, String nameShow) {
		int ind = -1;
		Shows s;
		boolean found = false;
		
		for(int i = 0; i < vc.size() && found == false; i++) {
			s = (Shows)vc.elementAt(i);
			if(s.getCodeShow() == codeShow || s.getNomeShow().equalsIgnoreCase(nameShow)) {
				found = true;
				ind = i;
			}
		}
		return ind;
	}

}
