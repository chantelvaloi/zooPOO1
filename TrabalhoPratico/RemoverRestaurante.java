//>Remover um Restaurante pelo nome;
import java.util.Vector;

public class RemoverRestaurante {
	
	public RemoverRestaurante() {}
	
	public Vector removeRestaurante(Vector vc, String nome) {
		Restaurantes r;
		boolean found = false;
		
		for(int x = 0; x < vc.size(); x++) {
			r = (Restaurantes)vc.elementAt(x);
			if(r.getNomeRes().equalsIgnoreCase(nome)) {
				found = true;
				vc.remove(x);
			}
		}
		return vc;
	}

}
