
/* >Lucro  total  obtido  pelos  restaurantes,  e  o  lucro  separado  por  cada  tipo  de restaurante; 
 * 
 */
import java.util.Vector;

public class Calculos {

	public Calculos() {
	}

	// >Lucro total obtido pelos restaurantes, e o lucro separado por cada tipo de
	// restaurante;

	public float valorBar(Vector vc) {
		Restaurantes r;
		CalculosIVAFinal b;
		float valor = 0;

		for (int i = 0; i < vc.size(); i++) {
			r = (Restaurantes) vc.elementAt(i);
			if (r instanceof Bar) {
				b = (CalculosIVAFinal) r;
				valor += b.valorFinal();
			}
		}
		return valor;
	}

	public float valorEsplanada(Vector vc) {
		Restaurantes r;
		Esplanada e;
		float valor = 0;

		for (int i = 0; i < vc.size(); i++) {
			r = (Restaurantes) vc.elementAt(i);
			if (r instanceof Esplanada) {
				e = (Esplanada) r;
				valor += e.valorFinal();
			}
		}
		return valor;
	}

	// >Calcular o valor total obtido pelos shows;
	public float valorTotalShows(Vector vc) {
		CalculosIVAFinal s;
		float valT = 0;

		for (int i = 0; i < vc.size(); i++) {
			s = (CalculosIVAFinal) vc.elementAt(i);
			valT += s.valorFinal();
		}
		return valT;
	}

	public float valorShowAnimal(Vector vs, int codAni) {
		CalculosIVAFinal s;
		float soma = 0;

		for (int i = 0; i < vs.size(); i++) {
			s = (CalculosIVAFinal) vs.elementAt(i);
			if (codAni == ((Shows) s).getCodeAni()) {
				soma += s.valorFinal();
			}
		}

		return soma;
	}

	public float valMamifero(Vector vs, Vector va) {
		float soma = 0;
		Animais a;
		Mamiferos m;

		for (int i = 0; i < va.size(); i++) {
			a = (Animais) va.elementAt(i);
			if (a instanceof Mamiferos) {
				m = (Mamiferos) a;

				soma += valorShowAnimal(vs, m.getCodigo());
			}
		}
		return soma;
	}

	public float valAquaticos(Vector vs, Vector va) {
		float soma = 0;
		Animais a;
		Aquaticos aq;

		for (int i = 0; i < va.size(); i++) {
			a = (Animais) va.elementAt(i);
			if (a instanceof Aquaticos) {
				aq = (Aquaticos) a;
				soma += valorShowAnimal(vs, aq.getCodigo());
			}
		}
		return soma;
	}

	public float valAves(Vector vs, Vector va) {
		float soma = 0;
		Animais a;
		Aves m;

		for (int i = 0; i < va.size(); i++) {
			a = (Animais) va.elementAt(i);
			if (a instanceof Aves) {
				m = (Aves) a;

				soma += valorShowAnimal(vs, m.getCodigo());
			}
		}
		return soma;
	}
}
