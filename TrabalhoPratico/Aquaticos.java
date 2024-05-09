/*e os aquáticos podem-se subdividir em três: reptéis, peixes e anfíbios. Os peixes são caracterizados  pela cor, os répteis pela forma 
 * de locumução, os anfíbios pelo tipo de pele
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
