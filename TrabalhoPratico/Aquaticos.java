/*e os aqu�ticos podem-se subdividir em tr�s: rept�is, peixes e anf�bios. Os peixes s�o caracterizados  pela cor, os r�pteis pela forma 
 * de locumu��o, os anf�bios pelo tipo de pele
 */
public class Aquaticos extends Animais{
	
	public Aquaticos(int codigo, String nome, String especie, String ambiente, float peso, int idade, char sexo) {
		super(codigo, nome, especie, ambiente, peso, idade, sexo);
		
	}
	
	public Aquaticos() {
		this((int)0, "", "", "", 0, (int)0, ' ');
	}

	
	public String toString() {
		return super.toString();
	}

}
